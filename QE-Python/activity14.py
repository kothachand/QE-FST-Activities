def fib(n):
    if n<=1:
        return n
    else:
        return fib(n-1)+fib(n-2)
r=int(input())
for i in range(1,r):
    print(fib(i),end=" ")