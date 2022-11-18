package ooday05;

public class FinalDemo {
    public static void main(String[] args) {

    }
}
//演示final修饰类
final class Hoo{}
//class Ioo extends Hoo{}//final的类不能被继承
class Joo{}
final class Koo extends Joo{}//但是final可以修饰派生类
//final可以当儿子但是不能当爸爸

//演示final修饰方法
class Foo{
    final void thow(){
    }
    void text(){}
}
class Goo extends Foo{
    //void thow(){}//不能重写方法
    void text(){}
}

//演示final修饰变量
class Eoo{
    final int num=5;
    void show(){
        //num=100;//不能变
    }
}