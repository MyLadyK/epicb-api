import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Character } from '../model/character'; // Asegúrate de tener un modelo para Character

@Injectable({
  providedIn: 'root'
})
export class CharacterService {
  private apiUrl = 'http://localhost:8081/api/characters'; // URL de tu API backend

  constructor(private http: HttpClient) { }

  // Método para añadir un personaje
  addCharacter(character: Character): Observable<Character> {
    return this.http.post<Character>(this.apiUrl, character);
  }

  // Otros métodos CRUD (listar, modificar, eliminar) si es necesario
}
