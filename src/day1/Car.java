package day1;

public class Car {

    static String model;
    static String color;
    static int power,result;

   public static void main(String[] args) {
         Car car1= new Car();
         color="red";
         model="Inova Crysta";
         power=250;
        System.out.println(model);
        System.out.println(color);
        System.out.println(power);
        Car.start();
        Car.stop();
        car1.sum(4,5);
    }
   public static void start()
    {

        System.out.println("Car Started");
    }

    public static String stop()
    {
        String output ="Car Stopped";
        System.out.println(output);
        return output;

    }
    public int sum (int a, int b)
    {
        result=a+b;
        System.out.println(result);
        return result;

    }
}
