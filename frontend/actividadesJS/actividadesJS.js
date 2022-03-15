

// Actividad 1

function devuelveNumeroRDM(min, max) {
    return Math. trunc((Math.random() * (max - min) + min));
  }


let numRdm = devuelveNumeroRDM(1, 100);
console.log(numRdm);
alert("pulsa el boton para generar un número aleatorio");
alert(`El número Ramdom es ` + numRdm);


//Actividad 2



		// let intentos = 10; // variable para guardar el n�mero de intentos
		// let cadUsuario;
		// let numeroRandom = devuelveNumeroRDM(); // genera el numero aleatorio

		// alert("Adivina el número entre 0 y 100");
		// alert("Tienes 10 intentos.");
		// //System.out.println(numeroRandom);

		// do {
		// 	cadUsuario = parseInt(prompt("Introduce un número entre 0 y 100: "));
			
		
			
		// 	if (cadUsuario === numeroRandom) {
		// 		alert("Has acertado");
		// 		break;

		// 	} else if (cadUsuario > numeroRandom) {
		// 		alert("El número Random es menor, te quedan " + --intentos + " intentos: ");


		// 	} else if (cadUsuario < numeroRandom) {
		// 		alert("El número Random es mayor, te quedan " + --intentos + " intentos: ");
		// 	}

		// } while (intentos > 0);
		
		// if (intentos == 0) {
    //   alert("No te quedan intentos, has perdido la partida");}
	

    //Actividad 3

