# Tax Calculator Program

This program calculates the weekly tax withholding for a customer based on their weekly income, according to the provided income guidelines.

## How to Use

1. Clone this repository to your local machine.
2. Open the project directory in your preferred Java IDE.
3. Compile and run the `TaxCalculator.java` file.
4. Follow the on-screen instructions to enter the weekly income.
5. The program will calculate and display the weekly tax withholding amount.

## Income Guidelines

- Income less than $500: tax rate 10%
- Incomes greater than/equal to $500 and less than $1500: tax rate 15%
- Incomes greater than/equal to $1500 and less than $2500: tax rate 20%
- Incomes greater than/equal to $2500: tax rate 30%

## Example Usage

```
Enter your weekly income: $1200
Your weekly tax withholding: $180.0
```


## PseudoCode:
1. Start
2. Prompt the user to enter their weekly income
3. Read the user's input and store it in a variable called `income`
4. Initialize a variable called `taxRate`
5. Determine the tax rate based on the income range using a switch statement:
   a. If `income` is less than $500, set `taxRate` to 10%
   b. If `income` is greater than or equal to $500 and less than $1500, set `taxRate` to 15%
   c. If `income` is greater than or equal to $1500 and less than $2500, set `taxRate` to 20%
   d. If `income` is greater than or equal to $2500, set `taxRate` to 30%
6. Calculate the tax withholding amount by multiplying `income` by `taxRate`
7. Display the calculated tax withholding amount to the user
8. End



