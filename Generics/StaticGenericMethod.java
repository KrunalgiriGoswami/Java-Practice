package Generics;

public class StaticGenericMethod {

     static  <T> void genericPrint(T t){
        System.out.println(t.getClass().getName() + " : " + t);
    }

    public static void main(String[] args) {

        genericPrint("Hello Krunal");
        genericPrint(18);
        genericPrint(18.8);

    }
}
