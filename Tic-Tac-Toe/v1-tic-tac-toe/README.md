# V1 Tic-Tac-Toe

This is the first version of my Java Tic-Tac-Toe project.

## About

This project is a simple console-based Tic-Tac-Toe game made with Java.

The game includes:
- two players
- board display in the console
- position validation
- occupied position validation
- win condition checking by:
  - rows
  - columns
  - diagonals

## Classes

### `Jogador`
Represents a player.
- stores the player's name
- stores the player's symbol (`1` or `2`)

### `Jogo`
Controls the game flow.
- stores the board
- validates moves
- marks positions
- displays the board

### `CondicaoDeVitoria`
Checks if a player has won.
- verifies rows
- verifies columns
- verifies diagonals

## Technologies Used

- Java
- Object-Oriented Programming
- Scanner

## Notes

This is a V1 project focused on creating a functional game and practicing Java logic.

Possible future improvements:
- draw condition
- better visual board
- repeat input until valid
```
