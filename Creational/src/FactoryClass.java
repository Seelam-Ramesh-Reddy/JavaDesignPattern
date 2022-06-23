package Creational.src;

public class FactoryClass {
    public static void main(String[] args) {
        ProfessionFactory professionFactory=new ProfessionFactory();
        Profession profession=professionFactory.getProfession("doctor");
        profession.print();
    }
}

class ProfessionFactory{
    public Profession getProfession(String type){
        if (type == null){
            return null;
        }
        if (type.equalsIgnoreCase("doctor")){
            return new Doctor();
        }
        if (type.equalsIgnoreCase("engineer")){
            return new Engineer();
        }
        if (type.equalsIgnoreCase("teacher")){
            return new Teacher();
        }
        return null;
    }
}

class Teacher implements Profession{

    @Override
    public void print() {
        System.out.println("I am a Teacher");
    }
}

class Engineer implements Profession{

    @Override
    public void print() {
        System.out.println("I am a Engineer");
    }
}

class Doctor implements Profession{

    @Override
    public void print() {
        System.out.println("I am a Doctor");
    }
}

interface Profession{
    void print();
}
