package HomeWorkCourse1.Variables;

public class HomeWork2 {
    //Переменные урок 2
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int a = 100000;
        byte b = 2;
        short c = 30000;
        long d = 147000000L;
        float e = 2.3F;
        double g = 369.258;
        System.out.println("Значение переменной " + "а" + " с типом " + "int" + " равно " + a);
        System.out.println("Значение переменной " + "b" + " с типом " + "byte" + " равно " + b);
        System.out.println("Значение переменной " + "c" + " с типом " + "short" + " равно " + c);
        System.out.println("Значение переменной " + "d" + " с типом " + "long" + " равно " + d);
        System.out.println("Значение переменной " + "e" + " с типом " + "float" + " равно " + e);
        System.out.println("Значение переменной " + "g" + " с типом " + "double" + " равно " + g);
    }

    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12F;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte LP = 23;
        byte AC = 27;
        byte EA = 30;
        int allStudents = LP + AC + EA;
        short sheetsOfpaper = 480;
        int papper = sheetsOfpaper / allStudents;
        System.out.println("На каждого ученика рассчитано " + papper + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte bottle = 16;
        byte time = 2;
        int a = bottle / time;
        int b = 20 * a;
        int c = 1440 * a;
        int d = 3 * 1440 * a;
        int f = 31 * 1440 * a;
        System.out.println("За 20 минут машина произвела " + b + " штук бутылок");
        System.out.println("За сутки машина произвела " + c + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + d + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + f + " штук бутылок");

    }

    public static void task5() {
        System.out.println("Задача 5");
        byte jar = 120;
        byte white = 2;
        byte brown = 4;
        int c = white + brown;
        int classesAtschool = jar / c;
        int jarWhite = white * classesAtschool;
        int jarBrown = brown * classesAtschool;
        System.out.println("В школе, где " + classesAtschool + " классов, нужно " + jarWhite + " банок белой краски и " + jarBrown + " банок коричневой краски");

    }

    public static void task6() {
        System.out.println("Задача 6");
        byte banana = 5;
        byte weightBanana = 80;
        short milk = 200;
        short weightMilk100 = 105;
        byte iceCream = 2;
        byte weightIcecream = 100;
        byte egg = 4;
        byte weightEgg = 70;
        int a = banana * weightBanana;
        int b = 2 * weightMilk100;
        int c = iceCream * weightIcecream;
        int d = egg * weightEgg;
        int gram = a + b + c + d;
        float kilogram = gram / 1000f;
        System.out.println(gram);
        System.out.println(kilogram);

    }

    public static void task7() {
        System.out.println("Задача 7");
        byte weightkg = 7;
        float weightgm = weightkg * 1000f;
        short weight1 = 250;
        short weight2 = 500;
        double medium = (250 + 500) / 2D;

        double day1 = weightgm / weight1;
        double day2 = weightgm / weight2;
        double mediumAverage = (day1 + day2) / 2d;
        double mediumDay = weightgm / medium;
        System.out.println(day1 + " дней уйдет на похудение, если спортсмен будет терять по " + weight1 + " грам");
        System.out.println(day2 + " дней уйдет на похудение, если спортсмен будет терять по " + weight2 + " грам");
        System.out.println("Среднее количество дней уйдет на похудение " + mediumDay);
    }

    public static void task8() {
        System.out.println("Задача 8");
        int Masha = 67760;
        int Denis = 83690;
        int Christina = 76230;
        double increaseMasha = Masha + (Masha / 10d);
        double increaseDenis = Denis + (Denis / 10d);
        double increaseChristina = Christina + (Christina / 10d);
        int yearMasha = Masha * 12;
        int yearDenis = Denis * 12;
        int yearChristina = Christina * 12;
        double year2Masha = increaseMasha * 12;
        double year2Denis = increaseDenis * 12;
        double year2Christina = increaseChristina * 12;
        double differenceMasha = year2Masha - yearMasha;
        double differenceDenis = year2Denis - yearDenis;
        double differenceChristina = year2Christina - yearChristina;
        System.out.println("Маша теперь получает " + increaseMasha + " рублей. Годовой доход вырос на " + differenceMasha + " рублей");
        System.out.println("Денис теперь получает " + increaseDenis + " рублей. Годовой доход вырос на " + differenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + increaseChristina + " рублей. Годовой доход вырос на " + differenceChristina + " рублей");


    }
}

