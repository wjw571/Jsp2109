package day06;
//数组元素的最大值
import java.util.Arrays;
public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr=new int[10];
        System.out.println("arr数组值:");
        for (int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*100+1);
            System.out.print(arr[i]+"  ");
        }
        //     0   1   2   3
        //带数：25，26.45，18
        //25<26，则交换一下max=26
        //26<45，交换max=45
        //45>18，则不交换max=45
        System.out.println();
        int max=arr[0];//假设第一个元素为最大值
        for(int i=1;i<arr.length;i++){//遍历剩余元素
            if(max<arr[i]){//若剩余元素大于max
                max=arr[i];//则修改max的值为最大的
            }
        }
        System.out.println("最大值为"+max);
        //把最大的值放在数组最后一位的下一位
        arr=Arrays.copyOf(arr,arr.length+1);
        arr[arr.length-1]=max;
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
