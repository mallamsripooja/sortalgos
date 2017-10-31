'''
Bubble sort algorithm implementation in Python
Space complexity = O(1)
Time complexity = O(n^n)
'''
def bubblesort(arr):
    for i in range(len(arr)-1):
        for j in range(len(arr)-i-1):
            if (arr[j]>arr[j+1]):
                arr[j], arr[j+1] = arr[j+1], arr[j]
    return arr

print(", ".join(map(str,bubblesort([12,1,78,100,4,23,51,4,11,20,99]))))
