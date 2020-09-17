package Lesson3.Phone;

public class MainClass {
    public static void main(String[] args) {

        Phone phone1 = new Phone();
        phone1.number = 1111111;
        phone1.model = "phone1";
        phone1.weight = 100;
        phone1.callerName = "Иван";

        Phone phone2 = new Phone();
        phone2.number = 2222222;
        phone2.model = "phone2";
        phone2.weight = 200;
        phone2.callerName = "Александр";

        Phone phone3 = new Phone();
        phone3.number = 3333333;
        phone3.model = "phone3";
        phone3.weight = 300;
        phone3.callerName = "Владимир";

        System.out.println(phone1.model +" "+ phone1.number + " " + phone1.weight);
        System.out.println(phone2.model +" "+ phone2.number + " " + phone2.weight);
        System.out.println(phone3.model +" "+ phone3.number + " " + phone3.weight);

        System.out.println();
        phone1.receiveCall();
        phone1.getNumber();

        System.out.println();
        phone2.receiveCall();
        phone2.getNumber();

        System.out.println();
        phone3.receiveCall();
        phone3.getNumber();

        phone1.receiveCall(phone2.callerName, phone2.number);

        phone2.sendMessage(phone1.number, phone3.number);
    }

}
