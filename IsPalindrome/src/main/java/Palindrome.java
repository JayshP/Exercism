import java.util.regex.Matcher;

 
public class Palindrome {
    String regex = "^[a-zA-Z0-9]?$"; //to specify characters which are considered for palindrome
    boolean ignoreCase= true;	 
    public boolean check(String sentence) {
	
	if(sentence.isEmpty()){
	return true;
	}
	String newSentence=sentence;
	newSentence=checkCaseSensitivity(newSentence);
	newSentence=removeUnacceptedChars(newSentence);
	if(newSentence.isEmpty()){
	return false;
	}
	char[] letter=newSentence.toCharArray();
	int leftEnd=0;
	int rightEnd=letter.length-1;
	
	while(leftEnd<=rightEnd){
		if(letter[leftEnd]==letter[rightEnd]){
			leftEnd++;
			rightEnd--;
		}
		else{
		return false;
		}
					
	}
			        
	return true;
    }

    public String checkCaseSensitivity(String input){
	if(ignoreCase){
		return input.toUpperCase();	
	}
	return input;
	
    }

    public String removeUnacceptedChars(String input){
	String output="";
	for(int i=0;i<input.length();i++){
		if(Character.toString(input.charAt(i)).matches(regex)){
			output=output+input.charAt(i);
		}
	}
	return output;
    }
   

}
