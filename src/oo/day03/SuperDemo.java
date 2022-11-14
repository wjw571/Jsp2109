package oo.day03;
//super的演示
public class SuperDemo {
    public static void main(String[] args) {
        Hoo h=new Hoo();
    }
}
class Voo{
    Voo(){
        System.out.println("超类的构造方法");
    }
}
class Hoo extends Voo{
    Hoo(){
        super();
        System.out.println("派生类的构造方法");
    }
}
    class Coo{
        Coo(int a){

        }
    }
    class Doo extends Coo{
        Doo(){
            super(5);
        }
        /*这个是系统自己提供的调用超类的无参构造，但是因为他是有参的，所以调用不了
        Doo(){
            super();
        }


        */
    }