public class PhoneNumberAlreadyExists extends Exception{
    //Exception class that causes an error on an already existing number
    public PhoneNumberAlreadyExists(String message) {
        super(message);
    }
}
