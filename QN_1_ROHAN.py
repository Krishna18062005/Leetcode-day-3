# Recursive solution : TC - O(n) , SC - O(n)
def factorial_1(n):
    if n < 2:
        return 1
    return n * factorial_1(n - 1)
print(factorial_1(5))
    
# Memoized solution : TC - O(n) , SC - O(n)    
def factorial_2(n):
    if n in memo:
        return memo[n]
    memo[n] = n * factorial_2(n - 1)
    return memo[n]
memo = {0 : 1, 1 : 1}
print(factorial_2(5))

# Dynamic Programming solution : TC - O(n) , SC - O(n)    
def factorial_3(n):
    fact = [1] * (n + 1)
    for i in range(1, n + 1):
        fact[i] = i * fact[i - 1]
    return fact[n]
print(factorial_3(5))

# Dynamic Programming space optimized solution : TC - O(n) , SC - O(1)    
def factorial_4(n):
    prev = 1
    for i in range(1, n + 1):
        curr = i * prev
        prev = curr
    return curr
print(factorial_4(5))
