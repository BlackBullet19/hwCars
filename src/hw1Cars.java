//First level: Создать класс Car, наполнить его несколькими характеристиками(3-5).
// На основе данного класса создать 5 объектов, каждый должен иметь разные значения характеристик.
// Поместить все объекты в один массив.
//
//Second level: Сделать обход и вывод в консоль всех элементов массива из задания 1
// и для каждого элемента вывести все его характеристики.
public class hw1Cars {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand="Skoda";
        car1.model="Octavia";
        car1.power=170;
        car1.transmission="Manual";
        car1.constructionYear=2012;
        car1.numberOfSeats=5;

        Car car2 = new Car();
        car2.brand="VW";
        car2.model="Passat";
        car2.power=136;
        car2.transmission="Manual";
        car2.constructionYear=2004;
        car2.numberOfSeats=5;

        Car car3 = new Car();
        car3.brand="BMW";
        car3.model="540i";
        car3.power=340;
        car3.transmission="Automatic";
        car3.constructionYear=2018;
        car3.numberOfSeats=5;

        Car car4 = new Car();
        car4.brand="Chrysler";
        car4.model="Town&Country";
        car4.power=218;
        car4.transmission="Automatic";
        car4.constructionYear=2003;
        car4.numberOfSeats=7;

        Car car5 = new Car();
        car5.brand="Zil";
        car5.model="130";
        car5.power=148;
        car5.transmission="Manual";
        car5.constructionYear=1964;
        car5.numberOfSeats=3;


        Car[] array= new Car[5];
        array[0]=car1;
        array[1]=car2;
        array[2]=car3;
        array[3]=car4;
        array[4]=car5;

        for (Car car : array) {
            car.display();
        }


    }
}
