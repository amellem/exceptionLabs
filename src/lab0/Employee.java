package lab0;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private int daysVacation;

    public Employee() {
        // initialize a bunch of default values
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        this.daysVacation = daysVacation;
    }
    
    public int getDaysVacation() {
        return daysVacation;
    }

    // Validation Rules:
    // - min cannot be less than 0
    // - max cannot be more than 120
    public void setDaysVacation(int daysVacation) throws IllegalArgumentException {
        if(daysVacation <0 || daysVacation > 120){
            throw new IllegalArgumentException("Sorry vacation days must be between 0 and 120");
        }else{
            this.daysVacation = daysVacation;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    // Validation rules:
    // - no null values allowed
    // - no empty Strings allowed
    // - no special symbols
    // - length must be between 1 and 50
    public final void setFirstName(String firstName) throws IllegalArgumentException{
        if(firstName == null || firstName.length() < 1 || firstName.length() > 50 || firstName == "" || firstName == "!" || firstName == "@"
                || firstName == "#" || firstName == "%" || firstName == "^" || firstName == "&" || firstName == "*" || firstName == "("
                || firstName == ")" || firstName == "+" || firstName == "=" || firstName == "~" || firstName == "`") {
            throw new IllegalArgumentException("Not a valid input for a first name");
        }else{
            this.firstName = firstName;
        }
        
    }

    public String getLastName() {
        return lastName;
    }
    
    // Validation rules:
    // - no null values allowed
    // - no empty Strings allowed
    // - no special symbols
    // - length must be between 1 and 50
    public void setLastName(String lastName) throws IllegalArgumentException{
        if(firstName == null || firstName.length() < 1 || firstName.length() > 50 || firstName == "" || firstName == "!" || firstName == "@"
                || firstName == "#" || firstName == "%" || firstName == "^" || firstName == "&" || firstName == "*" || firstName == "("
                || firstName == ")" || firstName == "+" || firstName == "=" || firstName == "~" || firstName == "`") {
            throw new IllegalArgumentException("Not a valid input for a last name");
        }else{
        this.lastName = lastName;
        }
    }

    public final String getSsn() {
        return ssn;
    }

    // Validation rules:
    // - no null values allowed
    // - no empty values allowed
    // - no special symbols
    // - length must be equal to 9
    // - must be an Int
    public void setSsn(String ssn) throws NumberFormatException{
        if(ssn == null || ssn == "" || ssn.length() < 9 || ssn == "" || ssn == "!" || ssn == "@"
                || ssn == "#" || ssn == "%" || ssn == "^" || ssn == "&" || ssn == "*" || ssn == "("
                || ssn == ")" || ssn == "+" || ssn == "=" || ssn == "~" || ssn == "`"){
            throw new NumberFormatException("Not a vaild input for a SSN");
        }else{
        this.ssn = ssn;
        }
    }
    
    
    
}
