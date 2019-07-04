import java.util.*;
class TwelveDays {
    static List<String> gifts=new ArrayList<String>(){{
    add("a Partridge in a Pear Tree");
    add("two Turtle Doves");
    add("three French Hens");
    add("four Calling Birds");
    add("five Gold Rings");
    add("six Geese-a-Laying");
    add("seven Swans-a-Swimming");
    add("eight Maids-a-Milking");
    add("nine Ladies Dancing");
    add("ten Lords-a-Leaping");
    add("eleven Pipers Piping");
    add("twelve Drummers Drumming");
}};
    static List<String> days=new ArrayList<String>(){{
    add("first");
    add("second");
    add("third");
    add("fourth");
    add("fifth");
    add("sixth");
    add("seventh");
    add("eighth");
    add("ninth");
    add("tenth");
    add("eleventh");
    add("twelfth");
}};
    
    String verse(int verseNumber) {
       // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	try{
	String line = "On the "+days.get(verseNumber-1)+" day of Christmas my true love gave to me: ";
	if(verseNumber==1){
	line = line+gifts.get(verseNumber-1)+".\n";
	}
	else{
	for(int i = verseNumber;i>=2;i--)
	{
	line=line+gifts.get(i-1)+", ";
	}
	line=line+"and "+gifts.get(0)+".\n";
	}
	return line;
	}
	catch(IndexOutOfBoundsException e) {
          return String.format("%d is an ivalid verse number.",verseNumber);
         }
    }

    String verses(int startVerse, int endVerse) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	String lines="";
	for(int i=startVerse;i<endVerse;i++){
		lines=lines+verse(i)+"\n";
	}
       
	return lines+verse(endVerse);
    }
    
    String sing() {
       // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	return verses(1,days.size());
    }
  // public static void main(String[] args){
    //TwelveDays twelvedays=new TwelveDays();	
    
    //System.out.println(twelvedays.sing());
//}
}
