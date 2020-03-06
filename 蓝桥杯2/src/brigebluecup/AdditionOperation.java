package brigebluecup;

import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/3/6 21:40
 * 加法运算
 */
public class AdditionOperation {
    public static void main(String[] args) {
        int[] a=GetTwoInts();
        int n=a[0]+a[1];
        System.out.println(n);
    }

    public static int[] GetTwoInts(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[] arr=new int[2];
        arr[0]=a;
        arr[1]=b;
        return arr;
    }
}
