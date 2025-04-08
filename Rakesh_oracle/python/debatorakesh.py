 Function to find the greatest of three numbers
def find_greatest(num1, num2, num3):
if num1 >= num2 and num1 >= num3:
return num1
elif num2 >= num1 and num2 >= num3:
return num2
else:
return num3
# Input: Getting three numbers from the user
num1 = float(input("Enter the first number: "))
num2 = float(input("Enter the second number: "))
num3 = float(input("Enter the third number: "))
# Finding the greatest number using the function
greatest = find_greatest(num1, num2, num3)
# Output: Displaying the greatest number
print(f"The greatest number among {num1}, {num2}, and {num3} is:
{greatest}")