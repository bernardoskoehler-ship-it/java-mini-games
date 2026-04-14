# 🧩 Grid Game v1 (Java)

First version of a simple grid-based console game developed in Java.

## 🎮 Overview

In this version, the player can move through a 7x7 map, collect a key, and use it to open a door.

The game runs in a loop and updates the map in real time through console output.

## 🧱 Game Elements

| Symbol | Meaning     |
|--------|------------|
| X      | Player     |
| y      | Key        |
| =      | Wall       |
| 0      | Door       |
| .      | Empty      |

## ⚙️ Features

- Player movement using keyboard input
- Map rendering in console
- Key collection system
- Inventory using `HashMap`
- Door unlocking mechanic
- Static obstacle placement (walls)

## 🧠 OOP Structure

The project is organized using Object-Oriented Programming:

- `Personagem` → player logic and movement
- `Mapa` → grid and rendering
- `Itens` → abstract base class for items
- `Chave` → collectible item
- `Porta` → unlockable object
- `Parede` → obstacle
- `Jogo` → game loop and setup

## ▶️ How to Run

1. Compile all `.java` files
2. Run the `main` method
3. Use the keyboard to control the player

## 🕹️ Controls

| Key | Action       |
|-----|-------------|
| W   | Move up     |
| S   | Move down   |
| A   | Move left   |
| D   | Move right  |
| E   | Interact    |

## ⚠️ Limitations (v1)

- Item positions are tracked by symbol (can cause issues with duplicates)
- No boundary safety in some interactions
- No dynamic object system
- Map logic tightly coupled with rendering

## 🚧 Next Steps (v2 Goals)

- Improve movement system (less repetition)
- Add boundary safety checks
- Refactor map access (encapsulation)
- Improve item system (multiple instances)
- Add better interaction system

## 📌 Author Notes

This version was built as a learning exercise to practice:

- OOP design
- Game logic
- Data structures in Java

Future versions will focus on improving code quality and scalability.
