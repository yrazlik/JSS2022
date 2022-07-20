package com.obss.jss.day2;

public class PassByValueReference7 {

    // https://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value
    public static void main(String[] args) {
        Car1 car1 = new Car1("red", 100);
        int x = 5;

        System.out.println("1- Color of car inside main() method before modifyReferenceOfCar() call is: " + car1.getColor());
        modifyReferenceOfCar(car1);
        System.out.println("3- Color of car inside main() method after modifyReferenceOfCar() call is: " + car1.getColor());
        changeColorOfCar(car1);
        System.out.println("5- Color of car inside main() method after changeColorOfCar() is: " + car1.getColor());

        incrementValue(x);
        System.out.println("7- Value of x in main() method is: " + x);

        int [] numbers = {0, 1, 2, 3, 4}; // <---numbers
        System.out.println("8- Value of numbers[0] in main() method before incrementArrayElementAtIndex call is: " + numbers[0]);
        incrementArrayElementAtIndex(0, numbers);
        System.out.println("10- Value of numbers[0] in main() method after incrementArrayElementAtIndex call is: " + numbers[0]);
        incrementSpecificElementInArray(numbers[1]);
        System.out.println("11- Value of numbers[1] in main() method after incrementSpecificElementInArray() call is: " + numbers[1]);


        Car1[] car1s = {new Car1("blue", 1), new Car1("purple", 2), new Car1("yellow", 3)};
        System.out.println("12- Color of cars[0] in main() method before changeColorOfCarAtIndex call is: " + car1s[0].getColor());
        changeColorOfCarAtIndex(0, car1s);
        System.out.println("14- Color of cars[0] in main() method after changeColorOfCarAtIndex call is: " + car1s[0].getColor());
        changeColorOfSpecificCarInArray(car1s[1]);
        System.out.println("15- Color of cars[1] in main() method after changeColorOfSpecificCarInArray() call is: " + car1s[1].getColor());

    }

    public static void modifyReferenceOfCar(Car1 c) {
        c = new Car1();
        c.setColor("purple");
        System.out.println("2- Color of car inside modifyReferenceOfCar() method is: " + c.getColor());
    }

    public static void changeColorOfCar(Car1 c) {
        c.setColor("orange");
        System.out.println("4- Color of car inside changeColorOfCar() method is: " + c.getColor());
    }

    public static void incrementValue(int num) {
        num = num + 1;
        System.out.println("6- Value of num in incrementValue() method is: " + num);
    }

    public static void incrementArrayElementAtIndex(int index, int [] arr) {
        arr[index] = arr[index] + 1;
        System.out.println("9- Value of arr[" + index + "] in incrementArrayElementAtIndex() method is: " + arr[index]);
    }

    public static void incrementSpecificElementInArray(int number) {
        number = 999;
    }

    private static void changeColorOfCarAtIndex(int index, Car1[] carsArr) {
        carsArr[index].setColor("red");
        System.out.println("13- Color of carsArr[" + index + "] in changeColorOfCarAtIndex() method is: " + carsArr[index].getColor());
    }

    private static void changeColorOfSpecificCarInArray(Car1 c) {
        c.setColor("purple");
    }
}
