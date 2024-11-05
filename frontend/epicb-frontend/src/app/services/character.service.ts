import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {environment} from '../../environments/environment';

export interface Character {

  idCharacter: number;
  nameCharacter: string;
  categoryCharacter: string;
  universCharacter: string;
  healthCharacter: number;
  attackCharacter: number;
  defenseCharacter: number;
  speedCharacter: number;
  staminaCharacter: number;
  intelligenceCharacter: number;
  specialCharacter: number;
  imageUrl: string;

}

@Injectable({
  providedIn: 'root'
})
export class CharacterService {

  private apiUrl = `${environment.apiUrl}/characters`;

  constructor(private http: HttpClient) { }

  getAllCharacters(): Observable <Character[]> {
    return this.http.get<Character[]>(this.apiUrl);
  }

  createCharacter(character: Character): Observable <Character> {
    return this.http.post<Character>(this.apiUrl, character);
  }

}
