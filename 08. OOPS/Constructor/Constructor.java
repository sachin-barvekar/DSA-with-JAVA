public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student(); //for default constructor if other constructor are available in the class then other default constructor should be present.
        Student s2 = new Student(65);
        Student s3 = new Student("Sachin");

        System.out.println("Copy constructor output:");
        s1.name = "Sachin";
        s1.rollno = 123;
        s1.marks[0]=80;
        s1.marks[1]=90;
        s1.marks[2]= 100;

        Student s4 = new Student(s1); //copy of s1 obj to the s4 obj
        s1.name = "aditya"; // not change in s4 object but in case of array it changes due to it refer array address;

        System.out.println(s4.name);
        System.out.println(s4.rollno);
        s4.password = "abc";
        System.out.println(s4.password);

        System.out.println("Orginal marks array");
        for(int i=0; i<3; i++){
            System.out.println(s4.marks[i]);
        }

        s1.marks[1]=150; //after chage the s1.marks then s4.marks also get change.
        System.out.println("After changing marks array of s1 object");
        for(int i=0; i<3; i++){
            System.out.println(s4.marks[i]);
        }
    }
}

class Student{
    int rollno;
    String name;
    String password;
    int marks[];

    //default constructor
    Student(){ 
        marks = new int[3];
        System.out.println("Student class default constructor");
    }

    //parameterized constructor
    Student(int rollno){
        System.out.println("Student class parameterized constructor");
        this.rollno = rollno;
    }

    Student(String name){
        this.name = name;
    }

    //Shallow copy constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.rollno = s1.rollno;
    //     this.marks = s1.marks;
    // }

    //Deep copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        for(int i=0; i<marks.length; i++){
            this.marks[i]=s1.marks[i];
        }
    }
}
