count = 0
for x in range(1,140000):
    y = 2
    while(y<x):
        if(x%y == 0):
            break
        if(y == x-1):
            count = count + 1
            print(x,count+1,"time")
        y = y + 1