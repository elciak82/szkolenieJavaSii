package pl.klasy2;

public class Student {
    public String name;
    public Integer age;

    public Student setAge(Integer age) {
        this.age = age;
        return this;
    }

    //    Student(){
//        System.out.println("Czesc jestem Studentem.");
//    }

    @Override
    public String toString() {
        return "sting ze studenta.";
    }
    
    public Student (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }
}
