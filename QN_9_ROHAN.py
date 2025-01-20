#Best and quickest Prime check - TC - O(n), SC - O(n)
def isPrime(n):
    if n < 2:
        return False
    if n < 4: return True
    if n % 2 == 0 or n % 3 == 0:
        return False
    for i in range(5, int(n ** 0.5) + 1, 6):
        if n % i == 0 or n % (i + 2) == 0:
            return False
    return True
    
n = 100
for i in range(n + 1):
    if isPrime(i):
        print(i, end = ' ')
