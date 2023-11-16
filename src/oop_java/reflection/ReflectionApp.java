package oop_java.reflection;

import oop_java.exception.ValidationUtil;

public class ReflectionApp {

    public static void main(String[] args) {
        CreateUserRequest createUserRequest = new CreateUserRequest();
        createUserRequest.setUsername("Nizar");
        createUserRequest.setPassword("Nizar");

        //Penggunaan Reflection pada Validation Util

        ValidationUtil.validationReflections(createUserRequest);
    }
}
