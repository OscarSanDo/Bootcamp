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
            ['oso', 'Anita lava la tina', 'Anita lava la tina'].forEach(caso => {
                it(`palindromo: ${caso}`, () => expect(esPalindromo(caso)).toMatch('es palíndromo'))
            })
        });

        describe('No es Palindromo', () => {
             ['jamon', 'el perro verde', 'no es palindromo'].forEach(caso => {
                it(`palindromo: ${caso}`, () => expect(esPalindromo(caso)).toMatch('no es palíndromo'))
            })
        });
    });

});