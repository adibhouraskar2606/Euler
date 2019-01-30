sumSquare = 0
squareSum = 0
for x in range(1,101):
    sumSquare = sumSquare + (x * x)
print(sumSquare)

for x in range(1,101):
    squareSum = squareSum + x
print(squareSum * squareSum)
print("difference is ",(squareSum * squareSum)-sumSquare)