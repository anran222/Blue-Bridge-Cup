package brigebluecup;

import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/4/3 21:52
 */
public class MonkeysEatSteamedBuns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int z1=sc.nextInt();
        int n=sc.nextInt();
        double sum=0;
        sum=(1.00*x1/x)+(1.00*y1/y)+(1.00*z1/z);
        System.out.printf("%."+n+"f",sum);
    }
}
