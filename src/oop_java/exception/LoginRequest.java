package oop_java.exception;

public class LoginRequest {
    public String username;
    public   String password;

    LoginRequest(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
}
