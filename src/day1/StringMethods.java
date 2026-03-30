package day1;

public class StringMethods {

    public static void main(String[] args) {

       /* StringBuffer str = new StringBuffer("Deed");
        String copy = str.toString().toLowerCase();
        String rev =str.reverse().toString().toLowerCase();
        boolean b1= copy.equals(rev);

        if (b1== true) {s
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }*/

        String gift = "Surprise! It's a puppy!";
        String str= gift.substring(0,11);
        System.out.println(str);
        String[] StringArray= gift.split("!");

        System.out.println(StringArray[0]);
        System.out.println(StringArray[1]);

    }
}