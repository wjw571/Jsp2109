package day04;
import java.util.Scanner;
//成绩等级排名
/*
A:成绩大于等于90
B:成绩大于等于80小于90
C:成绩大于等于60小于80
D:成绩小于60
*/
public class ScoreLevel {
    public static void main(String[] args) {
        Scanner sacn=new Scanner(System.in);
        System.out.println("请输入成绩");
        double score=sacn.nextDouble();
        System.out.println("成绩是："+score);
        //带数（101，-1，99.999，89.9999，79.9999，59.9999）
        if(score<0||score>100){
            System.out.println("成绩不合法");
        } else if(score>=90){
            System.out.println("成绩等级为A");
        }else if (score>=80&&score<90){
            System.out.println("成绩等级为B");
        }else if(score>=60&&score<80){
            System.out.println("成绩等级为C");
        }else if(score<60){
            System.out.println("成绩等级为D");
        }
    }


}
