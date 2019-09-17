/*
Author:Andrew Minai
In our function we are creating a bag of type Item
that has several objects in the bag.
The main method is where we created our objects.
*/


public class Driver {
    public static void main(String[] args) {
        BagInterface<Item> bag = new ArrayBag<>();

        bag.add(new Item("Apple", 10.24, 1));
        bag.add(new Item("Orange", 3.5, 2));
        bag.add(new Item("Pear", 1.0, 2));
        bag.add(new Item("Lemon", 9.8, 1));
        bag.add(new Item("Milk", 1.99, 2));

        bag.display();

        double total = 0.0;

        for (int i = 0; i < bag.getCurrentSize(); i++) {
            total += bag.getItem(i).getPrice();
        }

        System.out.printf("Total Price: $%.2f\n",total);
    }
}