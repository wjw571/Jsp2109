package day05;
//出题算题测试
//随机加法运算器
import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int scores=0;
        System.out.println("欢迎进入加分随机数运算器");
        System.out.println("接下来开始测试，题数10题");
        System.out.println("开始！！！");
    for(int i=1;i<=10;i++){
        int num1=(int)(Math.random()*100+1);
        int num2=(int)(Math.random()*100+1);
        int sum=num1+num2;
        System.out.println("("+i+")"+num1+"+"+num2+"="+"?");
        System.out.println("算吧！");
        int usernum=scan.nextInt();
        if(usernum==-1){
            System.out.println("提前结束");
            break;
        }else if(usernum!=sum){
            System.out.println("答错了");
        }else{
            System.out.println("答对了");
            scores+=10;
        }
    }
    System.out.println("总分为"+scores);
    }
}
