public class Student {

    //private int id;
    private String major;
    private String name;
    private double gpa;

    public Student( String major, String name, double gpa){
        this.name = name;
        //this.id = id;
        this.gpa = gpa;
        this.major = major;
    }

    /*public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }*/

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        return name+ " "+ major + " " + gpa;
    }
}
