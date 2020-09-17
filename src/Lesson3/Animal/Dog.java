package Lesson3.Animal;

public class Dog extends Animal {

   private String tailWagging; //Виляние хвостом

    public Dog(String food, String location, String tailWagging) {
        super(food, location);
        this.tailWagging = tailWagging;
    }

    @Override
    public void makeNoise() {
        System.out.println("Гав!");
    }

    @Override
    public void eat() {
        System.out.println("Грызет кость");
    }


}
