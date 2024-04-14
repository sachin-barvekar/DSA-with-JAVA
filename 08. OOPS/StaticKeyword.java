public class StaticKeyword {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.school = "jspm"; //this school name remains same for all student class object
        System.out.println(s1.returnPercentage(80, 60, 70));

        Student s2 = new Student();
        System.out.println(s2.school);
        System.out.println(s2.returnPercentage(50,80, 65));

        Student s3 = new Student();
        System.out.println(s3.school);
    }
}

class Student{

    //static functions
    static int returnPercentage(int math, int phy, int chem){
        return(math + phy +chem)/3;
    }
    String name;
    int roll;

    static String school;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

}
