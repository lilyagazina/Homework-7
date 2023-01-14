public class Main {
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
    public static void task1(){
        System.out.println("Задача 1");
        int monthlyContribution = 15_000;
        int amountSavings = 0;
        int months = 0;
        while ( amountSavings <= 2459000 ) {
            amountSavings  = amountSavings + monthlyContribution;
            months ++;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + amountSavings + " рублей");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
            System.out.println ();

            for ( i=10; i >= 1; i--) {
                System.out.print(i + " ");
            }
                System.out.println ();
    }
    public static void task3() {
        System.out.println("Задача 3");
        int totalStrength = 12_000_000;
        int fertility = totalStrength * 17/1000; //число родившихся человек за год
        int mortality = totalStrength * 8/1000; //число умерших человек за год
        int year = 2022;
        while (year < 2032 ) {
            totalStrength = totalStrength + fertility - mortality;
            year++;
            System.out.println("Год " + year + " , численность населения составляет " + totalStrength);
        }
    }
    public static void task4() {
        System.out.println("Задача 4"); //итог 99 месяца
        int amountSavings = 15_000;
        int months = 0;
        while ( amountSavings < 12_000_000) {
            amountSavings = amountSavings + amountSavings * 7 / 100;
            months ++;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + amountSavings + " рублей");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int amountSavings = 15_000;
        int months = 0;
        while ( amountSavings < 12_000_000) {
            amountSavings = amountSavings + amountSavings * 7 / 100;
            months++;
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ", сумма накоплений равна " + amountSavings + " рублей");
            }
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int amountSavings = 15000;
        int months = 0;
        while ( months <= 108) {  // 9 лет = 108 месяцев
        amountSavings = amountSavings + amountSavings * 7 / 100;
            months++;
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ", сумма накоплений равна " + amountSavings + " рублей");
            }
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int firstFriday = 6;
        for (int friday = firstFriday; friday  <= 31; friday += 7) {
            System.out.println("Сегодня пятница,"+ friday +" -е число. Необходимо подготовить отчет");
        }
    }
    public static void task8() {
        System.out.println("Задача 8");
        int currentYar = 2023;
        int start = currentYar - 200;
        int end = currentYar + 100;
        int period = 79;
        int firstTimeAppeared = 0;
        for ( int year = firstTimeAppeared; year <= end; year += period) {
            if (year >= start) {
                System.out.println(year);
            }
        }
    }

}