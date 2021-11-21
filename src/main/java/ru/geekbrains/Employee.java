package ru.geekbrains;

public class Employee {

    private String fio;
    private String position;
    private String email;
    private String phone;
    private Double salary;
    private int age;

    public Employee(String fio, String position, String email, String phone, Double salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public static void readEmployee(Employee employee) {
        System.out.println("Данные о сотруднике");
        System.out.println("- ФИО: "+ employee.fio);
        System.out.println("- Возраст: "+ employee.age);
        System.out.println("- Должность: "+ employee.position);
        System.out.println("- Электронный адрес: "+ employee.email);
        System.out.println("- Телефон: "+ employee.phone);
        System.out.println("- Зарплата: "+ employee.salary+"₽");
    }

    public String getFio() {
        return fio;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}
