a = [25, 35, 14, 12, 1, 13, 5, 2]
print(a)

for i in range(1, len(a)):
    key = a[i]
    j = i - 1
    while(j >= 0 and a[j] > key):
        a[j+1] = a[j]
        j = j - 1

    a[j+1] = key

    print(a)

