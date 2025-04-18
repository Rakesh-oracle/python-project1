import math
def calculate_values(number):
 abs_value = abs 
 if number >=0:
  sqrt_value = math.sqrt(number)
 else:
  sqrt_value = "Not defined for negative numbers"
 cbrt_value = number ** (1/3) #ensure this assignment is outside the if structure
 return abs_value, sqrt_value, cbrt_value
num = float(input("Enter a number:"))
abs_val, sqrt_val, cbrt_val = calculate_values(num)
print(f"Absolute value of {num}: {abs_val}")
print(f"Square root of {num}: {sqrt_val}")
print(f"Cube root of {num}: {cbrt_val}")