package brigebluecup;

import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/3/5 23:01
 * Rp
 */
public class Rp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n>0){
            n=n/10;
        }
        System.out.println(n);
    }
}
