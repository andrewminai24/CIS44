
/**
  
  Author: Andrew Minai
  Description:This File is where the main function
  is displayed and to test all the functions such as pumpGas,goFast.
 */
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("CRV",12);
        Car car2 = new Car("Honda Civic", 2005);
        Car car3 = new Car("911", 150, 12);
        
        car1.goFast(12);
        car1.goFast(13);
        
        car2.pumpGas(10);
        car3.pumpGas(12);
        
        Car[] cars = {
            car1,
            car2,
            new Car(car3),
            new Car("porsche", -5, 9),
            new Car("honda", 5, -9),
            new Car("ferrari", 55, 5),
            new Car("dodge", 555, 8),
            new Car("fastest car", 333, 13),
            new Car("truck", 123, 4),
            new Car("toyota", 999, 99)
        };
        
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}