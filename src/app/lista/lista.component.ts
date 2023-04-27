import { Component } from '@angular/core';

@Component({
  selector: 'app-lista',
  template: `<h1>Hola jeje</h1>
  <ul>
     <li *ngFor="let item of items">
      {{items}}
     </li>
  </ul>` ,
  styleUrls: ['./lista.component.css']
})
export class ListaComponent {
  items = ['item1' , 'item2', 'item3'];
}
