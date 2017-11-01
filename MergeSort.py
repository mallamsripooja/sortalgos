'''
Implementation of merge sort in Python
Space complexity = O(n)
Time complexity = O(nlogn)
'''
def merge(arr,l,m,r):
    n1 = m-l+1
    n2 = r-m

    leftarr = [0]*n1
    rightarr = [0]*n2

    for i in range(0,n1):
        leftarr[i]=arr[l+i]
    for i in range(0,n2):
        rightarr[i]=arr[m+i+1]

    i=0; j=0; k=l
    while (i<n1 and j<n2):
        if (leftarr[i]<=rightarr[j]):
            arr[k]=leftarr[i]
            k+=1; i+=1
        else:
            arr[k]=rightarr[j]
            k+=1; j+=1

    while (i<n1):
        arr[k]=leftarr[i]
        k+=1; i+=1
    while (j<n2):
        arr[k]=rightarr[j]
        k+=1; j+=1

def sort(arr,l,r):
    if l<r:
        m = l+(r-l)//2

        sort(arr,l,m)
        sort(arr,m+1,r)

        merge(arr,l,m,r)

arr=[41,23,63,40,1,5,18,106,49,5,41]
sort(arr,0,len(arr)-1)
print(", ".join(map(str,arr)))
