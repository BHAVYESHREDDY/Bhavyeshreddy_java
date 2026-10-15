
class Student {
    int rollNo;
    String name;

    public static void main(String[] args) {
        Student obj1 = new Student();
        Student obj2 = new Student();

        obj1.rollNo = 101;
        obj1.name = "Rahul";

        obj2.rollNo = 102;
        obj2.name = "Ravi";

        System.out.println("Student 1 Details:");
        System.out.println("Roll Number: " + obj1.rollNo);
        System.out.println("Name: " + obj1.name);

        System.out.println("Student 2 Details:");
        System.out.println("Roll Number: " + obj2.rollNo);
        System.out.println("Name: " + obj2.name);
    }
}
