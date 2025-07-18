# Student Management System

A simple Java-based Student Management System for managing student records via the command line.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- (Optional) An IDE like IntelliJ IDEA, Eclipse, or VS Code for easier code navigation

## Installation

1. **Clone the repository** (if not already downloaded):
   ```sh
   git clone <repository-url>
   cd Student-Management-System
   ```
2. **Compile the source code:**
   ```sh
   javac -d bin src/*.java
   ```
   This will compile all Java files in the `src` directory and place the `.class` files in the `bin` directory.

## How to Run

After compiling, run the main class using:

```sh
java -cp bin Main
```

This will start the Student Management System in your terminal.

## Project Structure

```
Student-Management-System/
├── bin/         # Compiled Java class files
│   ├── Main.class
│   ├── Manager.class
│   ├── Student.class
│   └── Validate.class
├── src/         # Java source files
│   ├── Main.java
│   ├── Manager.java
│   ├── Student.java
│   └── Validate.java
└── README.md    # Project documentation
```

- `src/`: Contains all Java source code files.
- `bin/`: Contains compiled `.class` files after building.

## Learn More

- [Java Documentation](https://docs.oracle.com/javase/tutorial/)
- [How to Compile and Run Java](https://www.oracle.com/java/technologies/javase/codeconventions-137265.html)
- For questions or contributions, please open an issue or pull request.
