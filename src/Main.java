import java.util.EnumSet;

enum newEnum
{
    Deep,Ayush,Abhishek;
}

class  Main {
    public static void main(String[] args) {
        System.out.println(newEnum.Abhishek.ordinal());

        EnumSet<newEnum> enumSet = EnumSet.allOf(newEnum.class);
        System.out.println(enumSet);

    }
}