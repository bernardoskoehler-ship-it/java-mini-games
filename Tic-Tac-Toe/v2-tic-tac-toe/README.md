# V2 Tic-Tac-Toe

This is the second version of my Java Tic Tac Toe project.

In this version, the project was improved with better game organization, winner validation, draw detection, and a CPU opponent mode. The game runs in the terminal and was built to practice Java fundamentals, arrays, loops, conditionals, validation, and object-oriented programming.

## Features

- 3x3 Tic Tac Toe board
- Player vs Player mode
- Player vs CPU mode
- Position validation
- Occupied position validation
- Winner detection
- Draw detection
- Board display in the terminal
- Simple CPU that plays random valid moves

## Project Structure

- `Jogador` → represents a player with a name and symbol
- `CPU` → extends `Jogador` and represents the computer opponent
- `Jogo` → controls the board, turns, moves, and game flow
- `CondicaoDeVitoria` → checks victory and draw conditions
- `Main` → starts the game

## Concepts Practiced

This project helped me practice:

- Classes and objects
- Inheritance
- Arrays with `int[][]`
- Loops
- Conditionals
- Input handling with `Scanner`
- Random moves with `Random`
- Code organization into multiple classes

## How It Works

The board uses a 3x3 `int` array:

- `0` = empty space
- `1` = player 1 symbol
- `2` = player 2 or CPU symbol

The player chooses a row and column to place a move.  
The game validates if the position exists and if it is free.  
The CPU chooses random positions until it finds an available one.

The game ends when:

- a player completes a row, column, or diagonal
- the board becomes full, resulting in a draw

## Example Modes

### Player vs Player
Two human players take turns marking positions on the board.

### Player vs CPU
One human player plays against the computer, which makes random valid moves.

## Goal of This Version

The main goal of this version was to make the project more complete than the first version by adding:

- a CPU mode
- cleaner victory validation
- draw validation
- better separation of responsibilities between classes

## Future Improvements

Possible future improvements for this project:

- Replace numbers with `X` and `O`
- Add replay option
- Let the player choose game mode at runtime
- Improve CPU logic to play smarter
- Add score tracking
- Refactor repeated logic
- Improve terminal visual style

## Author

Made by Bernardo as part of my Java learning journey.
