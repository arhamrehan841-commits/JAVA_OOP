// File: Student.java

// This class shows encapsulation with a student example
class Student {

    // Private variables hidden from outside
    private String name = "N/A";
    private int roll_no = -1;
    private String subject = "N/A";
    private int marks = -1;

    // Public setter methods to update private variables
    void setName(String namev) {
        name = namev;
        System.out.println("Name set to: " + namev);
    }

    void setRollNo(int rollNoV) {
        roll_no = rollNoV;
        System.out.println("Roll number set to: " + rollNoV);
    }

    void setSubject(String subjectv) {
        subject = subjectv;
        System.out.println("Subject set to: " + subjectv);
    }

    void setMarks(int marksv) {
        if (marksv >= 0 && marksv <= 100) {
            marks = marksv;
            System.out.println("Marks set to: " + marksv);
        } else {
            System.out.println("Marks should be between 0-100");
        }
    }

    // Public method to view student info
    void seeInfo() {
        if (name.equals("N/A") || roll_no == -1 || subject.equals("N/A") || marks == -1) {
            System.out.println("Fill out the info before calling this method");
        } else {
            System.out.println("\nSTUDENT INFO");
            System.out.println("Name: " + name);
            System.out.println("Roll no: " + roll_no);
            System.out.println("Subject: " + subject);
            System.out.println("Marks: " + marks);
        }
    }
}

// Test the class
public class Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();

        // Using setter methods to update private data
        s1.setName("Hamza");
        s1.setRollNo(35);
        s1.setSubject("Programming fundamentals");
        s1.setMarks(78);

        // Using method to view data
        s1.seeInfo();
    }
}
