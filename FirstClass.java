public class FirstClass {
    public static void main(String[] args) {
        System.out.println(checkSum(15,10));
        System.out.println(calculateResult(2,3,15,5));
        // переменные и их значения
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
    /* метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
где a, b, c, d – входные параметры этого метода.*/
    static double calculateResult(double a, double b, double c, double d){
        double r =a*(b+(c/d));
        return r;
    }
    /*метод, принимающий на вход два числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
     если да – вернуть true, в противном случае – false.*/
    static boolean checkSum(int a, int b){
        int s = a+b;
        if (s>=10 && s<=20) return true;
        else return false;

    }
}
