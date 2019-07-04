class RnaTranscription {

    String transcribe(String dnaStrand) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	int len = dnaStrand.length();
	char[] rna = new char[len];
	char c='a';
	for(int i=0;i<len;i++){
		char a=dnaStrand.charAt(i);	
		if (a=='G'){
			c='C';}
		else if (a=='C'){
			c='G';
			}
		else if (a=='A'){
			c='U';
			}
		
		else if(a=='T'){
			c='A';}
		else{
			System.out.println("Invalid DNA strand");
			return null;
		}
		rna[i]=c;
			
	}
	
	return new String(rna);

}
    //public static void main(String[] args){
	//RnaTranscription rnatrans=new RnaTranscription();
	//String newStrand=rnatrans.transcribe("A");
	//System.out.println(newStrand);
//}
}
