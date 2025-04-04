# Reading two integers from the user 
num1 = int(input("Enter the first integer: ")) 
num2 = int(input("Enter the second integer: ")) 

# Performing arithmetic operations 
addition = num1 + num2 
subtraction = num1 - num2 
multiplication = num1 * num2 
division = num1 / num2 if num2 != 0 else "Division by zero is not allowed" 
modulo = num1 % num2 if num2 != 0 else "Modulo by zero is not 
allowed" 

# Displaying the results 
print("\nResults:") 
print(f"Addition: {num1} + {num2} = {addition}") 
print(f"Subtraction: {num1} - {num2} = {subtraction}") 
print(f"Multiplication: {num1} * {num2} = {multiplication}") 
print(f"Division: {num1} / {num2} = {division}") 
print(f"Modulo: {num1} % {num2} = {modulo}")