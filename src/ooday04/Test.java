package ooday04;

public class Test {
    public static void main(String[] args) {
        Student[] stus=new Student[3];
        stus[0]=new Student("wjw",15,"fz","2050202022");
        stus[1]=new Student("lisi",22,"yt","2050202023");
        stus[2]=new Student("ww",55,"pt","2050202021");
        for (int i=0;i< stus.length;i++){
            System.out.println(stus[i].name);
            stus[i].sayHi();
        }
        Teacher[] tes=new Teacher[3];
        tes[0]=new Teacher("cc",55,"fz",8000.00);
        tes[1]=new Teacher("dd",56,"pt",10000.00);
        tes[2]=new Teacher("ss",57,"yt",4000.00);
        for (int i=0;i< tes.length;i++){
            System.out.println(tes[i].name);
            tes[i].sayHi();
        }
        Doctor[] docs=new Doctor[2];
        docs[0]=new Doctor("jj",77,"fz","7851");
        docs[1]=new Doctor("rj",78,"yt","75851");
        for (int i=0;i< docs.length;i++){
            System.out.println(docs[i].name);
            docs[i].sayHi();
        }
    }
}
