n = 12321

# Standard method - stores every digits in an list and checks the list
def isPalindrome(n):
    stk = []
    while n:
        stk.append(n % 10)
        n //= 10
    low = 0
    high = len(stk) - 1
    while low < high:
        if stk[low] != stk[high]:
            return False
        low += 1
        high -= 1
    return True
    
print(isPalindrome(n))

# One Liner
print(str(n) == str(n)[::-1])
