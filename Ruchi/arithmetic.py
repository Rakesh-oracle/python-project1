num1 = int(input("Enter the first integer:"))
num2 = int(input("Enter the second integer:"))
addition = num1+num2
substraction = num1-num2
multiplication = num1 * num2
division = num1/num2 if num2!=0 else "Divisoin by zero is not allowed"
module = num1 % num2 if num2 !=0 else "Modulo by zero is not allowed"
print("\nResult:")
print(f"Addition: {num1}+{num2}={addition}")
print(f"Substraction: {num1}-{num2}={substraction}")
print(f"Multiplication: {num1}*{num2}={multiplication}")
print(f"Division: {num1}/{num2}={division}")
print(f"Modulo: {num1}%{num2}={modulo}")
 



