num = 12340

# Standard method - iterates digit by digit
def reverseNumber(num):
    new_num = 0
    while num:
        new_num = new_num * 10 + (num % 10)
        num //= 10
    return new_num
    
print(reverseNumber(num))

# One Liner
print(int(str(num)[::-1]))
