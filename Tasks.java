package lesson_2.homework;

public class Tasks {
    public static void main(String[] args) {task_1();
    }

    /**
     * Раскомментируй и исправь оба условия так, чтобы они возвращали true
     * Нельзя изменять типы и значения переменных, а так же оператор и метод сравнения.
     */
    public static void task_1() {
        int a = 1;
        String b = "1";
        if (a == Integer.parseInt(b)) {
            // с помощью метода Integer.parseInt переводим значение b в числовое int
            System.out.println("success");
        }
        if (b.equals(String.valueOf(a))) {
            System.out.println("success");
            // с помощью метода ing.valueOf переводим значение a в строку String
        }
    }


    /**
     * Доработай блоки switch так, чтобы в консоль было выведено значение: 12210355
     */
    public static void task_2() {
        String[] strs = new String[]{"one", "two", "three", "four"};
        for (String str : strs) {
            switch (str) {
                case "one":
                    System.out.print(1);
                case "two":
                    System.out.print(2);
                    break;
                case "three":
                    System.out.print(3);
                default:
                    System.out.print(5);
            }

            switch (str.indexOf("o")) {
                case 2:
                    System.out.print(10);
            }
        }
    }

    /**
     * Раскомментируй код, и укажи числа для сравнения с переменной i,
     * а так же расставь логические операторы &, &&, | и || таким образом,
     * чтобы в консоли было выведено значение: 102428338.
     * Запрещается что-либо изменять или менять местами.
     */
        public static void task_3() {
            if (compare(0, 1) & decreaseAndCompare(0, 1) & incrementAndCompare(0, 1)) {
                System.out.print("4");
            } else if (decreaseAndCompare(1, 0) && incrementAndCompare(1, 0) || compare(1, 0)) {
                System.out.print("8");
            }
            if (compare(1, 0) | decreaseAndCompare(1, 1) | incrementAndCompare(1, 2)) {
                System.out.print("4");
            } else if (decreaseAndCompare(1, 1) | incrementAndCompare(1, 1) || compare(2, 1)) {
                System.out.print("8");
            }
            if (compare(2, 1) | decreaseAndCompare(2, 0) && incrementAndCompare(2, 1)) {
                System.out.print("4");
            } else if (decreaseAndCompare(1, 2) | incrementAndCompare(1, 2) || compare(2, 2)) {
                System.out.print("8");
            }
            if (compare(3, 3) & decreaseAndCompare(3, 1) & incrementAndCompare(3, 1)) {
                System.out.print("4");
            } else if (decreaseAndCompare(4, 3) || incrementAndCompare(1, 3) | compare(1, 3)) {
                System.out.print("8");
            }
        }
        private static boolean compare(int a, int b) {
            boolean result = a == b;
            if (result) System.out.print(a);
            return result;
        }

        private static boolean decreaseAndCompare(int a, int b) {
            boolean result = --a == b;
            if (result) System.out.print(b);
            return result;
        }

        private static boolean incrementAndCompare(int a, int b) {
            boolean result = ++a == b;
            if (result) System.out.print(a);
            return result;
        }

}



