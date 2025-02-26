package StudentExample;

public class GradStudent extends Student {
    // private attribute specific to GradStudent
    private String programName;

    // public methods specific to GradStudent
    public void setProgram(String program){
        programName = program;
    }

    public String getProgram(){
        return programName;
    }

}