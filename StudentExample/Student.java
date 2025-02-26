package StudentExample;

public class Student implements StudentInterface {
    // private attributes
    // these are only accessible within this class
    private double studentGPA;
    private int studentID;
    private String studentName;

    // methods
    public void setGPA(double gpa){
       studentGPA = gpa;
    }

    public void setStudentID(int id){
        studentID = id;
    }

    public void setStudentName(String name){
        studentName = name;
    }

    public double getGPA(){
        return studentGPA;
    }

    public int getStudentID(){
        return studentID;
    }

    public String getStudentName(){
        return studentName;
    }

    // note: we can access schoolName directly in this class
    // but, StudentRegistry cannot access schoolName directly
    // so, need a public class to return this value:
    public String getSchool(){
        return schoolName;
    }
}
