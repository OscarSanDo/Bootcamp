import { Component } from '@angular/core';


@Component({
  selector: 'ng-calculadora',
  templateUrl: './calculadora.component.html',
  styleUrls: ['./calculadora.component.css']
})

export class CalculadoraComponent {


  input:string = '';
  result:string = '';


  pressNum(num: string) {

    //Do Not Allow . more than once
    if (num==".") {
      if (this.input !="" ) {

        const lastNum=this.getOperadorPendiente()
        console.log(lastNum.lastIndexOf("."))
        if (lastNum.lastIndexOf(".") >= 0) return;
      }
    }


    if (num=="0") {
      if (this.input=="" ) {
        return;
      }
      const PrevKey = this.input[this.input.length - 1];
      if (PrevKey === '/' || PrevKey === '*' || PrevKey === '-' || PrevKey === '+')  {
          return;
      }
    }

    this.input = this.input + num
    this.calcula();
  }


  getOperadorPendiente() {
    let pos:number;
    console.log(this.input)
    pos=this.input.toString().lastIndexOf("+")
    if (this.input.toString().lastIndexOf("-") > pos) pos=this.input.lastIndexOf("-")
    if (this.input.toString().lastIndexOf("*") > pos) pos=this.input.lastIndexOf("*")
    if (this.input.toString().lastIndexOf("/") > pos) pos=this.input.lastIndexOf("/")
    console.log('Last '+this.input.substr(pos+1))
    return this.input.substr(pos+1)
  }


  pressOperador(op: string) {

    //Do not allow operators more than once
    const lastKey = this.input[this.input.length - 1];
    if (lastKey === '/' || lastKey === '*' || lastKey === '-' || lastKey === '+')  {
      return;
    }

    this.input = this.input + op
    this.calcula();
  }


  borrar() {
    if (this.input !="" ) {
      this.input=this.input.substr(0, this.input.length-1)
    }
  }

  borrarTodo() {
    this.result = '';
    this.input = '';
  }

  calcula() {
    let formula = this.input;

    let lastKey = formula[formula.length - 1];

    if (lastKey === '.')  {
      formula=formula.substr(0,formula.length - 1);
    }

    lastKey = formula[formula.length - 1];

    if (lastKey === '/' || lastKey === '*' || lastKey === '-' || lastKey === '+' || lastKey === '.')  {
      formula=formula.substr(0,formula.length - 1);
    }

    this.result = eval(formula);
  }

  getResultado() {
    this.calcula();
    this.input = this.result;
    if (this.input=="0") this.input="";
  }

}
