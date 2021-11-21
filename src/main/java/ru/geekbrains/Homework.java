package ru.geekbrains;

public class Homework {

    public static void main(String[] args) {
        Employee[] employees = new Employee[6];
        employees[0] = new Employee("Селиванова Лариса Ивановна", "Программист",
                "larisa.si_r9@mail.ru", "89278374281", 65000.00, 32);
        employees[1] = new Employee("Кондратьев Алексей Генадиевич", "Менеджер",
                "pokemon2984771@yandex.ru", "89162984771", 37000.00, 48);
        employees[2] = new Employee("Махмадуев Руслан Барсеев", "Сторож",
                "bars_mars_74@hotmail.com", "89068726452", 12500.00, 67);
        employees[3] = new Employee("Камазяка Тамерлан Филатович", "Аналитик",
                "kamazyaka111_new@vk.com", "89269745638", 32800.00, 33);
        employees[4] = new Employee("Варвамова Карина Игоревна", "Секретарь",
                "sexy_kari666@mail.ru", "89743789421", 180000.00, 25);
        employees[5] = new Employee("Самсонов Султан Варфаламеевич", "Директор",
                "ya_boss@bigtime.org", "89110101007", 400000.00, 109);
        infoEmployeesAbove40(employees);
    }

    private static void infoEmployeesAbove40(Employee[] employees) {
        for(Employee employee: employees) {
            if (employee.getAge() > 40) {
                Employee.readEmployee(employee);
            }
        }
    }
}
