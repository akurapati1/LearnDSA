def nForest(n:int) ->None:
    for i in range(n):
        for j in range(0,i+1):
            print("* ", end="")
        print("")

if __name__ == "__main__":
    nForest(3)