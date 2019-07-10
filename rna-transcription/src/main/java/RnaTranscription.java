import java.util.*; 
class RnaTranscription {
    static HashMap<Character, Character> hm = new HashMap<Character, Character>();

    static {
    hm.put('G','C'); 
    hm.put('C', 'G'); 
    hm.put('A','U'); 
    hm.put('T', 'A'); 
    hm.put('g','C'); 
    hm.put('c', 'G'); 
    hm.put('a','U'); 
    hm.put('t', 'A'); 
    hm.put('1','C'); 
    hm.put('2', 'G'); 
    hm.put('3','A'); 
    hm.put('4', 'U'); 
    }

    String transcribe(String dnaStrand) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	int len = dnaStrand.length();
	char[] rna = new char[len];
	char c='a';
	for(int i=0;i<len;i++){
		char a=dnaStrand.charAt(i);	
		if (hm.containsKey(a)){
			c=hm.get(a);}
		
		else{
			System.out.println("Invalid DNA strand");
			return null;
		}
		rna[i]=c;
			
	}
	
	return new String(rna);

}
   // public static void main(String[] args){
	//RnaTranscription rnatrans=new RnaTranscription();
	//String newStrand=rnatrans.transcribe("Aa");
	//System.out.println(newStrand);
//}
}
