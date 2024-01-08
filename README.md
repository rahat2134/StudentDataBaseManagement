# Student Database Management System

This project implements a Student Database Management System using Java. It allows users to manage student information through a menu-driven interface, providing options to add new students, view existing student details, search for specific students, calculate the average marks, and exit the program.

## Features

1. **Add Student:**
   - Users can input details such as name, roll number, age, and marks to add a new student to the database.

2. **View Student:**
   - Displays a list of all students currently stored in the database along with their details.

3. **Search Student:**
   - Enables users to search for a specific student by entering their roll number.

4. **Calculate Average Marks:**
   - Computes and prints the average marks of all students in the database.

5. **Exit:**
   - Allows the user to exit the program.

## How to Use

1. **Compile the Code:**
   - Ensure you have Java installed on your system.
   - Compile the code using a Java compiler:

     ```bash
     javac StudentDataBaseManagement.java
     ```

2. **Run the Program:**
   - Execute the compiled Java program:

     ```bash
     java StudentDataBaseManagement
     ```
     or simply run it through ui

3. **Follow On-Screen Instructions:**
   - Use the menu options presented to interact with the system.
   - Enter information as prompted to add, view, search, or calculate average marks.

4. **Exit the Program:**
   - Choose the "Exit" option from the menu to terminate the program.

## Notes

- The system uses a `HashMap` to efficiently store and retrieve student objects based on their roll numbers.
- Error handling is incorporated to ensure that marks entered for a student are non-negative.

## Contributing

Feel free to contribute to the improvement of this Student Database Management System. You can submit bug reports, suggest new features, or even provide enhancements to the existing code. Simply open an issue or create a pull request.

## License

This project is licensed under the [MIT License](LICENSE). Feel free to use, modify, and distribute the code for your purposes.
