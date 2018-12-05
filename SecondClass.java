public class SecondClass {
    public static void main(String[] args) {
        // переменные и их значение
        System.out.println(calculateResult(2, 3, 15, 5));
        System.out.println(checkSum(10, 15));
        System.out.println(checkYear(2000));
        System.out.println(checkPositive(6));
        System.out.println(checkNegative(-3));
        System.out.println(sayHello("Zumrat"));
        boolean b = true;
        byte bt = 0;
        char c = 't';
        short s = 123;
        int i = 666;
        long l = 567567L;
        float f = 777.0f;
        double d = 777.777;
        System.out.println("Значение для типа boolean = " + b);
        System.out.println("Значение для типа byte = " + bt);
        System.out.println("Значение для типа char = [" + c + "]");
        System.out.println("Значение для типа short = " + s);
        System.out.println("Значение для типа int = " + i);
        System.out.println("Значение для типа long = " + l);
        System.out.println("Значение для типа float = " + f);
        System.out.println("Значение для типа double = " + d);
    }

          /*Написать метод, который определяет является ли год високосным, и выводит сообщение
    в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й
    – високосный.*/
            static String checkYear(int a) {
                if (!(a % 4 == 0) || ((a % 100 == 0) && (a % 400 == 0))) return "intercalary year";
                else return "non intercalary year";
            }
                /*Написать метод, которому в качестве параметра передается целое число, метод должен
напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль
считаем положительным числом.*/
                static String checkPositive(int y){
                    if (y >= 0) return "number " + y + " positive";
                    else return "number " + y + " negative";
                }


    /* метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
где a, b, c, d – входные параметры этого метода.*/
    static double calculateResult(double a, double b, double c, double d) {
        double r = a * (b + (c / d));
        return r;
    }

    /*метод, принимающий на вход два числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
     если да – вернуть true, в противном случае – false.*/
    static boolean checkSum(int a, int b) {
        int s = a + b;
        if (s >= 10 && s <= 20) return true;
        else return false;
    }
    /*Написать метод, которому в качестве параметра передается целое число, метод должен
    вернуть true, если число отрицательное;*/
    static boolean checkNegative(int a) {
        if (a < 0) return true;
        return false;
    }

    /*Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    метод должен вывести в консоль сообщение «Привет, указанное_имя!»*/
    static String sayHello(String name) {
        return "Привет, " + name + "!";
    }

}