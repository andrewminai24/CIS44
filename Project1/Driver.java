/*
Write a program to have a Car class which is comparable.
 Make the Car class comparable and use speed to compare cars. 
Write a method in Main class that finds the minimum of 4 things (generically).
 Create 4 cars and pass the cars to the minimum method and find the smallest car. 
 Have a toString method for the Car class. 
 The main program should be able to find out how many cars are created so far by calling a static method called countCars.
 Create another class called LuxCar that extends the class Car. 
 You may have an additional member variable called airCondition of type intger (with setters and getters). 
 Make the variables in Car class protected. 
 Create 4 LuxCar objects and find the smallest one.
  Does LuxCar objects work with minimum method?
  
  due september12th
*/



public class Driver {

	public static void main(String[] args) {
		BagInterface<String> b1 = new ArrayBag<>();
		BagInterface<String> thingsToBuy = new ArrayBag<>();
		b1.add("apple");
		b1.add("orange");
		b1.add("pear");
		String item = "lemon";
		if (b1.contains(item))
			System.out.println("We already have " + item);
		else
		{
			System.out.println("Buy " + item);
			thingsToBuy.add(item);
		}
		
		item = "apple";
		if (b1.contains(item))
			System.out.println("We already have " + item);
		else
		{
			System.out.println("Buy " + item);
			thingsToBuy.add(item);
		}
		
		item = "milk";
		if (b1.contains(item))
			System.out.println("We already have " + item);
		else
		{
			System.out.println("Buy " + item);
			thingsToBuy.add(item);
		}
		
		
		System.out.println("Buy the following items: " );
		thingsToBuy.display();
		
		

	}

}
