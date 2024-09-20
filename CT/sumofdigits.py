string = input("Enter a string with alphabets and digits: ")
sum_of_digits = 0

for char in string:
    if char.isdigit():
        sum_of_digits += int(char)

print("Sum of digits in the string:", sum_of_digits)
