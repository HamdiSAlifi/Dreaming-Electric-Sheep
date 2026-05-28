print("=== Palindrome Checker ===")
text = input("Input Text: ")

if not text.strip():
    print("Please enter some text.")
else:
    cleaned = ''.join(char.lower() for char in text if char.isalnum())
    if cleaned == cleaned[::-1]:
        print("The text is a palindrome")
    else:
        print("The text is not a palindrome")