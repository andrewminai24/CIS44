package com.company


public class LuxCar extends Car{

      

       private int airCondition ;

      

       public LuxCar()

       {

             super();

             airCondition = 0;

       }

      

       public LuxCar(String make, String model, int speed, int airCondition)

       {

             super(make,model,speed);

             this.airCondition = airCondition;

       }

      

       public void setAirCondition(int airCondition)

       {

             this.airCondition = airCondition;

       }

      

       public int getAirCondition()

       {

             return airCondition;

       }

      

       public String toString()

       {

             return(super.toString()+" Air Condition : "+airCondition);

       }

}


