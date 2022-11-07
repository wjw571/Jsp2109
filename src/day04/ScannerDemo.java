package day04;
import java.util.Scanner;//1.
//Scanner的演示
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);//2.
        System.out.println("请输入年龄：");
        int age=scan.nextInt();//3.
        System.out.println("请输入商品的价格：");
        double prices=scan.nextDouble();//3.
        System.out.println("我的年龄是："+age+"，商品的价格是："+prices);
    }
}
