package OOP.Lesson5;

public class Test {
    public static void main(String[] args) {
        //1.  Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
        Employee Em = new Employee("Mishnev", "Boris", "Alekseevich", "teacher",
                "mishnevboris@gmail.com", "+37128270496", 1000, 1985);
        // 5.	Создать массив из 5 сотрудников;
        //  С помощью цикла вывести информацию только о сотрудниках старше 40 лет;

        Employee[] employees = {
                Em,
                new Employee("Kirshtein", "Yhan", "Stiv", "headmaster",
                        "Yhan.Kir@gmail.com", "+37124260795", 20000, 1974),
                new Employee("Sergeev", "Sergey", "Sergeevich", "team_leader",
                        "Sergey.S@gmail.com", "+37122260793", 2000, 1984),
                new Employee("Pesenkova", "Alina", "Andreevna", "accountant",
                        "Alina.Riga@gmail.com", "+37124270795", 2000, 1983),
                new Employee("Kurchov", "Mikhail", "Stepanovich", "junior",
                        "Mikheal.Van@gmail.com", "+37123457956", 500, 1994),};
        for (int i = 0; i < employees.length; i++)
            if (employees[i].calculateAge() > 40)
                System.out.println(employees[i].getAll());

        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < employees.length; i++)
            System.out.println(employees[i].getAll());
    }
}