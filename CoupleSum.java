// Finds the index of two numbers in an array such that they add up to a target value

public static int[] coupleSum(int[] numbers, int target) {
    
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    
    int temp;
    int result[] = new int[2];
    for(int i = 0; i < numbers.length; i++){
        temp = target - numbers[i];
        map.put(temp, i);
        if(map.containsKey(numbers[i])){
            result[0] = map.get(numbers[i]) + 1;
            result[1] = i + 1;
            return result;
        }
    }
    
    return result;
}
