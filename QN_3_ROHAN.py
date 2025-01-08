n = 10


# Recursive solution : TC - O(n) , SC - O(n)
def fibonacci_1(n):
    if n == 1 or n == 2:
        return 1
    return fibonacci_1(n - 1) + fibonacci_1(n - 2)
    
sequence_1 = [fibonacci_1(i) for i in range(1, n + 1)]
print(sequence_1)


# Memoized solution : TC - O(n) , SC - O(n)
def fibonacci_2(n):
    if n in memo:
        return memo[n]
    memo[n] = fibonacci_1(n - 1) + fibonacci_1(n - 2)
    return memo[n]
    
memo = {1 : 1, 2 : 1}
sequence_2 = [fibonacci_2(i) for i in range(1, n + 1)]
print(sequence_2)


# Dynamic Programming solution : TC - O(n) , SC - O(n) 
def fibonacci_3(n):
    series = [1, 1]
    for i in range(n - 2):
        series.append(series[-1] + series[-2])
    return series[-1]
    
sequence_3 = [fibonacci_3(i) for i in range(1, n + 1)] 
print(sequence_3)


# Dynamic Programming space optimized solution : TC - O(n) , SC - O(1)  
def fibonacci_4(n):
    curr = prev = prev_prev = 1
    for i in range(n - 2):
        curr = prev + prev_prev
        prev_prev = prev
        prev = curr
    return curr
    
sequence_4 = [fibonacci_4(i) for i in range(1, n + 1)] 
print(sequence_4)


