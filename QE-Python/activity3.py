a=input('enter a name:')
b=input('enter b name:')
if a=="rock" and b=="scissors":
    print("rock wins")
elif a=="scissors" and b=="paper":
    print("scissors wins")
elif a=="paper" and b=="rock":
    print("paper wins")
elif a=="rock" and b=="paper":
    print("paper wins")
elif a=="paper" and b=="scissors":
    print("paper wins")
elif a=="scissors" and b=="rock":
    print("scissors wins")
elif a==b:
    print("draw")