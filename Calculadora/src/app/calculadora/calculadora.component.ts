import { Component } from '@angular/core';

@Component({
  selector: 'app-calculadora',
  templateUrl: 'calculadora.component.html',
  styleUrls: ['./calculadora.component.css'],

})

export class NameComponent  {

   resultado:string = '0';
   calculo:string = '';
   numero1:number = 0;
   numero2:number = 0;
   operador:string = '';

   addNumber(n1:any ):void{
      if(this.resultado === '0' ){
          this.resultado = n1;
      }else{
        this.resultado += n1;
      }
  }

   borrar():void{
    this.resultado = '';
    this.calculo = "";
    this.numero1 = 0;
    this.numero2 = 0;
    this.operador = '';
  }

  calculoFinal():void{
    const valor = this.resultado.split(this.operador);

    this.numero1 = parseFloat(valor[0]);
    this.numero2 = parseFloat(valor[1]);
    let resultadoFinal:number = 0;
    switch(this.operador){
      case "+":
            resultadoFinal = this.numero1 + this.numero2;
            console.log(resultadoFinal);
            break;
      case "-":
            resultadoFinal = this.numero1 - this.numero2;
            break;
      case "/":
            resultadoFinal = this.numero1 / this.numero2;
            break;
      case "*":
            resultadoFinal = this.numero1 * this.numero2;
            break;
    }
    this.resultado = resultadoFinal.toString();
  }

  borrarNumero():void{
    this.resultado = this.resultado.slice(0,-1);
  }

}
