package ex09_2_exercise;

public class Customer {
    private String name;
    private String ssn;
   
    // Encapsulate this class.  Make ssn read only.

    public String getName () {
        return name;
    }

    public String getSSN () {
        return ssn;
    }

    public void setName (String p_name) {
        this.name = p_name;
    }

    // Constructor

    public Customer  (String c_name, String c_ssn) {
        this.name = c_name;
        this.ssn = c_ssn;
    }

}