'''
Implementation of insertion sort in Python
Space complexity = O(1)
Time complexity = O(n*n)
'''
def insertionsort(arr):
    for i in range(1,len(arr)):
        key = arr[i]
        j = i-1
        while (j>=0 and arr[j]>key):
            arr[j+1]=arr[j]
            j=j-1
        arr[j+1]=key
    return arr

print(", ".join(map(str,insertionsort([11,34,28,100,4,2,1,56,2,49,81]))))
