class Twofer {
    String twofer(String name) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	String output=(name==null) ? "you" : name;
	return String.format("One for %s, one for me.",output);
	
    }
    //public static void main(String[] args){
	//Twofer t = new Twofer();
	//String i=t.twofer(null);
	//System.out.println(i);
//}
   
}
