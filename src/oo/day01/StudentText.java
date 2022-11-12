package oo.day01;
//学生的测试类
public class StudentText {
    public static void main(String[] args) {
        //创建对象
        Student zs=new Student();
        Student lisi=new Student();
        //给成员变量赋值
        zs.name="zhangsan";
        zs.age=22;
        zs.address="福建福州";
        lisi.name="lisi";
        lisi.age=50;
        lisi.address="福州永泰";
        //调用方法
        lisi.study();
        lisi.sayHi();
        zs.study();
        zs.sayHi();

        //1)创建一个学生对象
        //2）给予默认值
        //3）明天说
        Student ww=new Student();
        /*
        byte short int long double float char 默认值为0
        Boolean 默认值为false
        String  默认值为null
        */
        ww.sayHi();
        ww.study();
    }
}
