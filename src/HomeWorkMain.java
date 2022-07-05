
public class HomeWorkMain {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrand("Skoda");
        car1.setModel("Octavia");
        car1.setPower(170);
        car1.setTransmission("Manual");
        car1.setConstructionYear(2012);
        car1.setNumberOfSeats(5);

        Car car2 = new Car();
        car2.setBrand("VW");
        car2.setModel("Passat");
        car2.setPower(136);
        car2.setTransmission("Manual");
        car2.setConstructionYear(2004);
        car2.setNumberOfSeats(5);

        Car car3 = new Car();
        car3.setBrand("BMW");
        car3.setModel("540i");
        car3.setPower(340);
        car3.setTransmission("Automatic");
        car3.setConstructionYear(2018);
        car3.setNumberOfSeats(5);

        Car car4 = new Car();
        car4.setBrand("Chrysler");
        car4.setModel("Town&Country");
        car4.setPower(218);
        car4.setTransmission("Automatic");
        car4.setConstructionYear(2003);
        car4.setNumberOfSeats(7);

        Car car5 = new Car();
        car5.setBrand("Zil");
        car5.setModel("130");
        car5.setPower(148);
        car5.setTransmission("Manual");
        car5.setConstructionYear(1964);
        car5.setNumberOfSeats(3);

        Car car6 = new Car(car3);

        Car car7 = new Car(car1);

        Car[] array = new Car[]{car1, car2, car3, car4, car5, car6, car7};

        displayLoop(array);

        Car.Replace(car1,car5);

        displayLoop(array);
    }

    public static void displayLoop(Car[] array) {
        for (int i = 0; i < array.length - 2; i++) {
            display(array[i]);
        }
    }

    public static void display(Car car) {
        System.out.println("Brand - " + car.getBrand());
        System.out.println("Model - " + car.getModel());
        System.out.println("Year of construction - " + car.getConstructionYear());
        System.out.println("Engine power in HP - " + car.getPower());
        System.out.println("Type of transmission - " + car.getTransmission());
        System.out.println("Number of seats - " + car.getNumberOfSeats());
        System.out.println();
    }
}
