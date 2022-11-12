package day06;

import java.util.Arrays;
import java.util.Scanner;

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


        System.out.println();
        //键盘输入，数组排序
        //同时运用Arrays.toString(数组名)进行输出
        //System.out.println(Arrays.toString(数组名));
        //如果是 String str=Arrays.toString(数组名);则写死了因为这样子，后期输出str是个变量，是一个字符串
        //他是进行将数组的元素进行赋值给str字符串变量，后输出字符串
        int[] trr=new int[10];
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<trr.length;i++){
            trr[i]=scan.nextInt();
        }

        System.out.println("未排序数组："+Arrays.toString(trr));
        Arrays.sort(trr);
        System.out.println("排序后数组（升序）："+Arrays.toString(trr));
        System.out.println();


        //第二遍练习
        //复制第一种方法
        System.out.println("复制第一种方法");
        int[] qrr=new int[10];
        for (int i=0;i<qrr.length;i++){
            qrr[i]=(int)(Math.random()*100+1);
        }
        System.out.println("qrr数组："+Arrays.toString(qrr));
        int[] err=Arrays.copyOf(qrr,10);
        System.out.println("err数组(复制数组)："+Arrays.toString(err));
        System.out.println();
        System.out.println("复制第二中方法");
        int[] urr=new int[10];
        for (int i=0;i<urr.length;i++){
            urr[i]=(int)(Math.random()*100+1);
        }
        System.out.println("urr数组："+Arrays.toString(urr));
        int[] prr=new int[20];
        System.arraycopy(urr,0,prr,4,10);
        System.out.println("prr数组："+Arrays.toString(prr));
        System.out.println();
        //求最大值，且最大值放置在原数组最后一个位置

        int[] nrr=new int[5];
        Scanner scan1=new Scanner(System.in);
        for (int i=0;i<nrr.length;i++){
            nrr[i]=scan1.nextInt();
        }
        System.out.println("nrr数组："+Arrays.toString(nrr));
        int max1 = nrr[0];
        for(int i=1;i<nrr.length;i++){
            if(max1<nrr[i]){
                max1=nrr[i];
            }
        }
        System.out.println("nrr数组最大值为max1："+max1);
        nrr=Arrays.copyOf(nrr,nrr.length+1);
        nrr[nrr.length-1]=max1;
        System.out.println("新的nrr数组为："+Arrays.toString(nrr));
        Arrays.sort(nrr);
        System.out.println("新的nrr数组并且排序（升序）为："+Arrays.toString(nrr));
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
