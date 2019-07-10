class Acronym {
    private String acronym="";

    Acronym(String phrase) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	String[] split = phrase.split("[ _-]");
	for(String word:split){
	if(!word.isEmpty()){
	char a=word.charAt(0);
	if(Character.isLetter(a)){
	acronym=acronym+Character.toUpperCase(a);	
	}
	}	
	}
	
	
    }

    String get() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	return acronym;
    }

    //public static void main(String[] args){
	//Acronym ac=new Acronym("Something - I made up from thin air");
	
	//System.out.println(ac.get());
//}
}
