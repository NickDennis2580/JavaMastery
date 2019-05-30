// Finds and returns the first non-repeated character in a string

public static Character firstNonRepeatedCharacter(String str) {

    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    // Put everything in a map 
    // Associate each character with their count, if more then 1 set to 2.
    char c;
    for(int i = 0; i < str.length(); i++){
        c = str.charAt(i);
        if(map.containsKey(c))
            map.put(c,2);
        else
            map.put(c,1);
    }
    for(int j = 0; j < str.length(); j++){
        if(map.get(str.charAt(j)) == 1)
            return str.charAt(j);
    }
    
    return null;
}
