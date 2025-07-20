public class Static {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.schoolName = "MVP";

        Student s2 = new Student();
        System.out.println(s2.schoolName);
        System.out.println(s2.marks(77, 80, 90));

        Student s3 = new Student();
        System.out.println(s3.marks(90, 93, 88));
    }
}

class Student {

    static int marks(int phy, int math, int chem) {
        return (phy + math + chem);
    }

    //
    String name;
    int roll;

    static String schoolName;

    void setNAme(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}