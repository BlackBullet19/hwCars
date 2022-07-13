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

        printArray(array);

        Car.replace(car1,car5);


        printArray(array);

        Truck truck1 = new Truck();
        truck1.setBrand("Zil");
        truck1.setModel("130");
        truck1.setPower(148);
        truck1.setTransmission("Manual");
        truck1.setConstructionYear(1968);
        truck1.setNumberOfSeats(2);
        truck1.setLoadCapacity(55);
        truck1.setDriveUnit(null);
        truck1.setChargeSystem("BiTurbo");
        truck1.setFuelCapacity(150);
        truck1.setEmissionStandard("Euro 0");
        truck1.setEngineType("Бензин");

        Truck truck2 = new Truck();
        truck2.setBrand("Man");
        truck2.setModel("TGX");
        truck2.setPower(867);
        truck2.setTransmission("Automatic");
        truck2.setConstructionYear(2014);
        truck2.setNumberOfSeats(3);
        truck2.setLoadCapacity(80);
        truck2.setDriveUnit("6x6");
        truck2.setChargeSystem("BiTurbo");
        truck2.setFuelCapacity(650);
        truck2.setEmissionStandard("Euro 6d");
        truck2.setEngineType("Diesel");

        Bus bus1 = new Bus();
        bus1.setBrand("Iveco");
        bus1.setModel("Expeditor");
        bus1.setPower(678);
        bus1.setTransmission("Automatic");
        bus1.setConstructionYear(2020);
        bus1.setNumberOfSeats(120);
        bus1.setFloorHeight(25);
        bus1.setNumberOfAxles(3);
        bus1.setNumberOfFloors(2);
        bus1.setBusType("City Bus");
        bus1.setChargeSystem("TwinTurbo");
        bus1.setEmissionStandard("Euro 6d");
        bus1.setEngineType("Diesel");
        bus1.setFuelCapacity(350);

        Cabriolet cabriolet1 = new Cabriolet();
        cabriolet1.setBrand("Tesla");
        cabriolet1.setModel("ModelX");
        cabriolet1.setConstructionYear(2015);
        cabriolet1.setPower(600);
        cabriolet1.setTransmission("Automatic");
        cabriolet1.setBodyType("Targa");
        cabriolet1.setRoofMaterial("Steel");
        cabriolet1.setNumberOfSeats(5);
        cabriolet1.setRoofRemovalType("Mechanical");
        cabriolet1.setBatteryCapacity(180);
        cabriolet1.setFullChargeTime(16);

        Car[] cars = new Car[]{truck1, truck2, bus1, cabriolet1};

        printArray(cars);
    }

    public static void printArray(Car[] cars) {
        for (Car car : cars) {
            car.printInfo();
            System.out.println();
            car.printMessage();
            System.out.println();
            System.out.println(car);
            System.out.println();
        }
    }
}

