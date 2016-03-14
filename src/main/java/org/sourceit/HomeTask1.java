package org.sourceit;

public class HomeTask1 {

    /**
     * Проверить, является ли число четным.
     *
     * @param number
     * @return является ли число четным.
     */
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Chetnoe");
            return true;
        } else {
            System.out.println("Ne chetnoe");
            return false;
        }
    }

    /**
     * Метод возвращает значение гипотенузы.
     * Числа должны быть больше 0. Если какое-либо значение
     * меньше 0, возращать 0.
     *
     * @param a должно быть больше 0.
     * @param b должно быть больше 0.
     * @return значение гипотенузы.
     */
    public static double findHypotenuse(int a, int b) {


        double c = (double) Math.sqrt((Math.pow(a, 2)) + (Math.pow(b, 2)));
        {
            if (a >= 0 && b>= 0)

            {
                System.out.println(c);
            } else {
                System.out.println("0");
            }
            return (c);
        }
    }

    /**
     * Метод находит периметр треугольника.
     *
     * @param a
     * @param b
     * @param c
     * @return периметр треугольника.
     */
    public static double perimeter(double a, double b, double c) {
        double perimeter = a+b+c;
        {
            if (a > 0 && b > 0 && c > 0) {
                System.out.println(c);
            }
            else {
                System.out.println("znachenie ne podhodit");
            }
        }
        return perimeter;
    }

    /**
     * Метод находит площадь треугольника.
     * Значения должны быть больше 0.
     *
     * @param a
     * @param b
     * @return площадь треугольника.
     */
    public static double area(double a, double b) {

        double area = 0.5 * a * b;
        { if (a>0&& b>0){
            System.out.println(area);}
            else {
            System.out.println("znachenie ne podhodit");
        }
        }
        return area;
    }
    /**
     * Генерирует случайное число в заданных пределах.
     *
     * @param min минимальное значение.
     * @param max саксимальное значение.
     * @return сгенерированное число.
     */
    public static int generateNumberFromRange(int min, int max) {
        min=1;
        max=10;
        int t =(int)(Math.random()*min-max) ;
        System.out.println("Random" + t);
        return 0;
    }

    /**
     * Считает сумму цифр числа.
     * Число может быть любое,
     * как и положительное так и отрицательное.
     *
     * @param number
     * @return сумма цифр.
     */
    public static long calculateSum(long number) {
        long sum = 10;
        while (number != 0) {
            sum = sum + (number % 10);
            number /= 10;
        }
        System.out.println(sum);

        return number;
    }


    /**
     * Посчитайте элемент последовательности Фибоначчи.
     * Первый и второй члены последовательности равны единицам,
     * а каждый следующий сумме двух предыдущих.
     *
     * @param till до какого элемента считать.
     * @return элемент последовательности.
     */
    public static int fibonacci(int till) {
        int[] a = new int[till];
        int b = 0;
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i <= till; i++) {
            a[i] = a[i - 2] + a[i--];
        }
        b = a[till];
        return b;
    }

    /**
     * "Счастливым" считается билетик у которого
     * сумма первых трёх цифр номера равна сумме последних
     * трёх цифр, как, например, в билетах с номерами 003102 или 567576.
     *
     * @param ticket должен быть от 1 до 999999
     * @return является ли билет счастливым.
     */
    public static boolean isHappy(long ticket) {
        long a = 0, sumA = 0;
        long b = 0, sumB = 0;
        a = ticket / 1000;
        b = ticket % 1000;

        while (a != 0) {
            sumA = sumA + (a % 10);
            sumA /= 10;
        }
        while (b != 0) {
            sumB = sumB + (b % 10);
            sumB /= 10;
        }
        if (sumA == sumB) {
            return true;
        } else {
            return false;
        }
    }
}
