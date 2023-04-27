import { NgModule } from "@angular/core";
import { NgModel } from "@angular/forms";
import { CounterComponent } from "./counter/counter.component";


@NgModule({
  declarations:[
     CounterComponent
  ],
  exports:[
    CounterComponent
  ]
})
export class CounterModule {}
