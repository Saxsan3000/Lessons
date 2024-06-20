public class Main {
    public static void main(String[] args) {

        // Task 1
        for (int i = 1; i < 11; i++) {System.out.println(i);}

        // Task 2
        for (int i = 10; i > 0; i--) {System.out.println(i);}

        // Task 3
        for (int i = 0; i < 17; i = i + 2) {System.out.println(i);}

        // Task 4
        for (int i = 10; i > -11; i--) {System.out.println(i);}

        // Task 5
        for (int i = 1904; i < 2100; i = i + 4) {System.out.println(i + " год является високосным");}

        // Task 6
        for (int i = 1; i < 15; i++) {System.out.println(i * 7);}

        // Task 7
        for (int i = 0; i < 10; i++) {System.out.println((int) Math.pow(2,i));}

        // Task 8
        int summ = 0;
        int deposit = 29000;
        for (int i =1; i < 13; i++) {
            summ = summ + deposit;
            System.out.println("Месяц " + i + ": сумма накоплений равна " + summ + " рублей");
        }

        // Task 9
        double summ2 = 0d;
        for (int i =1; i < 13; i++) {
            summ2 = summ2 + deposit;
            summ2 = summ2 + (summ2 * 0.01);
            System.out.println("Месяц " + i + ": сумма накоплений равна " + summ2 + " рублей");
        }

        // Task 10
        for (int i = 1; i < 11; i++) {System.out.println("2*" + i + "=" + 2 * i);}
    }

}