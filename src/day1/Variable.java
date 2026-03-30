package day1;

public class Variable {

    int a,b;

    public Variable() {
        System.out.println("Default Constructor");
    }

    public Variable(int a, int b) {
        this.a = 10;
        this.b = 12;
        System.out.println(this.a+this.b);

    }

    public static void main() {
        Variable vari= new Variable(3,4);
    }

}
