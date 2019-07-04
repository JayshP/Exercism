class ReverseString {

    String reverse(String inputString) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	//if(inputString==null) || inputString.isEmpty()){
	if(inputString==null){
	return null;	
	}
	char[] chararray = inputString.toCharArray();
	int left=0;
	int right=chararray.length-1;
	while(left<=right){
	char temp=chararray[left];
	chararray[left]=chararray[right];
	chararray[right]=temp;
	left++;
	right--;	
	}
	return new String(chararray);
    }
   
  
}
