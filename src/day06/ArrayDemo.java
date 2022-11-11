package day06;
//数组的复制，排序
import java.util.Arrays;
public class ArrayDemo {
    public static void main(String[] args) {
        /*
        int[] a={10,20,30,40,50}
        int[] b=new int[6];//0,0,0,0,0,
        b的前五个跟a一样----复制
            复制方法：
                1）灵活性很高
                    System.arraycopy(a,srcPos:1,b,destPos:0,length:4)
                    srcPos:1--源数组的起始下标
                    destPos:0--目标数组的起始下标
                    length:4--复制元素的元素个数
                    注意越界
                2）
                特殊点：
                    可以为已经确定的数组进行扩容和减容（是新建了一个数组）
                    int[] a=new int[]{10,20,30,40,50}
                    a=Arrays.copyOf(a,newlength:a.length+1);
                    使其a数组变成了一个新的数组，其容量是6个单元，补齐默认值0;
                    同理可以减容：
                    a=Arrays。copyOf(a,newlength:a.length-1);
                    使其a数组变成一个新的数组，其容量是4个单元，把末尾剪掉

                import java.util.Arrays;
                 int[] a={10,20,30,40,50}
                 int[] b=Arrays.copyOf(a,newlength:6);
                 a--源数组
                 b--目标数组
                 6--目标数组的长度
                 不能控制元素的位置，只能从头到尾
                 //---若目标数组的长度>源数组的长度，在末尾补默认值
                 //---若目标数组的长度<源数组的长度，在末尾截掉


                排序
                    随机生成30万数据------使用不同算法排序来排序，结论如下
                    1.当数据不同时，不同的排序算法速度不同
                        有的时候冒泡最快，有的时候快速最快，有的时候插入
                    2.用Arrays.sort(arr);//进行升序排列，最快
                    还是需要import java.util.Arrays;
        */


        //第一种方法----复制
        System.out.println("方法一的复制复制到brr：");
        int[] arr=new int[]{10,20,30,40,50};
        int[] brr=new int[10];
        System.arraycopy(arr,1,brr,2,4);
        for (int i=0;i< brr.length;i++){
            System.out.print(brr[i]+"\t");
        }
        System.out.println();
        //第二种方法----复制
        System.out.println("方法二的复制到b：");
        int[] a={10,20,30,40,50};
        int[] b=Arrays.copyOf(a,6);
        for (int i=0;i< b.length;i++){
            System.out.print(b[i]+"\t");
        }
        //第二种方法的特殊性--扩容
        System.out.println();
        a=Arrays.copyOf(a,a.length+2);
        System.out.println("a扩容的效果：");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }

        System.out.println();
        //排序
        int[] crr=new int[10];
        System.out.println("排序前的随机数：");
        for (int i=0;i<crr.length;i++){
            crr[i]=(int)(Math.random()*100);
            System.out.print(crr[i]+"\t");
        }
        System.out.println();
        Arrays.sort(crr);
        System.out.println("排序后的随机数（升序）：");
        for (int i=0;i<crr.length;i++){
            System.out.print(crr[i]+"\t");//升序排序
        }

    }
}
