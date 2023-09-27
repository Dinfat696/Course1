package HomeWorkCourse1.Variables;

public class HomeWork1 {
    //Переменные урок 1
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
        var dog = 8;
        var cat = 3.6;
        var papper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(papper);
    }


    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8;
        dog = dog + 4;
        var cat = 3.6;
        cat = cat + 4;
        var papper = 763789;
        papper = papper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(papper);


    }


    public static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;// double dog=8 ??
        dog = dog - 3.5;
        var cat = 3.6;
        cat = cat - 1.6;
        var papper = 763789;
        papper = papper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(papper);


    }


    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);


    }


    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }


    public static void task6() {
        System.out.println("Задача 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        System.out.println(firstBoxerWeight + secondBoxerWeight);
        System.out.println(secondBoxerWeight - firstBoxerWeight);


    }


    public static void task7() {
        System.out.println("Задача 7");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        System.out.println(secondBoxerWeight - firstBoxerWeight);
        System.out.println(secondBoxerWeight % firstBoxerWeight);

    }


    public static void task8() {
        System.out.println("Задача 8");
        var workingHouse = 640;
        var employees = workingHouse / 8;
        System.out.println("Всего работников в компании- " + employees + " человек");

        var employeesNew = employees + 94;
        var workinghousNew = employeesNew * 8;
        System.out.println("Если в компании работает " + employeesNew + " человек, то всего " + workinghousNew + " часов работы может быть поделено между сотрудниками");


    }

}




