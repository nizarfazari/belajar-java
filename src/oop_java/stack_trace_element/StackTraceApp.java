package oop_java.stack_trace_element;

public class StackTraceApp {
    public static void main(String[] args) {
        try {
            sampleError();
        }catch (RuntimeException runtimeException){
            runtimeException.printStackTrace();
        }
    }

    public static void sampleError(){
        try {
            String[] names = {
                    "nizar", "fazari"
            };

            System.out.println(names[100]);
        }catch (Throwable throwable){
            throw  new RuntimeException(throwable);
        }
    }
}
