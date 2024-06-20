public class Main {
    public static void main(String[] args) {

        // Task 1-2
        byte clientOS;
        int clientDeviceYear = 2016;
        clientOS = 0; // iOS
        // clientOS = 1; // Android
        if (clientDeviceYear > 2015) {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");}
            else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");}
            else {
                System.out.println("Неизвестное устройство");}}
        else
        if (clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
        else if (clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");}
        else {
            System.out.println("Неизвестное устройство");}

        // Task 3
        int year = 1884;
        int begin = year - 1584;
        float hundredOne = (float) begin % 100;
        float hundredFour = (float) begin % 400;
        float four = (float) begin % 4;

        if (year < begin)
        {System.out.println("Год указан меньше ввода високосного года");}
        else
        {if (hundredFour == 0)
        {System.out.println(year + " является високосным");}
        else if ((hundredOne == 0) || (four != 0))
        {System.out.println(year + " не является високосным");}
        else
            System.out.println(year + " является високосным");}

        // Task 4
        int days = 1;
        int deliveryDistance = 95;
        if (deliveryDistance >= 60) {days = days++;}
        if (deliveryDistance <= 100) {days = days++;}
        if (deliveryDistance > 100) {days = 0;}

        if (days == 0) {System.out.println("Свыше 100км доставка не производится");}
        else {System.out.println("На доставку потребуется " + days + " дней");}

        // Task 5
        byte monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }

}