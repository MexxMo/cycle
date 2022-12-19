public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        for (int i = 1; i <= 10; i = i + 1) {

            System.out.println(i);
        }
        System.out.println("Задача 2");

        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println(i);
        }

        System.out.println("Задача 3");

        for (int x = 0; x <= 17; x = x + 2) {
            System.out.println(x);
        }

        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }

        System.out.println("Задача 5");

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        System.out.println("Задача 6");

        for (int i = 7; i < 100; i = i + 7) {
            System.out.print(i+" ");

        }
        System.out.println();
        System.out.println("Задача 7");

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.println("Задача 8");

        int accumulation = 29000;
        int banka = 0;
        for (int i = 1; i <= 12; i++) {
            banka = banka + accumulation;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + banka + " рублей");
        }

        System.out.println("Задача 9");

        int deposit = 0;
        for (int i = 1; i <= 12; i++) {
            deposit = deposit + deposit/100;
            deposit = deposit + accumulation;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + deposit + " рублей");
        }

        System.out.println("Задача 10");

        for (int i=1; i <= 10; i++){
            System.out.println("2*"+ i +"="+2*i);
        }
    }

}