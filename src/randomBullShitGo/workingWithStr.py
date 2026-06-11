single_line = "Hello World"
multi_line = """"Multiple
Line"""

language = "Python"

print(language)
print(language[0:2])
print(language[2:])
print(language[::])
print(language[::-1])
print(language[::-2])

print(language.upper())
print(language.lower())

bang = "   Bang   "

print(len(bang))
print(bang.strip())
print(len(bang.strip()))

tahu = "TahuBulatBulat"
print(tahu.replace("Bulat", "Kotak"))

bung = "bung,Bung,bung,Bung"
print(bung.split(","))

# Line 1: Define a raw data string with leading whitespace and messy formatting
raw_record = "   USR_ID:94827-active   "

# Line 2: Strip away the whitespace and assign the clean result to a new variable
clean_record = raw_record.strip()

# Line 3: Split the clean string into two parts at the colon symbol separator
parts = clean_record.split(":")
print(parts)

# Line 4: Extract the status substring using negative slicing from the second element
status = parts[1][-6:]

# Line 5: Convert the extracted status string entirely to uppercase characters
final_status = status.upper()

# Line 6: Output the formatted message displaying the processed value
print(f"Account state: {final_status}")
print()