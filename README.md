## Overview
This is a simple Java console application that allows users to play the classic Rock-Paper-Scissors game against the computer. The program demonstrates basic control flow, user input handling, and random number generation in Java.

## Features
- Play Rock-Paper-Scissors against the computer
- Input validation for user choices
- Randomized computer moves
- Clear win/loss/draw logic
- Option to play multiple rounds
- Console-based user interface

## How It Works
1. The user is prompted to enter their move: `rock`, `paper`, or `scissors`.
2. The computer randomly selects its move.
3. The program compares both moves and determines the winner.
4. The result is displayed, and the user is asked if they want to play again.

## Technologies Used
- Java (JDK 8 or higher)
- Scanner class for input
- Random class for computer move generation

## Getting Started

### Prerequisites
- Java Development Kit (JDK) installed
- A terminal or command prompt

### Running the Program
1. Clone or download the repository.
2. Open the terminal and navigate to the project directory.
3. Compile the Java file:
   ```bash
   javac RockPaperScissors.java
   ```
4. Run the program:
   ```bash
   java RockPaperScissors
   ```

## Sample Output
```
Welcome to Rock-Paper-Scissors!
Enter your move (rock, paper, scissors): rock
Computer chose: scissors
You win!

Play again? (yes/no): yes
...
```

## Code Structure
- `RockPaperScissors.java`: Main class containing the game logic and user interaction.

## Future Improvements
- Add score tracking across rounds
- Implement a GUI version using JavaFX or Swing
- Support multiplayer mode

## License
This project is open-source and free to use under the MIT License.

---
