import { Component, OnInit } from '@angular/core';
import { CalculadoraComponent } from '../calculadora/calculadora.component';
import { HomeComponent } from '../main/home/home.component';
import { DemosComponent } from '../demos/demos.component';
import { FormularioComponent } from '../formulario/formulario.component';
import { ContactosAddComponent } from '../contactos/componente.component';

@Component({
  selector: 'app-dinamico',
  templateUrl: './dinamico.component.html',
  styleUrls: ['./dinamico.component.css']
})
export class DinamicoComponent implements OnInit {
  menu = [
    {texto: 'contactos', icono: 'fa-solid fa-chalkboard-user', componente: ContactosAddComponent},
    { texto: 'formulario', icono: 'fa-solid fa-chalkboard-user', componente: FormularioComponent},
    { texto: 'inicio', icono: 'fa-solid fa-house', componente: HomeComponent},
    { texto: 'demos', icono: 'fa-solid fa-chalkboard-user', componente: DemosComponent},
    { texto: 'calculadora', icono: 'fa-solid fa-calculator', componente: CalculadoraComponent },
    // { texto: 'upload', icono: 'fa-solid fa-file-arrow-up', componente: UploadComponent},
  ]
  actual = this.menu[0].componente

  constructor() { }

  ngOnInit(): void {
  }

  seleccionar(indice: number): void {
    this.actual  = this.menu[indice].componente
  }
}
