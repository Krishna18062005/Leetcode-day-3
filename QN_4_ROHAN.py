a = 24
b = 56

# Recursive solution : TC - O(log(min(a, b))) , SC - O(log(min(a, b)))
def recursive_gcd(a, b):
    if b == 0:
        return a
    return recursive_gcd(b, a % b)
    
print(recursive_gcd(a, b))


# Iterative solution : TC - O(log(min(a, b))) , SC - O(1)
def euclid_gcd(a,b):
    while b != 0:
        a, b = b, a % b
    return a
    
print(euclid_gcd(a, b))
