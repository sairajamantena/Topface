inva = ['3','4','7']

def is_valid(n):
    for i in str(n):
        if i in inva:
            return False
    return True

n = int(input())

if n > 0:
    c = 0
    t = 1

    while(c != n):
        if is_valid(t):
            c += 1
        t += 1

    print(t-1)
