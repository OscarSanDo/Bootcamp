class Calculadora {
    constructor(){
        this.OPERACIONES_SOPORTADAS = "+-*/=%";
        this.acumulado = 0;
        this.operadorPendiente = '+';
    }

    getAcumulado() {
        return this.acumulado;
    }

    isOperacion(operacion) {
        return this.OPERACIONES_SOPORTADAS.includes(operacion);
    }

    calcula(operando2,nuevoOperador){
        if (!this.isOperacion(nuevoOperador)) {
            throw new Error("Operación no soportada.");
        }
        this.operando = operando2;
        switch (this.operadorPendiente) {
            case '+':
                this.acumulado = this.acumulado + Number.parseFloat(operando2);
                break;
            case '-':
                this.acumulado = this.acumulado - Number.parseFloat(operando2);
                break;
            case '*':
                this.acumulado = this.acumulado * Number.parseFloat(operando2);
                break;
            case '/':
                this.acumulado = this.acumulado / Number.parseFloat(operando2);
                break;
            case '%':
                this.acumulado = this.acumulado % Number.parseFloat(operando2);
                break;
            case '=':
                break;
            default:
                throw new Error("Operación no soportada.");
        }
        this.operadorPendiente = nuevoOperador;
        return this.getAcumulado();
    }

    static Operacion = class {
        constructor(operando, operador){
            const OPERACIONES_SOPORTADAS = "+-*/=%";
            if(!operador.include(OPERACIONES_SOPORTADAS)) throw new Error('Operador no Valido');
            if( !operando.include(',') ){                
                this.operando = Number.parseDouble(operando.replace(',','.'));
            }else{
                this.operando = operando;
            }
            this.operador = operador;
        }
        
        getOperando() {
            return this.operando;
        }
        getOperador() {
            return this.operador;
        }
    }
}

let pantalla = document.getElementById('screen');
const buttons = document.querySelectorAll("#buttons a");
const OPERACIONES_SOPORTADAS = "+-*/=%";
let resultado = false;

for (const button of buttons) {
    button.addEventListener('click', function(evento) {
        evento.preventDefault();
        //debugger;
        // if(pantalla.textContent === "" && OPERACIONES_SOPORTADAS.includes(evento.target.dataset.key) ){
        //     return;
        // }
        // if( OPERACIONES_SOPORTADAS.includes(evento.target.dataset.key) && isNaN(Number.parseFloat(pantalla.textContent)) ){
        //     return;
        // }
        if (evento.target.dataset.key == 'equal' && !OPERACIONES_SOPORTADAS.includes(pantalla.textContent.slice(-1)) ) {
            let calc = new Calculadora();
            let descomponer = pantalla.textContent.split("");
            let operando = "";
            let operandoPendiente = "";
            descomponer.forEach(elemento => {
                if(!OPERACIONES_SOPORTADAS.includes(elemento)){
                     operando = operando + elemento;
                }else{
                    operandoPendiente = elemento;
                    calc.calcula(operando, elemento);
                    operando = "";
                }
            });
            if(operandoPendiente) {
                pantalla.textContent = calc.calcula(operando, operandoPendiente);
                resultado = true;
                operando = "";
            }
        } else if (evento.target.dataset.key == 'equal' && OPERACIONES_SOPORTADAS.includes(pantalla.textContent.slice(-1)) ) {
            let calc = new Calculadora();
            let valor = pantalla.textContent.substring(0, (pantalla.textContent.length - 1)) 
            let operador = pantalla.textContent.slice(-1);
            calc.calcula(valor, operador);
            pantalla.textContent = calc.calcula(valor, operador);
            resultado = true;
        } else if (evento.target.dataset.key == 'clear') {
            pantalla.textContent = '';
        } else {
            if(resultado && !OPERACIONES_SOPORTADAS.includes( evento.target.dataset.key)) {
                pantalla.textContent = evento.target.dataset.key;
                resultado = false;
            }else {
                resultado = false;
                pantalla.textContent = pantalla.textContent + evento.target.dataset.key;
            }
        }   
    });
}