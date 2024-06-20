public class Main {
    public static void main(String[] args) {
        // Task 1
        int iInt = -65536;
        byte bByte = 127;
        short sShort = -32768;
        long lLong = 12345678L;
        float fFloat = 26934985f;
        double dDouble = 89256.782097645d;

        // Task 2
        float f = 27.12f;
        long l = 987678965549L;
        float f2 = 2.786f;
        int i = 569;
        int i2 = -159;
        int i3 = 27897;
        byte b = 67;

        // Task 3
        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        int papers = 480;
        System.out.println("На каждого ученика рассчитано " + papers / (lp + as + ea) + " листов бумаги");

        // Task 4
        byte perMinute = 16 / 2;
        int in20minutes = 20 * perMinute;
        int perDay = (24 * 60) * perMinute;
        int per3Days = perDay * 3;
        int perMonth = perDay * 30;
        System.out.println("За 20 минут машина произвела " + in20minutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + perDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + per3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + perMonth + " штук бутылок");

        //Task 5
        byte total = 120;
        byte white = 2;
        byte brown = 4;
        int bottles = white + brown;
        int classRooms = total / bottles;
        System.out.println("В школе, где " + classRooms + " классов, нужно " + classRooms * white + " банок белой краски и " + classRooms * brown + " банок коричневой краски");

        // Task 6
        byte bananas = 80;
        byte milk = 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int grams = bananas + milk + iceCream + eggs;
        System.out.println("Всего спортсмен съедает на завтрак " + grams + " грамм или " + grams * 0.001 + " килограмм завтрака");

        // Task 7
        int totals = 7;
        int grams1 = 250;
        int grams2 = 500;
        int average = (grams1 + grams2) / 2;
        System.out.println("Для сброса " + totals + " килограмм веса при потере " + grams1 + " грамм в день уйдет " + totals * 1000 / grams1 + " дней");
        System.out.println("Для сброса " + totals + " килограмм веса при потере " + grams2 + " грамм в день уйдет " + totals * 1000 / grams2 + " дней");
        System.out.println("Для сброса " + totals + " килограмм веса при потере " + average + " грамм в день уйдет " + totals * 1000 / average + " дней");

        // Task 8
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int newMasha = masha + (masha / 10);
        int newDenis = denis + (denis / 10);
        int newKristina = kristina + (kristina / 10);
        System.out.println("Маша теперь получает " + newMasha + " рублей. Годовой доход вырос на " + (newMasha - masha) * 12 + " рублей");
        System.out.println("Денис теперь получает " + newDenis + " рублей. Годовой доход вырос на " + (newDenis - denis) * 12 + " рублей");
        System.out.println("Кристина теперь получает " + newKristina + " рублей. Годовой доход вырос на " + (newKristina - kristina) * 12 + " рублей");

    }
}