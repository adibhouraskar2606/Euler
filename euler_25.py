def fib(n):
    a = 1
    b = 0
    while n > 1:
        a, b = a+b, a
        n = n - 1
    return a


c = fib(4782)
dig = list(int(d) for d in str(c))
print(dig)
print(len(dig))
