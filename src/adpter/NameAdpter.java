package adpter;

/**
 * Adapter Class
 * --------------
 * Converts SimpleName (full name)
 * into ComplexNameInterface (first + last name)
 */
public class NameAdpter implements ComplexNameInterface {

    private String firstName;
    private String lastName;

    private SimpleName sm;

    public NameAdpter(SimpleName sm) {
        this.sm = sm;

        // Get full name from SimpleName
        String fullName = sm.getSimpleName().trim();

        // Split name into parts
        String[] parts = fullName.split(" ");

        // Assign first and last name
        if (parts.length >= 2) {
            firstName = parts[0]; // first word
            lastName = parts[parts.length - 1]; // last word
        } else {
            // If only one name is provided
            firstName = fullName;
            lastName = "";
        }
    }

    @Override
    public void setFname(String fname) {
        this.firstName = fname;
    }

    @Override
    public void setLname(String lname) {
        this.lastName = lname;
    }

    @Override
    public String getFname() {
        return firstName;
    }

    @Override
    public String getLname() {
        return lastName;
    }
}