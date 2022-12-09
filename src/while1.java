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



    }
}
