package Lesson3.Animal;

public class Horse extends Animal {

    private String hoofs; // Наличие копыт

    public Horse (String food, String location, String hoofs) {
        super(food, location);
        this.hoofs = hoofs;
    }

    @Override
    public void makeNoise() {
        System.out.println("Иго-го!");
    }

    @Override
    public void eat() {
        System.out.println("Жует овес");
    }
}
