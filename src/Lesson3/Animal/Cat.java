package Lesson3.Animal;

public class Cat extends Animal {

   private String sharpClaws; // Наличие острых когтей

    public Cat (String food, String location, String sharpClaws) {
        super(food, location);
        this.sharpClaws = sharpClaws;
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяу!");
    }

    @Override
    public void eat() {
        System.out.println("Ест сметану");
    }
}
