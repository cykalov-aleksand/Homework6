public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------Задание №1---------------------------");
        System.out.println("Вывести целые числа от 1 до 10");
        for (byte i = 1; i <= 10; i++) {
            System.out.println("Целое число: " + i);
        }
        System.out.println("\n------------------------Задание №2---------------------------");
        System.out.println("Вывести целые числа от 10 до 1");
        for (byte i = 10; i >= 1; i--) {
            System.out.println("Целое число: " + i);
        }
        System.out.println("\n------------------------Задание №3---------------------------");
        System.out.println("Вывести в консоль все четные числа от 0 до 17");
        for (byte i = 0; i <= 17; i =(byte) (i + 2)) {
            System.out.println("Чётное число: " + i);
        }
        System.out.println("\n------------------------Задание №4---------------------------");
        System.out.println("Вывести в консоль все числа от 10 до -10");
        for (byte i = 10; i >= -10; i--) {
            System.out.println("Число: " + i);
        }
        System.out.println("\n------------------------Задание №5---------------------------");
        System.out.println("Вывести в консоль все високосные года от 1904 до 2096");
        for (short i=1904; i <= 2096; i = (short) (i + 4)) {
         System.out.println(i + " год является високосным");
        }
        System.out.println("\n------------------------Задание №6---------------------------");
        System.out.println("Вывести в консоль последовательность чисел от 7 до 98 с шагом 7");
        System.out.print("последовательность чисел: ");
        for (byte i = 7; i <= 98; i =(byte) (i + 7)) {
            System.out.print(" " + i);
        }
        System.out.println("\n\n------------------------Задание №7---------------------------");
        System.out.println("Вывести в консоль последовательность чисел от 2 до 512 с шагом умножение на 2");
        System.out.print("последовательность чисел: ");
        for (short i = 2; i <= 512; i =(short) (i * 2)) {
            System.out.print(" " + i);
        }
        System.out.println("\n\n------------------------Задание №8---------------------------");
        float total = 0f;
        float salary = 29000f;
        System.out.println("Вывести в консоль ежемесячное накопление в течении года, если каждый месяц откладывать по " + salary + " руб.");
        for (byte i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + total+" руб.");
        }
        System.out.println("\n------------------------Задание №9---------------------------");
        total = 0f;
        byte percentageDeposit = 12;
        System.out.println("Вывести в консоль ежемесячное накопление в течении года, если каждый месяц откладывать по " + salary +
                " руб. и ежегодный процент накоплений составляет " + percentageDeposit + " %");
        byte numberMonths=12;
        for (byte i = 1; i <= 12; i++) {
            total = total + (salary + (salary * percentageDeposit / (numberMonths * 100f)));
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + total+" руб.");
        }
        System.out.println("\n------------------------Задание №10---------------------------");
        System.out.println("Таблица умножения на 2");
        for(byte number=1;number<=10;number++){
            System.out.println("2*"+number+"="+(number*2));
        }
    }
}