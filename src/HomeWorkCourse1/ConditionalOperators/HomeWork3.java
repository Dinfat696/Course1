package HomeWorkCourse1.ConditionalOperators;

public class HomeWork3 {
    //ConditionalOperators 1

    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то он совершеннолетний");
        } else {
            System.out.println("Eсли возраст человека равен " + age + " ,он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int c = 10;
        if (c >= 5) {
            System.out.println("На улице " + c + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + c + " нужно надеть шапку");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 75;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " , можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 10;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в детсикий сад");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в школу");
        }
        if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в университет");
        } else {
            if (age > 24) {
                System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить на работу");
            }
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 15;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }
        if (age >= 5 && age <= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении");
        } else {
            if (age > 14) {
                System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int seat = 103;
        if (seat < 60) {
            System.out.println("Есть место в вагоне сидячее");
        }
        if ((seat >= 60) && (seat < 102)) {
            System.out.println("Есть место в вагоне стоячее");
        } else if (seat >= 102) {
            System.out.println("Вагон уже полностью забит");
        }
    }


    public static void task7() {
        System.out.println("Задача 7");
        int one = 5;
        int two = 2;
        int three = 3;
        if (one >= two && one >= three) {
            System.out.println("Большее число one");
        } else if (two >= one && two >= three) {
            System.out.println("Большее число two");
        } else {
            System.out.println("Большее число three");
        }
    }
}

