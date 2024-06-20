public class Main {
    public static void main(String[] args) {
        // Set Variables
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Plus
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Minus
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //friend
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        //Frog
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        //boxers
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var totalWeight = boxerWeight1 + boxerWeight2;
        var differenceWeight = boxerWeight2 - boxerWeight1;
        System.out.println("Total Weight: " + totalWeight);
        System.out.println("Difference Weight: " + differenceWeight);
        var remainder = boxerWeight2 % boxerWeight1;
        System.out.println("Remainder: " + remainder);
        var hours = 640;
        var staff = 640 / 8;
        System.out.println("Всего работников в компании " + staff + " человек");
        staff = staff + 94;
        System.out.println("Если в компании работает " + staff +  " человек, то всего " + hours / staff + " часов работы может быть поделено между сотрудниками");
    }
}