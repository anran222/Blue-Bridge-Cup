package brigebluecup;

import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/3/5 23:27
 */
public class Swap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        TwoNumber twoNumber=new TwoNumber(a,b);
        twoNumber.swap(a,b);
        System.out.println(twoNumber.a+" "+twoNumber.b);
    }
    static class TwoNumber{
        int a;
        int b;

        public TwoNumber(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public void swap(int a,int b){
            int temp=this.a;
            this.a=this.b;
            this.b=temp;
        }
    }
}

