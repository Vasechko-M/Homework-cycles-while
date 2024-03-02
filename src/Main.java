public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i++ + " , сумма накоплений равна" + total + " рублей");
        }
        //task 2
        System.out.println("Задача 2");
        i = 1;
        while (i <= 10) {
            System.out.print(i++ + " ");
        }
        System.out.println();
        for (i = 10; i > 0; i = i - 1) {
            System.out.print(i + " ");
            System.out.println();
        }
        //task 3
        System.out.println("Задача 3");
        int population = 12_000_000;
        int expectability = population*17/1000;
        int mortality = population*8/1000;
        for (i=1;i<=10;i++) {
            int growth = expectability - mortality;
            population = population + growth;
            System.out.println("Год " + i + " численность населения составляет " + population);
        }

        //task 4
        System.out.println("Задача 4");
        total = 15000;
        for (i = 1; total < 12000000; i++) {
            total = total + (total * 7 / 100);
            System.out.println("Месяц " + i + " Сумма накоплений равна " + total + " рублей");
        }
        //task 5
        System.out.println("Задача 5");
        total = 15000;
        for (i = 1; total <= 12000000; i++) {
            total = total + (total * 7 / 100);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Сумма накоплений равна " + total + " рублей");
            }
            //System.out.println("Месяц " + i + " Сумма накоплений равна " + total + " рублей");
            //как сделать последней строчкой итоговый месяц и сумму
        }
        //task6
        System.out.println("Задача 6");
        total = 15000;
        for (i = 1; i <= 108; i++) {
            total = total + (total * 7 / 100);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Сумма накоплений равна " + total + " рублей");
            }
        }
        //task7
        System.out.println("Задача 7");
        int friday = 1;
        for (int dayNumber = 1; dayNumber <= 31; dayNumber++) {
            friday = friday + 6;
            if (friday % 7 == 0) {
                System.out.println("Сегодня пятница, " + dayNumber + "-е число. Необходимо подготовить отчет");
                //continue;
            }

        }
        //task8
        System.out.println("Задача 8");
        for (int year = 1824; year <= 2124; year++) {
            if (year % 79 == 0) {
                System.out.println(year);

            }
        }

    }
}