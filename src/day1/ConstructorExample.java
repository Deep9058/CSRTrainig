package day1;

public class ConstructorExample {
    String firstName;
    String lastName;
    byte age;
    char gender;

    public ConstructorExample(String firstName, String lastName, byte age, char gender) {
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

    public static void main() {
        ConstructorExample constructorExample1 = new ConstructorExample("Deep", "Gangwar", (byte) 23, 'M');
        ConstructorExample constructorExample2 = new ConstructorExample("Ayush", "Gangwar", (byte) 22, 'M');
        ConstructorExample constructorExample3 = new ConstructorExample("Priyanshi", "Agarwal", (byte) 21, 'F');

        System.out.println(constructorExample1.getFirstName() + " " + constructorExample1.getLastName() + " " + constructorExample1.getAge() + " " + constructorExample1.getGender());
        System.out.println(constructorExample2.getFirstName() + " " + constructorExample2.getLastName() + " " + constructorExample2.getAge() + " " + constructorExample2.getGender());
        System.out.println(constructorExample3.getFirstName() + " " + constructorExample3.getLastName() + " " + constructorExample3.getAge() + " " + constructorExample3.getGender());

    }
}
