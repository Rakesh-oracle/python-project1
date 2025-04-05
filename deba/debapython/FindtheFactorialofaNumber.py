 //Find the Factorial of a Number

def factorial(n):  
    return 1 if n == 0 else n * factorial(n - 1)  

num = 5  
print("Factorial of", num, "is", factorial(num))