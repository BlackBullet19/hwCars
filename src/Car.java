public class Car {
    String brand;
    String model;
    int constructionYear;
    int power;
    String transmission;
    int numberOfSeats;

    public void display(){
        System.out.println("Brand - " +brand);
        System.out.println("Model - " +model);
        System.out.println("Year of construction - "+ constructionYear);
        System.out.println("Engine power in HP - " +power);
        System.out.println("Type of transmission - "+transmission);
        System.out.println("Number of seats - "+ numberOfSeats);
        System.out.println();
    }
}
