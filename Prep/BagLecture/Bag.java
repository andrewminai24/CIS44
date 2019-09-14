public class BagInterface{
	
	public static void main(String[] args){

	<String>b1 = new ArrayBag<>();

	b1.add("Apple");
	b1.add("Milk");
	b1.add("icecream");
	b1.add("Orange");
	BagInterface<String> b2  = new ArrayBag<>();
	b2.add("Apple"); //Bag[0] 
	b2.add("pear");	//Bag[1]
	b2.add("ChocMilk"); //Bag[2]
	b2.add("meat");	   //Bag[3]
	BagInterface<String> b3 = new ArrayBag<>() b3; //reference variable; 
	b3 = b1.difference(b2); Bag[4];

}
