package day04;

public class SwitchCaseDemo {
    //优势：效率高，结构清晰
    //缺点：只能对整数来判断相等
    int num=2;

    public static void main(String[] args) {
        int num=4;//byte，short，int,char(本质上就是int)，String（jdk1.7）支持
                  //long，double，float 都不行
        switch(num){
            case 1://if(num==1),同时每一条路名字都不能重复 （case后的数）
                System.out.println("222");
                break;//让此不能往下走
            case 2://以此为入口，到最后（没有break的前提下）
                System.out.println("333");
                break;
            case 3:
                System.out.println("444");
                break;
            case 4:
                System.out.println("555");
                break;
            default:
                System.out.println("666");//当case都没有匹配上就走default
        }
    }
}
