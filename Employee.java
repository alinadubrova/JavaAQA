public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;
    public Employee (String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void info () {
        System.out.println("ФИО: " + fullName + "; Должность: " + position + "; Email: " + email +
         "; Телефон: " + phone + "; Зарплата: " + salary + "; Возраст: " + age);
    }
    public static void main(String [] args) {
        Employee [] persArray = new Employee [5];
        persArray [0] = new Employee ("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "8923123212", 30000, 30);
        persArray [1] = new Employee ("Stepanenko Kate", "Accountant", "kate@mail.ru", "7958463158", 32000, 28);
        persArray [2] = new Employee ("Kravtsova Irina", "Economist", "irinak@mail.ru", "6987531553", 33000, 32);
        persArray [3] = new Employee ("Kuzhelko Kate", "Engineer", "katerina@yandex.by", "5987628497", 29000, 25);
        persArray [4] = new Employee ("Dubrov Sergey", "Programmer", "sergeyd@mail.ru", "8756942315", 35000, 35);
    }
}