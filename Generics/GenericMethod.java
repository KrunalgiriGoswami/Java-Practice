package Generics;

public class GenericMethod {

    <T> void genericPrint(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        GenericMethod obj = new GenericMethod();

        obj.genericPrint("Hello Krunal");
        obj.genericPrint(18);
        obj.genericPrint(18.8);

    }
}
