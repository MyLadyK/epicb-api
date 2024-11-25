import { Routes } from '@angular/router';
import { BattleComponent } from './battle/battle.component';
import { CharacterFormComponent } from './character-form/character-form.component';

export const routes: Routes = [
  { path: '', component: BattleComponent }, // Ruta predeterminada
  { path: 'add-character', component: CharacterFormComponent } // Ruta para añadir personaje
];
