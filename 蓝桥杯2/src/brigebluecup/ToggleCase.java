package brigebluecup;

import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/3/5 22:24
 * 大小写转换
 */
public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] c=s.toCharArray();
        for (int i = 0; i <c.length ; i++) {
            if ('a'<=c[i]&&c[i]<='z'){
                c[i]-=32;
            }else if ('A'<=c[i]&&c[i]<='Z'){
                c[i]+=32;
            }
        }
        for (int i = 0; i <c.length ; i++) {
            System.out.print(c[i]);
        }
    }
}
