
# 🖥 Mini Power Shell

This project is a basic simulation of a command-line shell (Mini PowerShell) written in Java.  
It allows simple file system operations such as viewing directories and files, navigating between them, creating files and folders, and more (`mkdir`, `touch`, `cd`, `ls`, `help`, `exit`, `pwd`).

---

## 1. Project Overview

The goal of this project is to practice user input handling and file/directory management in Java.  
The **MiniShell** simulates a simple command-line environment, similar to PowerShell or Bash, in an educational and simplified way, to help understand how command-line interfaces work.

---

## 2. How to Compile and Run the Code

1. Open a code editor (e.g., IntelliJ or Visual Studio Code). This project was developed using **IntelliJ**.
2. Create a new Java project.
3. Add the following two files to your project:
   - `MiniShell.java` — the main class of the project.
   - `ShellCommandHandler.java` — the class that contains all the shell functionalities and operations.

### A. Compiling the Code

After creating the project and adding the files:

- Open the Command Line or Terminal (both work the same — I used Terminal).
- Navigate to the project folder using:

```bash
cd [project-folder-name]
```

- Compile both files using:

```bash
javac MiniShell.java ShellCommandHandler.java
```

- Then run the program using:

```bash
java MiniShell
```

---

## 3. Sample Execution

When the code runs, the command prompt will appear:

```
C:\Users\yourname > mkdir test
```

Creates a new directory called `test`  
**Output:** `Directory created: test`

```
C:\Users\yourname > cd test
```

Navigates into the `test` folder  
**Output:** `Moved to: C:\Users\yourname\test`

```
C:\Users\yourname\test > touch file1.txt
```

Creates a new file named `file1.txt`  
**Output:** `File created: file1.txt`

```
C:\Users\yourname\test > ls
```

Lists all files and folders in the current directory  
**Output:** `[FILE] file1.txt`

---

## 4. Code Notes – What Each Method Does

### Main Class: `MiniShell.java`

```java
String[] parts = input.split(" ", 2);
```

Splits the user input into command and parameter.  
Uses a `switch` to match the command and delegate execution to `ShellCommandHandler`.

> (Alternatively, `if/else` statements could be used to call the respective functions.)

---

### Handler Class: `ShellCommandHandler.java`

1. `printWorkingDirectory()`  
   → Returns the current path in the file system.

2. `listDirectory()`  
   → Lists all files and folders in the current directory.

3. `changeDirectory(String name)`  
   → Changes the current directory based on user input.

4. `makeDirectory(String name)`  
   → Creates a new directory with the specified name.

5. `createFile(String name)`  
   → Creates a new empty file with the specified name.

6. `printHelp()`  
   → Displays all available commands.

### ✅ Available Commands

```
pwd             - Print the current working directory  
ls              - List all files and directories in the current directory  
cd [dir]        - Change directory to [dir] or '..' to go up  
mkdir [name]    - Create a new directory with the given name  
touch [name]    - Create a new empty file with the given name  
help            - Show this help information  
exit            - Exit the shell  
```
