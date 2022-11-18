package ooday04;

public class MultiTypeDemo {
    public static void main(String[] args) {
        Aoo a=new Aoo();
        a.a=0;
        a.show();

        Boo b=new Boo();
        b.b=1;
        b.test();

        Aoo c=new Boo();
        c.a=3;
        c.show();
    }
}
