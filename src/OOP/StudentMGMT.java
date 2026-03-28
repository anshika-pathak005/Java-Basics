package OOP;

abstract class Student{

    // attributes
    private int id;
    private String name;
    private String course;

    // constructor to initialize the values
    public Student(int id,String name,String course){
        this.id = id;
        this.name = name;
        this.course = course;
    }

    // displaying the info
    public void displayInfo(){
        System.out.println("Studnt Id - "+ id );
        System.out.println("Studnt name - "+ name );
        System.out.println("Studnt course - "+ course );
    }

    // to calculate the fees, which is imlemented by the child classes
    public abstract void calculateFee();
}

class RegularStudent extends Student{

    // constructor
    public RegularStudent(int id, String name, String course){
        super(id,name,course);
    }

    @Override
    public void calculateFee(){
        System.out.println("you are regular student so your total fees is : " + 1000);
    }

}

class DistanceStudent extends Student{

    // constructor
    public DistanceStudent(int id, String name, String course){
        super(id,name,course);
    }

    @Override
    public void calculateFee(){
        System.out.println("you are distance student so your total fees is : " + 2000);
    }

}

public class StudentMGMT {
    public static void main(String[] args) {
        Student s1 = new RegularStudent(1,"anshika","BCA");
        s1.displayInfo();
        s1.calculateFee();

        System.out.println();

        Student s2 = new DistanceStudent(2,"kashvi","MCA");
        s2.displayInfo();
        s2.calculateFee();
    }
}

