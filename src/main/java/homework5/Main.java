package homework5;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Иван", "Иванов", "Иванович", "Разработчик",
        "88005553538", "ivanov@gmail.com", 100000, 21);
        employees[1] = new Employee("Петр", "Петров", "Петрович", "Бухгалтер",
                "88005553535", "petrov@gmail.com", 200000, 44);
        employees[2] = new Employee("Максим", "Максимов", "Максимович", "Аналитик",
                "88005553534", "maximov@gmail.com", 300000, 26);
        employees[3] = new Employee("Иван", "Лебедев", "Иванович", "Тестировщик",
                "88005553536", "lebedev@gmail.com", 150000, 50);
        employees[4] = new Employee("Георгий", "Киреев", "Иванович", "Менеджер",
                "88005553537", "kireev@gmail.com", 20000, 22);

        for (Employee employee: employees) {
            if (employee.getAge() > 40) {
                employee.printInfo();
            }
        }
    }
}
