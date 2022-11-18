package ooday03text;

public class Test {
    public static void main(String[] args) {
    Person[] ps=new Person[5];
    ps[0]=new Student("wjw",18,"fz","2050202022");
    ps[1]=new Student("ww",22,"yt","555555");
    ps[2]=new Student("lisi",55,"pt","555554444");
    ps[3]=new Teacher("zhangsan",88,"yj",8000);
    ps[4]=new Doctor("wjy",78,"xy","本科");
    for (int i=0;i< ps.length;i++){
        System.out.println(ps[i].name);
        ps[i].sayHi();

    }
    Student zs=new Student("zhangsan",99,"Fuzhou","88777878787");
    Person ps1=new Student("zhangsan",99,"Fuzhou","88777878787");
    zs.sayHi();
    ps1.sayHi();
    //重写调用方法的时候，看对象的类型

    }
}
