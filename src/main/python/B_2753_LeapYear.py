leapYear = int(input())
if (leapYear % 4 == 0 and leapYear% 100 != 0) or leapYear % 400 == 0:
    print("1")
else :
    print("0")