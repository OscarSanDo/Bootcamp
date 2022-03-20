

describe("test calculadora", () => {
    describe("calculadora", () => {
      beforeEach(() => {
        this.calculadora = new Calculadora();
        
        
      });
      
      describe("OK", () => {
        it("Resultados correctos", () => {
            calculadora.acumulado = 10;
            calculadora.operadorPendiente = "+";
            expect(this.calculadora.calcula("10","")).toEqual(20);
            calculadora.acumulado = 10;
            calculadora.operadorPendiente = "-";
            expect(this.calculadora.calcula("10","")).toEqual(0);
            calculadora.acumulado = 10;
            calculadora.operadorPendiente = "*";
            expect(this.calculadora.calcula("2", "")).toEqual(20);
            calculadora.acumulado = 10;
            calculadora.operadorPendiente = "/";
            expect(this.calculadora.calcula("10","")).toEqual(1);
            
        });
      });
  
      describe("KO", () => {
        it("Resultados incorrectos", () => {
            calculadora.acumulado = 10;
            calculadora.operadorPendiente = "+";
            expect(this.calculadora.calcula("10","")).not.toEqual(25);
            calculadora.acumulado = 10;
            calculadora.operadorPendiente = "-";
            expect(this.calculadora.calcula("10","")).not.toEqual(5);
            calculadora.acumulado = 10;
            calculadora.operadorPendiente = "*";
            expect(this.calculadora.calcula("2", "")).not.toEqual(40);
            calculadora.acumulado = 10;
            calculadora.operadorPendiente = "/";
            expect(this.calculadora.calcula("10","")).not.toEqual(5);
        });
      });

      describe("Error", () => {
        it("Operador incorrecto", () => {
 
            calculadora.operadorPendiente = "$";
            expect(this.calculadora.calcula("10","")).toMatch('Operación no soportada.');

        });
      });
    });
  });