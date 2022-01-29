hour, minute = input().split()
hour = int(hour)
minute = int(minute)

if minute >= 45 :
    minute -= 45
    print(hour, minute)
else :
    minute += 60
    minute -= 45
    if hour - 1 < 0:
        hour += 24
        hour -= 1
    else:
        hour -= 1
    print(hour, minute)