package com.company.;

public class Main {



    // Generic method to return the smallest of the 4 objects

    public static <T extends Comparable<T>> T minimum(T obj1, T obj2, T obj3, T obj4)

    {

        T min = obj1;

        if(min.compareTo(obj2) > 0)

            min = obj2;

        if(min.compareTo(obj3) > 0)

            min = obj3;

        if(min.compareTo(obj4) > 0)

            min = obj4;



        return min;

    }



    public static void main(String [] args)

    {

        LuxCar car1 = new LuxCar("Make1", "Model1",120,1);

        LuxCar car2 = new LuxCar("Make2", "Model2",150,2);

        LuxCar car3 = new LuxCar("Make3", "Model3",50,3);

        LuxCar car4 = new LuxCar("Make4", "Model4",100,4);



        System.out.println(minimum(car1,car2,car3,car4));

        System.out.println("Number of cars created : "+Car.countCars());

    }

}