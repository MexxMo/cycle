public class While1 {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int accumulation = 15000;
        int deposit = 0;
        int month = 0;
        int dream=2459000;
        while (deposit < dream) {
            deposit = deposit + deposit / 100;
            deposit = deposit + accumulation;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
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
        int birthRate = (fertility - death) * cityPeople / 1000;
        while (age < 10) {
            age++;
            cityPeople = cityPeople + birthRate;
            System.out.println("Год " + age + ", численность населения составляет " + cityPeople);
        }

        System.out.println("Задача 4");

        float summa = 15000;
        float percent = 0.07f;
        month = 0;
        int mechta = 12000000;
        while (summa < mechta) {
            month++;
            summa = summa + (summa * percent);
            System.out.println("Месяц " + month + " сумма вклада " + summa);
        }

        System.out.println("Задача 5");


        summa = 15000;

        month = 0;
        while (summa < mechta) {
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

        int friday = 7;
        int dayWeek = friday;
        for (; dayWeek <= 31; dayWeek = dayWeek + 7) {
            System.out.println("Сегодня пятница, " + dayWeek + "-е число. Необходимо подготовить отчет");
        }

        System.out.println("Задача 8");
        int year = 2022;
        age = 0;
        int ageFuture = year + 100;
        int agePast = year - 200;
        for (; age < 2122; age = age + 79) {
            if (age > agePast && age < ageFuture) {
                System.out.println(age);
            }
        }


    }
}