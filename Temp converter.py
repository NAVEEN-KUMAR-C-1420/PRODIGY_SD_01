a=int(input("Enter the value :"))
s=input("Enter the Unit (C/K/F):").upper()
if s=="C":
    f=(a * 9 / 5) + 32
    print("Fahernheit :",f)
    k=a+ 273.15
    print("Kelvin :",k)
elif s=="K":
    c=a-273.15
    print("Celsius :",c)
    f=c* 9 / 5 + 32
    print("Fahernheit :",f)
elif s=="F":
    c=(a-32)*5/9
    print("Celsius :",c)
    k=c+ 273.15
    print("Kelvin :",k)
else:
    print("Invalid Input")
    
