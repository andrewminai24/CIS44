
/*
  
  Author: Andrew Minai
  Description:This File is where the main function
  is displayed and to test all the functions such as pumpGas,goFast.
 
 Why Java does not make each class comparable itself?
 because Java does not know how you want to compare your 
 classes.

 ADT = Abstract data type.

 Que = goes in order.
 */


public class Main {
	/*
    public static Integer  maximum(Integer x, Integer y, Integer z)
    {
    	Integer largest = x;
    	if (y.compareTo(largest) > 0)
  		  largest = y;
  	 // if (z > largest)
  	if (z.compareTo(largest) > 0)
  		  largest = z;
  	  return largest;
    }
    
    public static Double  maximum(Double x, Double y, Double z)
    {
    	Double largest = x;
    	if (y.compareTo(largest) > 0)
  		  largest = y;
  	 // if (z > largest)
  	if (z.compareTo(largest) > 0)
  		  largest = z;
  	  return largest;
    }
    
    public static Character  maximum(Character x, Character y, Character z)
    {
    	Character largest = x;
    	if (y.compareTo(largest) > 0)
  		  largest = y;
  	 // if (z > largest)
  	if (z.compareTo(largest) > 0)
  		  largest = z;
  	  return largest;
    }
    
    public static String  maximum(String x, String y, String z)
    {
    	String largest = x;
    	  //if (y > largest)
    	if (y.compareTo(largest) > 0)
    		  largest = y;
    	 // if (z > largest)
    	if (z.compareTo(largest) > 0)
    		  largest = z;
    	  return largest;
    }
    
    public static Car  maximum(Car x, Car y, Car z)
    {
    	Car largest = x;
    	  //if (y > largest)
    	if (y.compareTo(largest) > 0)
    		  largest = y;
    	 // if (z > largest)
    	if (z.compareTo(largest) > 0)
    		  largest = z;
    	  return largest;
    }
    
    */
	
	
	
	 public static <T extends Comparable<T>> T  maximum(T x, T y, T z)
	    {
	    	T largest = x;
	    	  //if (y > largest)
	    	if (y.compareTo(largest) > 0)
	    		  largest = y;
	    	 // if (z > largest)
	    	if (z.compareTo(largest) > 0)
	    		  largest = z;
	    	  return largest;
	    }
    
	public static void main(String[] args) {
		
		System.out.println("Number of cars so for is " + Car.getCount());

		String x;
		Integer[] list1 = new Integer[10];
		list1[0] = 3;
		list1[1] = 7;
		
		for(int i = 0; i< 10; i++)
			list1[i] = i * 3;
		
		for(int i : list1)
			System.out.println(i);
		/*
		Why can I create an array of Integer type
		But I can place int values in it?
		Reason: Java does auto wrapping and unwrapping
		automatically.
		*/
		
		int result = maximum(5, 8, 2);
		String maxString = maximum("cbs", "zbc", "abc");
		
		System.out.println("Maximum of is " + result);
		System.out.println("*****Maximum of is " + maxString);

		
		
		Car car1 = new Car();
		Car car2 = new Car();
		Car car8 = new Car();
		
		Car c = maximum(car1, car2, car8);
		
		car1.pumpGas(4);
		System.out.println("Number of cars so for is " + Car.getCount());
				
		Car[] list = new Car[10];
		
		for(int i= 0; i < 10; i++)
		{
			list[i] = new Car();
		}
		
		list[0].setTank(5);
		list[0].setSpeed(20);
		list[0].setModel("Honda");
		
		
		System.out.println("********USING toString****");
		System.out.println(car1);
		System.out.println("********REST OF THE CODE****");

		list[1].setTank(5);
		list[1].setSpeed(20);
		list[1].setModel("Honda");
		
		
		list[2].setTank(15);
		list[2].setSpeed(200);
		list[2].setModel("Toyota");
		
		
		list[3].setTank(10);
		list[3].setSpeed(100);
		list[3].setModel("Tesla");		
	}

}
