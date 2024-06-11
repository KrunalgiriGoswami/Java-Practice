/* import 'MyClass' class from 'names' myPackage */

import Packages.MyClass;

public class PrintName
{
    public static void main(String args[])
    {
        // Initializing the String variable
        // with a value
        String name = "Hello Krunal";

        // Creating an instance of class MyClass in
        // the package.
        MyClass obj = new MyClass();

        obj.getNames(name);
    }
}