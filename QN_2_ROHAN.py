# Default Prime check everyone follow - TC - O(n), SC - O(n)
def isPrime(n):
    if n < 2:
        return False
    if n == 2:
        return True
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True
    
#Best and quickest Prime check - TC - O(n), SC - O(n)
def isPrimeQuick(n):
    if n < 2:
        return False
    if n < 4: return True
    if n % 2 == 0 or n % 3 == 0:
        return False
    for i in range(5, int(n ** 0.5) + 1, 6):
        if n % i == 0 or n % (i + 2) == 0:
            return False
    return True

#Printing Primes between 0 to 100
primes_from_default = [i for i in range(100) if isPrime(i)]
primes_from_quick = [i for i in range(100) if isPrimeQuick(i)]
print(primes_from_default)
print(primes_from_quick)
