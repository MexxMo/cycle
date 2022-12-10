public class while1 {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int accumulation = 15000;
        int deposit = 0;
        int i = 0;
        while (deposit < 2459000) {
            deposit = deposit + deposit / 100;
            deposit = deposit + accumulation;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + deposit + " рублей");
        }


        System.out.println("Задача 2");

        int q = 0;
        while (q < 10) {
            q++;
            System.out.print(q + " ");
        }
        System.out.println();

        for (q = 10; q >= 1; q--) {
            System.out.print(q + " ");

        }
        System.out.println();

        System.out.println("Задача 3");

        int cityPeople = 12_000_000;
        int age = 0;
        int death = 8;
        int fertility = 17;
        int birthRate = (fertility - death) * 12000;
        while (age < 10) {
            age++;
            cityPeople = cityPeople + birthRate;
            System.out.println("Год " + age + ", численность населения составляет " + cityPeople);
        }

        System.out.println("Задача 4");

        double summa = 15000;
        double percent = 0.07;
        int month = 0;
        while (summa < 12_000_000) {
            month++;
            summa = summa + (summa * percent);
            System.out.println("Месяц " + month + " сумма вклада " + summa);
        }

        System.out.println("Задача 5");


        summa = 15000;

        month = 0;
        while (summa < 12_000_000) {
            month++;
            summa = summa + (summa * percent);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " Итого " + summa);
            }
        }

        System.out.println("Задача 6");
        summa = 15000;
        month = 0;
        age = 9;
        int accumulationPeriod = age * 12;
        while (month < accumulationPeriod) {
            summa = summa + (summa * percent);
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " Итого " + summa);
            }

        }
        System.out.println("Задача 7");

        int friday = 5;
        int dayWeek = 1;
        System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        while ( dayWeek < 31 ) {
            friday = friday + 7;
            dayWeek++;
            if (dayWeek < 31 && friday <= 31) {
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");

            }
        }

        System.out.println("Задача 8");
        int year = 2022;
        age = 0;
        for (; age < 2500; age = age + 79) {
            if (age > year - 200 && age < year + 100) {
                System.out.println(age);
            }
        }


    }
}