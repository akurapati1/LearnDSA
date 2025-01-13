def nNumberTriangle(n: int) -> None:
    
    for i in range(1,n+1):
        for j in range(i,n+1):
            print(j-i+1, end=" ")
        print("")