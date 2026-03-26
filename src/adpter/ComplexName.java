package adpter;

/**
 * ComplexName Class
 * ------------------
 * Stores first and last name separately
 */
public class ComplexName implements ComplexNameInterface {

    private String fname;
    private String lname;

    @Override
    public void setFname(String fname) {
        this.fname = fname;
    }

    @Override
    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String getFname() {
        return fname;
    }

    @Override
    public String getLname() {
        return lname;
    }
}