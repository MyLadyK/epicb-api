import { Routes } from '@angular/router';
import { BattleComponent } from './battle/battle.component';
import { LoginComponent } from './login/login.component';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';
import { CharacterManagementComponent } from './character-management/character-management.component';

export const routes: Routes = [
  { path: '', component: LoginComponent }, // Página de inicio para el logueo
  { path: 'battle', component: BattleComponent }, // Página de batalla
  { path: 'admin-dashboard', component: AdminDashboardComponent }, // Página de administrador
  { path: 'character-management', component: CharacterManagementComponent } // Ruta para gestionar personajes
];
