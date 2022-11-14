package oo.day03;
//引用类型数组的演示
public class RefArrayDemo {
    public static void main(String[] args) {
        Student[] stus=new Student[3];
        stus[0]=new Student("zhangsan",18,"fz");
        stus[1]=new Student("lisi",22,"yt");
        stus[2]=new Student("ww",55,"pt");
        System.out.println(stus[2].name);
        stus[1].age=55;
        stus[1].sayHi();
        for (int i=0;i< stus.length;i++){
            System.out.println(stus[i].name);
            stus[i].study();
        }
    }
}
