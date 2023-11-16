package oop_java.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// anotations untuk menambahkan meta data dan bisa di akses dengan reflektions
@Target(value = {ElementType.TYPE, ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Fancy {

    String name() ;

//    default value
    String[] tags() default {};
}
