# Grade Statistics Program

This program calculates important statistics for grades entered by the user.

## How to Use

1. Clone this repository to your local machine.
2. Open the project directory in your preferred Java IDE.
3. Compile and run the `GradeStatistics.java` file.
4. Follow the on-screen instructions to enter the grades.
5. The program will calculate and display the average, maximum, and minimum grades.

## PseudoCode:
1. Start
2. Initialize variables `sum`, `maximum`, and `minimum` to keep track of grades.
3. Prompt the user to enter the number of grades.
4. Read the number of grades from user input and store it in a variable `numOfGrades`.
5. Initialize a variable `i` to 0.
6. **While** `i` is less than `numOfGrades`, do the following:
    - Prompt the user to enter grade number `(i + 1)`.
    - Read the grade from user input and store it in a variable `grade`.
    - Add `grade` to `sum`.
    - **If** `grade` is greater than `maximum`, update `maximum` to `grade`.
    - **If** `grade` is less than `minimum`, update `minimum` to `grade`.
    - Increment `i` by 1.
7. Calculate `average` by dividing `sum` by `numOfGrades`.
8. Display the `average`, `maximum`, and `minimum` grades.
9. **End**.
