a=list(map(int,input().split()))
b=list(map(int,input().split()))
new_list=[]
for i in a:
    if i%2==0:
        new_list.append(i)
for i in b:
    if i%2!=0:
        new_list.append(i)
print(new_list)
    