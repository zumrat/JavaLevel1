package OOP.Lesson5;
public class Employee {
    private static final int CURRENT_YEAR = 2018;
    private String surname;
    private String name;
    private String secondName;
    private String position;
    private String mail;
    private String phone;
    private int salary;
    private int employeeYear;
    //2.  Конструктор класса должен заполнять эти поля при создании объекта;
    Employee (String surname,
              String name,
              String secondName,
              String position,
              String mail,
              String phone,
              int salary,
              int employeeYear){
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.position = position;
        this.mail= mail;
        this.phone = phone;
        this.salary = salary;
        this.employeeYear = employeeYear;
    }
    //3.Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
    String getSurname() {
        return surname;
    }
    String getName() {
        return name;
    }
    String getSecondName() {
        return secondName;
    }
    String getPosition() {
        return position;
    }
    String getMail() {
        return mail;
    }
    String getPhone() {
        return phone;
    }
    int getSalary() {
        return (int)salary;
    }

    int calculateAge() {
        return CURRENT_YEAR - employeeYear;
    }

    String getAll() {
        return  this.surname + " " +
                this.name + ", " +
                this.secondName + " " +
                this.position + ". Mail: " +
                this.mail + ". Phone number: " +
                this.phone + ". Salary is " +
                this.getSalary() + " " +
                this.calculateAge() + " years old, ";
    }

}

