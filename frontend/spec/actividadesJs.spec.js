describe('Pruebas de los ejercicios', ()=> {
    describe('Ejercicio 1', ()=> {
        describe('OK', ()=> {
            it('Genera aleatorio', ()=>{
                let num = devuelveNumeroRDM(1, 100);
                expect(num).toBeGreaterThanOrEqual(1)
                expect(num).toBeLessThanOrEqual(100)
            })
        });


        // describe('KO', ()=> {
        //     it('Falta parámetro', ()=>{
        //         expect(() => devuelveNumeroRDM(1), 100).toThrow();
        //     })
        // })
    });

    describe('Ejercicio 2', ()=> {
        it('Pendiente')
    });

    describe('Ejercicio 3', ()=> {
        describe('Dame Array', ()=> {
            it('Array OK', ()=>{
                let miArray = dameArray(5, 2);
                expect(miArray.length).toEqual(5)
                expect(miArray).toEqual([2, 2, 2, 2, 2])
            })
        });

    });

    describe('Ejercicio 4', ()=> {
        describe('Es Primo', () => {
            ['2', '3', '5', '7', '11', '13', '17', '19', '23', '29'].forEach(caso => {
                it(`numPrimo: ${caso}`, ()=> expect(CompruebaPrimo(caso)).toBeTrue())
            })
        })

    describe('No es Primo', () => {
            ['4', '6', '8', '10', '12', '14', '16', '18', '20', '22'].forEach(caso => {
                it(`numPrimo: ${caso}`, ()=> expect(CompruebaPrimo(caso)).toBeFalse())
            })
        })
    });

    describe('Ejercicio 5', () => {
        describe('NIF OK', () => {
            ['12345678z', '12345678Z', '1234S', '4g'].forEach(caso => {
                it(`NIF: ${caso}`, () => expect(isDNIValido(caso)).toBeTrue())
            })
        });
    
    describe('NIF KO', () => {
            ['1234J', '12345678', 'Z', 'Z12345678'].forEach(caso => {
                it(`NIF: ${caso}`, () => expect(isDNIValido(caso)).toBeFalse())
            })
        });
    });

    describe('Ejercicio 6', ()=> {
        describe('Es Palindromo', () => {
            ['oso', 'Anita lava la tina', 'La ruta nos aporto otro paso natural'].forEach(caso => {
                it(`palindromo: ${caso}`, () => expect(esPalindromo(caso)).toMatch('es palíndromo'))
            })
        });

    describe('No es Palindromo', () => {
             ['jamon', 'el perro verde', 'no es palindromo'].forEach(caso => {
                it(`palindromo: ${caso}`, () => expect(esPalindromo(caso)).toMatch('no es palíndromo'))
            })
        });
    });
    
    describe('Ejercicio 8', ()=> {
        
        let juego;

        beforeEach(() => {
            juego = new JuegoDelNumeroClass();
            juego.inicializar();
            juego.numeroRandom = 50;
          });

        describe('inicializa', ()=> {
            it('inicializa OK', ()=>{
                expect(juego.intentos).toEqual(10)
                expect(juego.numeroRandom).toBeGreaterThanOrEqual(1)
                expect(juego.numeroRandom).toBeLessThanOrEqual(100)
                expect(juego.mensaje).toMatch('Pendiente de empezar')
                expect(juego.finalizarJueg).toBeFalse
            })
        });

        describe('jugada', ()=> {
            
            it('Acierto', ()=>{
                juego.intentos = 10;
                juego.jugada(50);
                expect(juego.mensaje).toMatch("Has acertado el número secreto, has necesitado 1 intentos.")
            })

            it('Mayor', ()=>{
                juego.intentos = 10;
                juego.jugada(49);
                expect(juego.mensaje).toMatch("El número secreto es MAYOR que 49, te quedan 9 intentos.")
            })

            it('Menor', ()=>{
                juego.intentos = 10;
                juego.jugada(51);
                expect(juego.mensaje).toMatch("El número secreto es MENOR que 51, te quedan 9 intentos.")
            })

            it('Sin intentos', ()=>{
                juego.intentos = 1;
                juego.jugada(51);
                expect(juego.mensaje).toMatch("No te quedan intentos, has perdido la partida. El número secreto era: 50")
            })

        });
    });
});