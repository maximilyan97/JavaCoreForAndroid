package homework5;

public class Employee {

    private String name;
    private String surname;
    private String patronymic;
    private String jobTitle;
    private String phoneNumber;
    private String email;
    private int salary;
    private int age;

    public Employee(String name,  String surname, String patronymic,
                    String jobTitle, String phoneNumber, String email, int salary, int age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.jobTitle = jobTitle;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.printf("%s %s %s, возраст %d, занимает должность %s, зарабатывает %d рублей." +
                        " Обращаться можно по номеру %s или писать на почту %s.\n",
                name, surname, patronymic, age, jobTitle, salary, phoneNumber, email);
    }

    public int getAge() {
        return age;
    }
}
