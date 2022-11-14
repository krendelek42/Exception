public class RecordNotFound extends RuntimeException{
    // exception class that causes a non-existent id error
    public RecordNotFound(String message){
        super(message);
    }
}

