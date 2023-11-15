package oop_java.exception;

public class ValidationException extends Throwable {
    public ValidationException(String message){
        // karena ada constuctor pada messagenya jadi gk usah bikin variable sendiri
        super(message);
    }


}
