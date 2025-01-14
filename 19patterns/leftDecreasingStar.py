def seeding(n: int) -> None:
   for i in range(1,n+1):
        for j in range(i,n+1):
            print("*", end=" ")
        print("")

if __name__ == "__main__":
    seeding(3)