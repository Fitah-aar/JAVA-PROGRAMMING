package Data.EXERCISE2;

import java.util.Arrays;

class Courss {
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    // Constructor
    public Courss(String courseName) {
        this.courseName = courseName;
        this.students = new String[4]; // Cabbirka bilowga ah ee arrayga
        this.numberOfStudents = 0;
    }

    // Getters CourseName
    public String getCourseName() {
        return courseName;
    }

    // Getters Students
    public String[] getStudents() {
        return students;
    }

    // Getters number Of Students
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    // Ku darista arday cusub
    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            String[] newArry = new String[students.length * 2];
            System.arraycopy(students, 0, newArry, 0, students.length);
            students = newArry;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    // Ka saarida arday
    public void dropStudent(String student) {
        int indexFound = -1;

        // Marka hore raadi index-ka uu ardaygu oga jiro
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                indexFound = i;
                break;
            }
        }

        // Haddii ardaygii la helay dib u habee arrayda si booskaas loo tiro
        if (indexFound != -1) {
            for (int j = indexFound; j < numberOfStudents - 1; j++) {
                students[j] = students[j + 1];
            }
            students[numberOfStudents - 1] = null;
            numberOfStudents--;
            System.out.println(student + " waa laga saaray koorsada.");
        } else {
            System.out.println(student + " lagama helin koorsadan.");
        }
    }
}


public class Exer5Courses {
    public static void main(String[] args) {
        // Samee koorso cusub
        Courss myCourse = new Courss("Java Programming");

        // Ku dar arday cusub
        myCourse.addStudent("Axmed");
        myCourse.addStudent("Faadumo");
        myCourse.addStudent("Cali");
        myCourse.addStudent("Maxamed");
        myCourse.addStudent("Xasan"); // Tani waxay tijaabinaysaa inuu array-gu iskii u weynaado

        // dawac magaca koorsada iyo tirada ardayda
        System.out.println("Koorsada: " + myCourse.getCourseName());
        System.out.println("Tirada Ardayda Hore: " + myCourse.getNumberOfStudents());
        System.out.println("Ardayda: " + Arrays.toString(myCourse.getStudents()));
        System.out.println("----------------------------------------");

        // Dib u tusi ardayda ka dib marka Cali la saaro
        System.out.println("----------------------------------------");
        System.out.println("Tirada Ardayda Cusub: " + myCourse.getNumberOfStudents());
        System.out.println("Ardayda Haray: " + Arrays.toString(myCourse.getStudents()));
    }
}
