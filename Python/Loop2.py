new_list = input("Enter a list of numbers separated by commas: ").split(",")
n = int(input("Enter a number: "))
for i in range(len(new_list)):
    if new_list[i] == n:
        print("The number is in the list")
        break
    else:
        print("The number is not in the list")
        break
