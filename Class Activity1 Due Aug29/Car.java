

public class Car implements CarInterface{
    private String model;
    private int speed;
    private int tank;
    
    public Car () {
        this("quickest model", 0, 0);
    }
    
    public Car (String model) {
        this(model, 0, 0);
    }
    
    public Car (String model, int speed) {
        this(model, speed, 0);
    }
    
    public Car (Car car) {
        this(car.getModel(), car.getSpeed(), car.getTank());
    }
    
    public Car (String model, int speed, int tank) {
        this.model = model;
        
        if (speed < 0) {
            this.speed = 0;
        }else {
            this.speed = speed;
        }
        
        if (tank > 15) {
            this.tank = 15;
        }
        
        else if (tank < 0) {
            this.tank = 0;
        }else{
            this.tank = tank;
        }
    }
    
    public int getTank() {
        return tank; 
    }
    
    public int getSpeed() {
        return speed; 
    }
    
    public String getModel() {
        return model; 
    }
    
    public void setTank(int tank) {
        this.tank = tank;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    @Override
    public double pumpGas(int gas) {
        if (tank + gas > 15) {
            gas = 15 - tank;
        }
        
        this.tank += gas;
        
        return 3.25 * gas;
    }
    
    @Override
    public void goFast(int fast) {
        if (fast > 0) {
            this.speed += fast;
        }
    }
    
    @Override
    public void goSlow(int slow) {
        this.speed -= slow;
        
        if (speed < 0) {
            this.stop();
        }
    }
    
    @Override
    public void stop() {
        this.speed = 0;
    }
    
    @Override
    public String toString() {
        return String.format(
                "Model: %s\nSpeed: %d\nAmount of Gas: %d",model,speed,tank);
    }
}