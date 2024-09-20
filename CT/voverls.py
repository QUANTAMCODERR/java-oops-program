# Input a string from the user
string = input("Enter a string: ")

# Define a variable to store the count of vowels
vowel_count = 0

# Define a string containing all vowels (both lowercase and uppercase)
vowels = "aeiouAEIOU"

# Iterate through each character in the string
for char in string:
    # Check if the character is a vowel
    if char in vowels:
        vowel_count += 1

# Display the count of vowels
print("Number of vowels in the string:", vowel_count)
