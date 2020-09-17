package Lesson3.Animal;

public class Veterinarian {

    public void treatAnimal (Animal animal) {
        System.out.println(animal.food);
        System.out.println(animal.location);

    }

    public static void main(String[] args) {

        Veterinarian veterinarian = new Veterinarian();
        Animal dog = new Dog("Кость", "Будка", "Виляет хвостом");
        Animal cat = new Cat("Сметана", "Дом", "Острые когти");
        Animal horse = new Horse("Овес", "Конюшня", "Копыта");


        Animal[] animals = {dog, cat, horse};

        for (int i = 0; i < animals.length; i++) {
            veterinarian.treatAnimal(animals[i]);
        }

     }
}
