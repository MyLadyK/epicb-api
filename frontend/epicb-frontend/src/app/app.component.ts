import { Component } from '@angular/core';
import { RouterModule } from '@angular/router';
import { BattleComponent } from './battle/battle.component';

@Component({
  standalone: true,
  imports: [RouterModule, BattleComponent],
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'epicb-frontend';
}
