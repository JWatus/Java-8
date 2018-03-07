package ex_9;

public class Main {

    public static void main(String[] args) {

        Car s = new Truck();
        Car f = new Bus();

        printCar(s);
        printCar(f);
    }

    public static void printCar(Car c){
        System.out.println(c.getClass().toString() + " - " + c.showAttributes());
    }

}
