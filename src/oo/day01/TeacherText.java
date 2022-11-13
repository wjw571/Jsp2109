package oo.day01;

public class TeacherText {
    public static void main(String[] args) {
        Teacher tc1=new Teacher();
        Teacher tc2=new Teacher();
        tc1.name="zhangsan";
        tc2.name="lisi";
        tc1.age=50;
        tc2.age=44;
        tc1.subject="数学";
        tc2.subject="语文";
        tc1.say();
        tc2.say();

    }

}
