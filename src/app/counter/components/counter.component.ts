import {} from './counter.component';
/*
import { Component } from '@angular/core';

@Component({
  selector: 'app-counter',
  template: '<h1>Hola Counter</h1>'
})
export class CounterComponent{

}

@Component({
  selector: 'app-saludar',
  template: '<h1>HOLA</h1>'
})
export class Saludar{

}
*/

import { Component} from '@angular/core';
@Component({
  selector: 'app-counter',
  template: `
    <h3>Counter: {{counter}}</h3>

    <button (click)="increaseBy(1)">+1</button>
    <button (click)="increaseBy(-1)">-1</button>
    <button (click)="reset()">Reset</button>
  `
})

export class CounterComponent {
  public title:string='Hola mundo';
  public counter:number=10;

  increaseBy(value: number):void{
    this.counter += value;
  }

  reset():void{
    this.counter=10;
  }
}
