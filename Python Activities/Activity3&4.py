p1=input("Enter your name:")
p2=input("Enter your name:")

p1choice=input(p1+"-What do u choose? \n Rock \n Paper \n Scissor \n").lower()
p2choice=input(p2+"-What do u choose? \n Rock \n Paper \n Scissor \n").lower()

while True:
    if(p1choice==p2choice):
        print("It's a Tie")
    elif(p1choice=="rock"):
        if(p2choice=="scissor"):
            print(p1," is the Winner")
        else:
            print(p2," is the Winner")
    elif(p1choice=="scissor"):
        if(p2choice=="paper"):
            print(p1," is the Winner")
        else:
            print(p2," is the Winner")
    elif(p1choice=="paper"):
        if(p2choice=="rock"):
            print(p1," is the Winner")
        else:
            print(p2," is the Winner")

    regame=input("Do you want to play again? y/n \n")

    if(regame=='y'):
        pass
    else:
        raise SystemExit