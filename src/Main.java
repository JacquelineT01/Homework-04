// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Car firstCar = new Car();
        firstCar.brand = "Mercedes";
        firstCar.model = "E class";
        firstCar.year = 2020;
        firstCar.startEngine();
        firstCar.stopEngine();

        System.out.println("Car Brand: " + firstCar.brand);
        System.out.println("Car Model: " + firstCar.model);
        System.out.println("Car Year: " + firstCar.year);

        Calculator calculator = new Calculator();
        int addition = calculator.addition(4,6);
        System.out.println("Result of addition: " + addition);

        boolean isGreater = calculator.isGreater(50.67, 5.5);
        System.out.println("Num1 is greater than num2 : " + isGreater);

        NumberManipulator manipulator = new NumberManipulator();
        int number = 100;
        System.out.println("Initial number: " + number);

        int incrementedNumber = manipulator.incrementByOne(number);
        System.out.println("Number after increment: " + incrementedNumber);

        int decrementedNumber = manipulator.decrementByOne(number);
        System.out.println("Number after decrement: " + decrementedNumber);

    }
}