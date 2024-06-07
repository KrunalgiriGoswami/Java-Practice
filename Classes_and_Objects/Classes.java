package Classes_and_Objects;

public class Classes {
    public static void main(String args[])
    {
        // creating an object of
        // Student
        Student s1 = new Student();
        System.out.println(s1.id);
        System.out.println(s1.name);

        s1.studentDetail(01,"KRUNAL");
        System.out.println("Student id: "+ s1.id + "\nStudent Name: "+ s1.name);

    }
}
    class Student {

        int id;

        String name;

        public void studentDetail(int id,String name){
            this.id = id;
            this.name = name;
        }
    }

