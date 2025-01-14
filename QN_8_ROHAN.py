num = 153

# Standard method - iterates digit by digit
def armstrongNumber(num):
    sum_of_cubes = 0
    n = num
    while num:
        digit = num % 10
        sum_of_cubes += digit ** 3
        num //= 10
    return sum_of_cubes == n
    
print(armstrongNumber(num))

# One Liner
print(sum(int(digit) ** 3 for digit in str(num)) == num)
