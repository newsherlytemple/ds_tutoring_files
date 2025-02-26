package StudentExample;

public class StudentRegistry {

    public static void makeStudent(){

        // create instances of UndergradStudent and GradStudent
        UndergradStudent u_student = new UndergradStudent();
        GradStudent g_student = new GradStudent();

        // below, u_student and g_student both use a method from the Student Class
        u_student.setStudentName("John Smith");
        g_student.setStudentName("Jane Doe");

        // u_student and g_student use methods from their own respective classes
        u_student.setYear(1);
        g_student.setProgram("MS");

        // print out to see what's going on
        System.out.println(u_student.getStudentName());
        System.out.println(u_student.getYear());
        System.out.println(g_student.getStudentName());
        System.out.println(g_student.getProgram());

        // get the schoolName of u_student
        System.out.println(u_student.getSchool());
    }

    // need main method to run the program
    public static void main(String[] args){
        makeStudent();
    }

}
