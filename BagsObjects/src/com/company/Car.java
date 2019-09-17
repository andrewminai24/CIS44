 class Car implements Comparable<Car>{
        private String model;
        private String make;
        private int speed;
        private static int numCars = 0;

    public Car()

    {

        model = "";

        make="";

        speed= 0;

        numCars++;

    }
    public Car(String make, String model, int speed)

    {

        this.model = model;

        this.make = make;
:w:w:wq
        this.speed = speed;

        numCars++;

    }

    / setters

    public void setModel(String model)

    {

        this.model = model;

    }



    public void setMake(String make)

    {

        this.make = make;

    }



    public void setSpeed(int speed)

    {

        this.speed = speed;

    }

    // getters

    public String getModel()

    {

        return model;

    }



    public String getMake()

    {

        return make;

    }



    public int getSpeed()

    {

        return speed;

    }

    public int compareTo(Car car)

    {

        // Cars are compared based on their speed

        return(speed-car.getSpeed());

    }

    public static int countCars()

    {

        return numCars;

    }

    public String toString()

    {

        return("Make : "+make+" Model : "+model+" Speed : "+speed);

    }

}


