# Function to determine grade
def get_grade(score):
    if score >= 90:
        return "A"
    elif score >= 80:
        return "B"
    elif score >= 70:
        return "C"
    elif score >= 60:
        return "D"
    else:
        return "F"

# Taking user input
score = int(input("Enter your score: "))

# Displaying the grade
print(f"Your grade is: {get_grade(score)}")