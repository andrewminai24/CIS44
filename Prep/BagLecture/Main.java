package ClassAssignment;

public class Main {
    public static void main(String[] args) {
        BagInterface<Item> bag = new ArrayBag<>();

        bag.add(new Item("Apple", 6.25, 5));
        bag.add(new Item("Orange", 4.5, 3));
        bag.add(new Item("Pear", 7.0, 2));
        bag.add(new Item("Lemon", 2.8, 1));
        bag.add(new Item("Milk", 9.99, 5));

        bag.display();

        double total = 0.0;

        for (int i = 0; i < bag.getCurrentSize(); i++) {
            total += bag.getItem(i).getPrice();
        }

        System.out.printf("Total Price: $%.2f\n",total);
    }
}