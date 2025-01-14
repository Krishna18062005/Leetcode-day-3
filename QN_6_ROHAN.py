n = 12345

# Standard method - counts digit by digit
def numberLength(n):
    cnt = 0
    while n:
        cnt += 1
        n //= 10
    return cnt
    
print(numberLength(n))

# One Liner
print(len(str(n)))
