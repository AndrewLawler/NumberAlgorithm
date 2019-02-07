#Smallest Number
#Biggest Number

#initializing A
A = []

def main():
    print("\nWelcome To Number Arranger\n")
    Option = input("Would you like to enter a number? Y or N: ")
    Option = Option.upper()
    if Option == "Y":
        print()
        NumToAdd = float(input("Number: "))
        A.append(NumToAdd)
        main()
    elif Option == "N":
        print()
        func()
    else:
        print("\nTry Again")
        main()

def func():
    if A[0]>A[1]:
        store = A[1]
        A[1] = A[0]
        A[0] = store

    mini = A[0]
    maxi = A[1]
    i = 0
     
    while i <= (len(A)-1):
        if A[i] < mini:
            mini = A[i]
        elif A[i] > maxi:
            maxi = A[i]
        i = i + 1

    print("\nBiggest Number:",maxi)
    print("Smallest Number:",mini)

    main()
            
main()
