n = 1
for i in range(1,1001):
    n = n * 2
print(n)
num = []
#convert number into array of digits
num = list(int(d) for d in str(n))
print(num)
total = 0
for i in num:
    total = total + i
print(total)