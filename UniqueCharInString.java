// Returns whether all the characters in a string are Unique.

public static boolean areAllCharactersUnique(String str){
    if(str == null)
        return true;
    
    // Add new items to a hash set and look them up 
    Set<Character> hash_set = new HashSet<Character>();
    
    for(int i = 0; i < str.length(); i++){
        if(hash_set.contains(str.charAt(i)))
            return false;
        else
            hash_set.add(str.charAt(i));
    }
    
    return true;
    
}
