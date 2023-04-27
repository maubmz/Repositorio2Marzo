import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NameComponent } from './calculadora.component';



@NgModule({
  declarations: [NameComponent],
  imports: [
    CommonModule
  ],
  exports:[
    NameComponent
  ]
})
export class CalculadoraModule { }
