/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Cloudaerius
 */
public class InvalidLastNameException extends Exception{

    private static String msg = "No a valid input to generate a last name";
    
    public InvalidLastNameException() {
        super(InvalidLastNameException.msg);
    }

    public InvalidLastNameException(String string) {
        super(InvalidLastNameException.msg);
    }

    public InvalidLastNameException(String string, Throwable thrwbl) {
        super(InvalidLastNameException.msg, thrwbl);
    }

    public InvalidLastNameException(Throwable thrwbl) {
        super(InvalidLastNameException.msg,thrwbl);
    }

    public InvalidLastNameException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(InvalidLastNameException.msg, thrwbl, bln, bln1);
    }
    
}
