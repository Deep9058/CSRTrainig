package day1;

public class Employee {
    String firstName;
    String lastName;
    byte age;
    char gender;

    public Employee(String firstName, String lastName, byte age, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    static void main() {
        Employee employee1= new Employee("Deep", "Gangwar", (byte) 23, 'M');
        Employee employee2= new Employee("Ayush", "Gangwar", (byte) 22, 'M');
        Employee employee3= new Employee("Priyanshi", "Agarwal", (byte) 21, 'F');

        System.out.println(employee1.getFirstName() + " " + employee1.getLastName());
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName());
        System.out.println(employee3.getFirstName() + " " + employee3.getLastName());

    }
}
