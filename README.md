# Drei in einer Reihe (4x4)

Bewerbungsaufgabe für die Ausbildung zum Fachinformatiker Anwendungsentwicklung bei adesso.

Dieses Projekt implementiert ein konsolenbasiertes Spiel auf einem 4x4-Spielfeld, bei dem **nicht der Gewinn**, sondern der **Verlust** im Fokus steht:  
Ein Spieler verliert, sobald er drei seiner Symbole direkt nebeneinander (Reihe oder Spalte) platziert.

---

## Spielregeln

- Spielfeld: **4 × 4**
- Zwei Spieler: **X** und **O**
- Spieler setzen abwechselnd ihr Symbol
- **Verlustbedingung**: Drei gleiche Symbole **direkt nebeneinander**
  - horizontal
  - vertikal
  - diagonal (fehlt leider)
- **Unentschieden**, wenn das Feld voll ist und niemand verloren hat
- Eingabe über die Konsole (Zeile Spalte, Werte 0–3)

---

## Projektstruktur und Verantwortlichkeiten

- ```Spieler.java```
  - Erstellt einen Spieler und legt ein Symbol an
- ```Feld.java```
  - Verwaltet das 2D-Array und legt Regeln und Bedingungen fest
  - Prüft freie Felder, Spielfeld voll, Verlustbedingung
- ```Spiel.java```
  - macht Spielerwechsel
  - Führt Züge aus
  - Erkennt Spielende
- ```Main.java```
  - Kern des Spiels, und steuert Konsolen UI und startet das Spiel
  - Darstellung des Spielfelds mit Zeilen- und Spaltennummern

---

## Konsolendarstellung

Beispielausgabe:

```
   0 1 2 3
0  X . O .
1  . X . .
2  . . O .
3  . . . X
```

- `.` ist ein freies Feld
- Die Nummerierung erleichtert die Sicht für den Spieler

---

## Starten des Spiels

1. Projekt kompilieren
2. `Main` ausführen
3. Eingabe im Format:
   ```
   Reihe Spalte
   ```
   Beispiel:
   ```
   1 2
   ```

---

## Entscheidungen

- Spiel in Konsole aufgebaut, da ich im Studium den Umgang damit gelernt habe
- Ich habe es nicht geschafft eine Diagonale Abfrage erfolgreich zu schreiben.

---

## Hinweise

- Ungültige Züge (bereits belegte Felder) werden abgefangen
- Das Spiel endet automatisch bei Verlust oder Unentschieden

---
