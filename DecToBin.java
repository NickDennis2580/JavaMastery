// Converts an integer value into its binary representation in the form of a string.
public static String computeBinary(int val) {

    StringBuilder binary = new StringBuilder();
    if(val == 0)
        return "0";
    
    while(val > 0){
        binary.insert(0,val%2); 
        val = val / 2;
    }
    
    return binary.toString();

}
