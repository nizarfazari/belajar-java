package oop_java.InnerClass;

//OuterClass
public class Company {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // innerClass
    public class Employee{
        private String name;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public String getCompany(){
            // untuk mengakases outer class name
            return Company.this.name;
        }
    }

}



