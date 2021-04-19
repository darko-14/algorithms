from random import shuffle

def selectionSort(list, size):
    for step in range(size):
        min = step
        for i in range(step+1, size):
            if list[i] < list[min]:
                min = i

        (list[step], list[min]) = (list[min], list[step])


list = [i for i in range(30)]   
size = len(list)
shuffle(list)
print(list)
selectionSort(list, size)
print(list)
