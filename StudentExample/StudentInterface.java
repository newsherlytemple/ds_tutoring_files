package StudentExample;

public interface StudentInterface {
    // attributes
    // must be public and final
    public final String schoolName = "Cal Poly Pomona"; 

    // methods
    // if a class uses this interface, 
    // it must implement ALL of these methods
    public void setGPA(double gpa);
    public void setStudentID(int id);
    public void setStudentName(String name);
    public double getGPA();
    public int getStudentID();
    public String getStudentName();
    public String getSchool();
}