package Classes.Task4;

public class Employee {

    private String fullName;
    private String status;
    private String email;
    private long phone;
    private double salary;
    private int age;

    public int getAge() {
        return age;
    }

    public Employee(String fullName, String status, String email, long phone, double salary, int age) {
        this.fullName = fullName;
        this.status = status;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void toPrint() {
        System.out.println(fullName + " / " + status + " / " + email + " / " + phone + " / " + salary + " / " + age);
    }
}
