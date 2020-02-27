package brigebluecup;

import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/2/27 21:51
 * 报时助手
 */
public class TimeAssistant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int m=sc.nextInt();
        String[] hour= {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen"
                        ,"sixteen","sevevteen","eighteen","nineteen","twenty","twenty one","twenty two","twenty three"};
        String[] min1={"one","two","three","four","five","six","seven","eight","nine","" +
                "ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","sevevteen","eighteen","nineteen","twenty"};
        String[] min2={"one","two","three","four","five","six","seven","eight","nine"};
        String[] min3={"zero","ten","twenty","thirty","forty","fifty"};
        if (m==0){
            System.out.println(hour[h]+" "+"o'clock");
        }else{
            if (m<=20){
                System.out.println(hour[h]+" "+min1[m-1]);
            }else if (m%10==0){
                System.out.println(hour[h]+" "+min3[m/10]);
            }else {
                System.out.println(hour[h]+" "+min3[m/10]+" "+min2[(m%10)-1]);
            }
        }
    }
}
