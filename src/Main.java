public class Main {
    public static void main(String[] args) {
        var dog =  8.0;
        System.out.println(dog);
        dog = dog += 4.0;
        System.out.println(dog);
        dog = dog -= 3,5;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat += 4.0;
        System.out.println(cat);
        cat = cat -= 1.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper += 4;
        System.out.println(paper);
        paper = paper -= 7639
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend += 2;
        System.out.println(friend);
        friend = friend /= 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog *= 10;
        System.out.println(frog);
        frog = frog /= 3.5;
        System.out.println(frog);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 += boxer2;
        System.out.println("Общий вес равен" + totalWeight + "кг");
        var difference = boxer2 -= boxer1;
        System.out.println("Разница между весом боксеров равна" + difference + "кг");
        difference = boxer2 /= boxer1
        System.out.println("Разница между весом боксеров равна" + difference + "кг");

        var totalHours = 640;
        System.out.println(totalHours);
        var work1Human = 8;
        System.out.println(work1Human);
        var TotalHumans = totalHours /= work1Human;
        System.out.println("Всего работников в компании -" + TotalHumans + "человек");

        var TotalWorkHumans = TotalHumans += 94;
        System.out.println(TotalWorkHumans);
        var WorkHours = totalHours /= TotalWorkHumans;
        System.out.println("Если в компании работает" + TotalWorkHumans + "человек,то всего" + WorkHours + "часов работы может быть поделено между сотрудниками");
        }
    }
}