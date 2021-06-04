def factorial(n):

    factor = 1
    for i in range(n):
        factor *= i+1
    return factor

print(factorial(4))