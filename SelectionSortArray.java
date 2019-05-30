// Selection Sort an Array
public static int[] selectionSortArray(int[] arr){
    
    int tmin, tpos, swap;
    
    for(int i = 0; i < arr.length; i++){
        tmin = arr[i];
        tpos = i;
        
        for(int j = i; j < arr.length; j++){
            if(arr[j] < tmin){
                tmin = arr[j];
                tpos = j;
            }
        }
        if(tpos != i){
            swap = arr[i];
            arr[i] = tmin;
            arr[tpos] = swap;
        }
    }
    return arr;
}
