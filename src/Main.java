public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------Задание №1---------------------------");
        System.out.println("Вывести целые числа от 1 до 10");
        for (byte number = 1; number <= 10; number++) {
            System.out.println("Целое число: " + number);
        }
        System.out.println("\n------------------------Задание №2---------------------------");
        System.out.println("Вывести целые числа от 10 до 1");
        for (byte number = 10; number >= 1; number--) {
            System.out.println("Целое число: " + number);
        }
        System.out.println("\n------------------------Задание №3---------------------------");
        System.out.println("Вывести в консоль все четные числа от 0 до 17");
        for (byte number = 0; number <= 17; number =(byte) (number + 2)) {
            System.out.println("Чётное число: " + number);
        }
        System.out.println("\n------------------------Задание №4---------------------------");
        System.out.println("Вывести в консоль все числа от 10 до -10");
        for (byte number = 10; number >= -10; number--) {
            System.out.println("Число: " + number);
        }
        System.out.println("\n------------------------Задание №5---------------------------");
        System.out.println("Вывести в консоль все високосные года от 1904 до 2096");
        for (short year=1904; year <= 2096; year = (short) (year + 4)) {
         System.out.println(year + " год является високосным");
        }
        System.out.println("\n------------------------Задание №6---------------------------");
        System.out.println("Вывести в консоль последовательность чисел от 7 до 98 с шагом 7");
        System.out.print("последовательность чисел: ");
        for (byte number = 7; number <= 98; number =(byte) (number + 7)) {
            System.out.print(" " + number);
        }
        System.out.println("\n\n------------------------Задание №7---------------------------");
        System.out.println("Вывести в консоль последовательность чисел от 1 до 512 с шагом умножение на 2");
        System.out.print("последовательность чисел: ");
        for (short number = 1; number <= 512; number =(short) (number * 2)) {
            System.out.print(" " + number);
        }
        System.out.println("\n\n------------------------Задание №8---------------------------");
        float total = 0f;
        float salary = 29000f;
        System.out.println("Вывести в консоль ежемесячное накопление в течении года, если каждый месяц откладывать по " + salary + " руб.");
        for (byte month = 1; month <= 12; month++) {
            total = total + salary;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total+" руб.");
        }
        System.out.println("\n------------------------Задание №9---------------------------");
        total = 0f;
        byte percentageDeposit = 12;
        System.out.println("Вывести в консоль ежемесячное накопление в течении года, если каждый месяц откладывать по " + salary +
                " руб. и ежегодный процент накоплений составляет " + percentageDeposit + " %");
        byte numberMonths=12;
        for (byte month = 1; month <= 12; month++) {
            total = total + (salary + (salary * percentageDeposit / (numberMonths * 100f)));
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total+" руб.");
        }
        System.out.println("\n------------------------Задание №10---------------------------");
        System.out.println("Таблица умножения на 2");
        for(byte number=1;number<=10;number++){
            System.out.println("2*"+number+"="+(number*2));
        }
    }
}