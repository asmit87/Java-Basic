public class C1 {
static class student {
    int rollNo;
    String studentName;
}

    public static void main(String[] args) {
        student obj1 = new student();
        obj1.rollNo = 101;
        obj1.studentName = "John Doe";

        System.out.println("Roll No: " + obj1.rollNo);
        System.out.println("Student Name: " + obj1.studentName);

        student obj2 = new student();
        obj2.rollNo = 102;
        obj2.studentName = "Jane Smith";

        System.out.println("Roll No: " + obj2.rollNo);
        System.out.println("Student Name: " + obj2.studentName);
    }
}