package jcCode.Student;



public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.studentID = 1234;
        System.out.println(s1.studentID);
        s1.address = "1234 Cherry Wood Lane";
        System.out.println(s1.address);
        s1.studentName = "John";
        System.out.println(s1.studentName);
        s1.collegeName = "UNLV";
        System.out.println(s1.collegeName);


    }

}
