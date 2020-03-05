package brigebluecup;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/3/5 22:39
 * 字符串合并
 */
public class StringMerge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int m = c1.length;
        int n = c2.length;
        int num = m + n;
        int j = 0;
        char[] c3 = new char[num];
        for (int i = 0; i < num; i++) {
            if (i < m) {
                c3[i] = c1[i];
            } else {
                c3[i] = c2[j];
                j++;
            }
        }
        for (int i = 0; i <num ; i++) {
            System.out.print(c3[i]);
        }
    }
}
