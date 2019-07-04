import java.util.*;
public class Anagram{
	String anagram;
	public Anagram(String anagram){
	this.anagram=anagram;
	}
	List<String> match(List<String> anagrams){
	ArrayList<Character> chars = new ArrayList<Character>();
	for (int x = 0; x < anagram.length(); x++){
            chars.add(anagram.charAt(x));
        }
	List<String> matches=new ArrayList<String>();
	for(String word:anagrams){
		if(word.length()==anagram.length()){
			if(!word.equalsIgnoreCase(anagram)){
				ArrayList<Character> chars1 = new ArrayList<Character>();
				for (int x = 0; x < word.length(); x++){
            				chars1.add(Character.toLowerCase(word.charAt(x)));
        			}
	
				int len1=anagram.length();
	
				int i=0;
				for(i=0;i<len1;i++){
					if(chars1.contains(Character.toLowerCase(chars.get(i)))){
						chars1.remove(chars.get(i));	
						System.out.println(chars.get(i));
					}
					else{
						break;		
					}
				}
				//System.out.println(i); 
				if(i==len1){
					matches.add(word);
				//System.out.println("ji"); 
				}
			}
		}
	}
	
	return matches;
}
//public static void main(String[] args){
//	Anagram detector = new Anagram("master");
  //      List<String> anagrams = detector.match(Arrays.asList("stream", "pigeon", "maters"));
	//for (String num : anagrams) { 		      
          // System.out.println(num); 		
      //}
	//System.out.printnln(anagrams);
//}
}
