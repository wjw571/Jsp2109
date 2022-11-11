package day06;

import java.util.Arrays;
public class TextDay06 {
    public static void main(String[] args) {
        System.out.println("第一种复制方法：");
        int[] arr=new int[]{25,645,78,95,45};
        int[] brr=new int[10];
        System.arraycopy(arr,0,brr,0,1);
        for (int i=0;i<brr.length;i++){
            System.out.print(brr[i]+"\t");
        }
        System.out.println();
        System.out.println("第一种使用System.arraycopy,不需要import");
        System.out.println();
        System.out.println("第二种复制方法：");
        int[] a=new int[]{1,2,3,4,5,6,7};
        int[] b= Arrays.copyOf(a,5);
        for (int i=0;i<b.length;i++){
            System.out.print(b[i]+"\t");
        }
        System.out.println();
        System.out.println("第二种使用Array.copyOf,需要import");


        System.out.println("使用Arrays.copyOf可以扩容");
        int[] c=new int[]{1,2,3,4,5,6,7};
        c= Arrays.copyOf(c,10);
        for (int i=0;i<c.length;i++){
            System.out.print(c[i]+"\t");
        }
        System.out.println();
        System.out.println("扩容三位，自动补全");
        System.out.println();
        System.out.println("数组的排序");
        int[] d=new int[10];
        System.out.println("排序前");
        for(int i=0;i<d.length;i++){
            d [i]=(int)(Math.random()*100+1);
            System.out.print(d[i]+"  ");
        }
        System.out.println();
        Arrays.sort(d);
        System.out.println("排序后(升序)");
        for (int i=0;i<d.length;i++){
            System.out.print(d[i]+"  ");
        }
        System.out.println();
        System.out.println("降序（倒着输出）");
        for(int i=d.length-1;i>=0;i--){
            System.out.print(d[i]+"  ");
        }
        System.out.println();



        System.out.println("数组元素的最大值,并且放在末尾的下一个位置");
        int[] e=new int[10];
        for(int i=0;i<e.length;i++){
            e [i]=(int)(Math.random()*100+1);
            System.out.print(e[i]+"  ");
        }
        int max = e[0];
        for (int i=1;i< e.length;i++){
            if(e[i]>max){
                max=e[i];
            }
        }
        System.out.println();
        System.out.println("最大值为："+max);
        e= Arrays.copyOf(e,11);
        e[e.length-1]=max;
        for (int i=0;i<e.length;i++){
            System.out.print(e[i]+"  ");
        }
        System.out.println();
        System.out.println();


        System.out.println("无参无返回值的调用：");
        say();
        System.out.println("有参无返回值调用：");
        sayHi("zhangsan");
        System.out.println("有多个参无返回值调用：");
        sayHello("lisi",30);
        System.out.println("无参有返回值调用：");
        double a1=a();
        System.out.println("a1="+a1);
        System.out.println("有参多个有返回值调用：");
        int m=10,n=20;
        int sum=b(m,n);
        System.out.println("sum="+sum);
        System.out.println("数组无参有返回值调用：");
        int[] c1=c();
        System.out.println("数组的长度c1:"+c1.length);
        System.out.println("数组元素c1：");
        for (int i=0;i<c1.length;i++){
            System.out.print(c1[i]+"  ");
        }
        System.out.println();
        System.out.println("有参有返回值调用：");
        int f=max(100);
        System.out.println("max="+f);
        System.out.println("方法的嵌套：");
        System.out.println("我的饮食习惯：");
        like();
    }
    public static void say(){
        System.out.println("大家好，我叫wjw，今年我22岁了");
    }
    public static void sayHi(String name){
        System.out.println("大家好，我叫"+name+"，今年我22岁了");
    }
    public static void sayHello(String name,int age){
        System.out.println("大家好，我叫"+name+"，今年我"+age+"岁了");
    }
    public static double a(){
        return 6.66;
    }
    public static int b(int num1,int num2){
        int num=num1+num2;
        return num;
    }
    public static int[] c(){
        int[] arr=new int[]{20,60,50};
        return arr;
    }
    public static int max(int max){
        return max;
    }
    public static void like(){
        System.out.print("我喜欢：");
        food();
        System.out.println();
        System.out.print("我不喜欢:猪肉");
    }
    public static void food(){
        System.out.print("牛肉");
    }
}
