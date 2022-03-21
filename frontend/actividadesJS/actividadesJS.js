

// Actividad 1

function devuelveNumeroRDM(min, max) {
    return Math. trunc((Math.random() * (max - min) + min));
  }


// let numRdm = devuelveNumeroRDM(1, 100);
// console.log(numRdm);
// alert("pulsa el boton para generar un número aleatorio");
// alert(`El número Random es ` + numRdm);


//Actividad 2


function JuegoDelNumero() {
		let intentos = 10; // variable para guardar el n�mero de intentos
		let cadUsuario;
		let numeroRandom = devuelveNumeroRDM(); // genera el numero aleatorio

		alert("Adivina el número entre 0 y 100");
		alert("Tienes 10 intentos.");
		

		do {
		cadUsuario = parseInt(prompt("Introduce un número entre 0 y 100: "));

		
			
			if (cadUsuario === numeroRandom) {
				alert("Has acertado");
				break;

			} else if (cadUsuario > numeroRandom) {
				alert("El número Random es menor, te quedan " + --intentos + " intentos: ");


			} else if (cadUsuario < numeroRandom) {
				alert("El número Random es mayor, te quedan " + --intentos + " intentos: ");
			}

		} while (intentos > 0);
		
		if (intentos == 0) {
      alert("No te quedan intentos, has perdido la partida");}
	
		}
    //Actividad 3

function dameArray (elementos, numIni) {

	var miArray = [];

	for (var i = 1; i <= elementos; i++) {
		miArray.push(numIni);
	}

	return miArray;

}



//Actividad 4
function CompruebaPrimo(numero) {

	for (var i = 2; i < numero; i++) {
  
		if (numero % i === 0) {
		return false;
		}
  
	}
  
	return numero !== 1;
}

function DameNuemerosPrimos( cantidad ){

	let n = Infinity;
	var numerosPrimos = [];

	for ( j = 1; j < n; j++) {
		if (CompruebaPrimo(j)) {			
			numerosPrimos.push(j);
			if( numerosPrimos.length === cantidad ) return numerosPrimos;
		}
	}

}

// //Actividad 5
function isDNIValido(dni) {

    let numero;
	let letra;
	const expresionDni = /^\d{1,8}[A-Z]$/;

    dni = dni.toUpperCase();

    if(expresionDni.test(dni) === true){
        numero = dni.substr(0,dni.length-1);
        let = dni.substr(dni.length-1, 1);
        numero = numero % 23;
        letra = 'TRWAGMYFPDXBNJZSQVHLCKET';
        letra = letra.substring(numero, numero+1);
        if (letra != let) {
            return false;
        }else{
            return true;
        }
    }else{
        return false;
    }
}

//Actividad 6
function esPalindromo(frase) {
	let sinEspacios = frase.replace(/ /g, '').toUpperCase();
	const fraseReversed = sinEspacios.split("").reverse().join("");
	
	return fraseReversed === sinEspacios ? "es palíndromo" : "no es palíndromo";
	
  }

//Actividad 7

// function JuegoDelNumero(){

// this.inicializar = function () {
//     this.intentos = 10;
// 	this.numeroRandom = devuelveNumeroRDM(0, 100);
// 	this.mensaje = "Pendiente de empezar";
//     this.finalizarJuego = false;
    
//   };

//   this.inicializar();



//  this.comenzarJuego = function () {
	
// 	numeroUsuario;

// 	do {
// 		numeroUsuario = parseInt(prompt("Adivina el número secreto que está entre 0 Y 100, tienes 10 intentos para acertarlo, introduce un número "));
// 			this.jugada(numeroUsuario);
// 		alert(this.getMensaje());
// 	} while (!this.getTerminado());
// }

// this.comenzarJuego;

//   this.jugada = function (num) {
// 	this.intentos --;
// 	if (num > this.numeroRandom) {
// 	this.mensaje = "El número secreto es MENOR que " + num + ", te quedan " + (this.intentos) + " intentos.";
// 		} 	
// 	else if (num < this.numeroRandom) {
// 	this.mensaje = "El número secreto es MAYOR que " + num + ", te quedan " + (this.intentos) + " intentos.";
// 		} 	
// 	else {
// 	this.mensaje = "Has acertado el número secreto, has necesitado " + (10 - (this.intentos)) + " intentos.";

// 	this.finalizarJuego = true;
// 	return;
// 		}

// if (this.intentos == 0) {
// 	this.finalizarJuego = true;
// 	this.mensaje = "No te quedan intentos, has perdido la partida. El número secreto era: " + this.numeroRandom;

// 		}
//   }

// 	this.getMensaje = function() {
//         return this.mensaje;
//     }
//     this.getTerminado = function() {
//         return this.finalizarJuego;
//     }
// 	this.getJugada = function() {
//         return 10 - this.intentos;
//     }
// }

// //Actividad 8

class JuegoDelNumeroClass {


	constructor() {
		this.inicializar();
		//this.comenzarJuego();
	}
	

	inicializar () {
		this.intentos = 10;
		this.numeroRandom = devuelveNumeroRDM(0, 100);
		this.mensaje = "Pendiente de empezar";
		this.finalizarJuego = false;
		
	}
	
	
	comenzarJuego() {

		this.numeroUsuario;
	
		do {
			this.numeroUsuario = parseInt(prompt("Adivina el número secreto que está entre 0 Y 100, tienes 10 intentos para acertarlo, introduce un número "));
				this.jugada(this.numeroUsuario);
			alert(this.getMensaje());
		} while (!this.getTerminado());
	}
	
	
	
	jugada (num) {
		this.intentos --;
		if (num > this.numeroRandom) {
		this.mensaje = "El número secreto es MENOR que " + num + ", te quedan " + (this.intentos) + " intentos.";
			} 	
		else if (num < this.numeroRandom) {
		this.mensaje = "El número secreto es MAYOR que " + num + ", te quedan " + (this.intentos) + " intentos.";
			} 	
		else {
		this.mensaje = "Has acertado el número secreto, has necesitado " + (10 - (this.intentos)) + " intentos.";
	
		this.finalizarJuego = true;
		return;
			}
	
	if (this.intentos == 0) {
		this.finalizarJuego = true;
		this.mensaje = "No te quedan intentos, has perdido la partida. El número secreto era: " + this.numeroRandom;
	
			}
	}
	
	getMensaje() {
			return this.mensaje;
		}
	getTerminado() {
			return this.finalizarJuego;
		}
	getJugada() {
			return 10 - this.intentos;
		}
	}