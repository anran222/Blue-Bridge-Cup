package brigebluecup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/3/23 22:45
 * sine之舞
 */
public class DanceOfSine {

    public static List<String> Ann = new ArrayList<>();

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        DanceOfSine a = new DanceOfSine();
        System.out.println(a.resultSn(n, n));
        //a.resultSn(n,n)
    }

    public String resultAn(int n, int num) {
        String result = "";
        String f = "";
        if (n % 2 != 0) {
            f = "-";
        } else {
            f = "+";
        }
        if (n == num) {
            result = "sin(" + num + ")";
            return result;
        } else {
            result = "sin(" + n + f + resultAn(n + 1, num) + ")";
            Ann.add(result);
            return result;
        }

    }

    public String resultSn(int n, int num) {
        if (n == 1) {
            return resultAn(1, 1) + "+" + num;
        } else {
            return "(" + resultSn(n - 1, num) + ")" + resultAn(1, n) + "+" + (num + 1 - n);
        }
    }
}
