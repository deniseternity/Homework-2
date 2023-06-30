public class Main {
    public static void main(String[] args) {
        var dog =  8.0;
        dog = dog + 4.0;
        dog = dog - 3,5;
        var cat = 3.6;
        cat = cat + 4.0;
        cat = cat - 1.6;
        var paper = 763789;
        paper = paper + 4;
        paper = paper - 7639

        var friend = 19;
        friend = friend + 2;
        friend = friend % 7;
        var frog = 3.5;
        frog = frog * 10;
        frog = frog % 3.5;

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        var difference = boxer2 - boxer1;
        difference = boxer2 % boxer1;
        System.out.println("Разница между весом боксеров равна" + difference + "кг");
        System.out.println("Общий вес равен" + totalWeight + "кг");

        var totalHours = 640;
        var work1Human = 8;
        var totalHumans = totalHours / work1Human;
        System.out.println("Всего работников в компании -" + totalHumans + "человек");

        var totalWorkHumans = totalHumans + 94;
        var workHours = totalHours % totalWorkHumans;
        System.out.println("Если в компании работает" + totalWorkHumans + "человек,то всего" + workHours + "часов работы может быть поделено между сотрудниками");
        }
    }
}