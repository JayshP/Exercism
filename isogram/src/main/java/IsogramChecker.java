import java.util.*;
class IsogramChecker {

    boolean isIsogram(String phrase) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	HashSet<Character> h = new HashSet<>(); 
	char[] alphabets = phrase.toCharArray();
	for(char c:alphabets){
		c=Character.toLowerCase(c);
		if(h.contains(c) && Character.isLetter(c)){
			return false;
		}
		else{
			h.add(c);
		}
	}
	return true;
    }

}
