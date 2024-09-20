fruits=['banana','apple','strawberry']

#membership operator

if 'banana' in fruits:
    print ("banana is in fruits list")
else :
    print("no banana")

if 'mango' not in fruits:
    print ("mango is not is fruits")
else:
    print("mango is in fruits list")


#identity operator

num1 = 5
num2 = 5

if num1 is num2:
    print("yes not diff")
else :
    print("nope")

if num1 is not num2:
    print("true ")
else :
    print("false not diff")


