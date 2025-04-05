# Python program to print a star tree
def print_star_tree(height):
    for i in range(1, height + 1):
        # Print spaces for alignment
        print(" " * (height - i), end="")
        # Print stars for the tree
        print("*" * (2 * i - 1))

# Input: Height of the tree
height = int(input("Enter the height of the star tree: "))
print_star_tree(height)