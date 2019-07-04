class RaindropConverter {

    String convert(int number) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	String raindrop="";
	if(number%3==0){
	raindrop=raindrop+"Pling";
	}
	if(number%5==0){
	raindrop=raindrop+"Plang";
	}
	if(number%7==0){
	raindrop=raindrop+"Plong";
	}
	if(raindrop.isEmpty()){
	raindrop=raindrop+number;
	}
	return raindrop;
    }

}
