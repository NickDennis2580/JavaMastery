// Simple Bubble Sort in Java

public static int[] bubbleSortArray(int[] arr){
    if(arr.length < 1)
        return arr;
    
    boolean swapped = true;
    int temp = 0;
    
    while(swapped == true){
        swapped = false;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
                swapped = true;
            }
        }
    }
    return arr;
}
