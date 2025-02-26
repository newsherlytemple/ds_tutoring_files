package StudentExample;

public class UndergradStudent extends Student {
    // private attribute specific to UndergradStudent
    private int currentYear;

    // public methods specific to UndergradStudent
    public void setYear(int year){
        currentYear = year;
    }

    public int getYear(){
        return currentYear;
    }
}
