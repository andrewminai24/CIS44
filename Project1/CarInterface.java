/*
Author:Andrew Minai
Description:This file has a interface declared
in order to give a clear understanding of the methods
that are needed to be written.So that if you were to work in
a group, the people working on the code can see which methods 
need to be written.
*/
public interface CarInterface {
    public double pumpGas(int gas);
    public void goFast(int fast);
    public void goSlow(int slow);
   //public void display();
    public void stop();
}