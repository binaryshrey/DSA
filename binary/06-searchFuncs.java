Library Implementations
-----------------------


- Arrays.binarySearch(arr,x)
- Arrays.binarySearch(arr,l,r,x)

- Collections.binarySearch(arr,x)
- Collections.binarySearch(arr,x, Collections.reverseOrder())


Arrays.binarysearch() works for arrays which can be of primitive data type also. 
Collections.binarysearch() works for objects Collections like ArrayList and LinkedList.

If input list is not sorted, the results are undefined.
If there are duplicates, there is no guarantee which one will be found.
This method runs in log(n) time for a “random access” list like ArrayList. 
