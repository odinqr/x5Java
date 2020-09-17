package Lesson3.Phone;

public class Phone {

    public int number;
    public String model;
    public int weight;
    public String callerName;

    public void receiveCall() {
        System.out.println("Вам звонит " + number);
    }

    public void receiveCall(String callerName, int number) {
        System.out.println("Вам звонит " + callerName + ", его номер - " + number);
    }

    public void getNumber() {
        System.out.println("Номер " + number);
    }

    public void sendMessage(int number1, int number2) {
        System.out.println("Сообщение будет отправлено на номера: " + number1 + ", " + number2);
    }

    public Phone (int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone (int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone () {

    }

}