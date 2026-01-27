d={}
print("how many fruits do you want to add:")
n=int(input())
for i in range(n):
    a=input('enter fruit name:')
    b=int(input('enter a price:'))
    d[a]=b
opt=input("enter the values you need to search:")
if opt in d:
    print("it is available and price is",d[opt])
else:
    print("not available")    