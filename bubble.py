from random import shuffle

def bubbleSort(list):
    for i in range (len(list)):
        for j in range(len(list)- i -1):
            if list[j] > list[j+1]:
                (list[j], list[j+1]) = (list[j+1], list[j])


list = [i for i in range(30)]   
shuffle(list)
print("Shuffled list:")
print(list)
bubbleSort(list)
print()
print("Ordered list:")
print(list)
