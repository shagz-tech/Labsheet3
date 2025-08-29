import java.util.Scanner;
class Car {
    private String brand;
    private String model;

    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
    }
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}
public class Q_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String brand = sc.nextLine();
        String model = sc.nextLine();
        Car car1 = new Car();
        car1.display();

        Car car2 = new Car(brand, model);
        car2.display();
    }
}