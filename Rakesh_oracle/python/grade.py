# Prompt the user to enter a character 
grade = input("Enter a grade (O, A, B, C, F): ").upper() # Convert input to 
uppercase for consistency 
# Checking the grade and displaying the corresponding message 
if grade == 'O': 
print("Outstanding") 
elif grade == 'A': 
print("Very Good") 
elif grade == 'B': 
print("Good") 
elif grade == 'C': 
print("Average") 
elif grade == 'F': 
print("Fail") 
else: 
print("Invalid grade entered. Please enter one of the following: O, A, B, 
C, F.")