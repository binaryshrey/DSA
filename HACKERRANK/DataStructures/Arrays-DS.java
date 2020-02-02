// Complete the reverseArray function below.
    static int[] reverseArray(int[] arr) {
        int i=0,j=arr.length-1,temp=0;
        while(i<arr.length/2){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            temp = 0;
            i++;j--;
        }
        return arr;

    }
