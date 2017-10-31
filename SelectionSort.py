'''
Selection sort algorithm implementation in Python
Space complexity = O(1)
Time complexity = O(n^n)
'''
def selectionsort(arr):
    for i in range(len(arr)-1):
        ind=i

        # Finding min num in the unsorted subarray
        for j in range(i+1,len(arr)):
            if (arr[j]<arr[ind]):
                ind=j

        # Swap the arr numbers
        arr[i], arr[ind] = arr[ind], arr[i]

    return arr

# To print list of numbers as a comma separated string
print(", ".join(map(str,selectionsort([2,45,6,10,34,51,10,68,100,1]))))
