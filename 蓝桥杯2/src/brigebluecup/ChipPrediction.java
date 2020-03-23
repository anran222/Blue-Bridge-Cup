package brigebluecup;

import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/3/23 22:40
 * 芯片预测
 */
public class ChipPrediction {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        int n = scanf.nextInt();             //输入芯片个数

        int[][] arr = new int[n][n];
        for(int i = 0;i < n;i++) {             //输入总体芯片测试结果
            for(int j = 0;j < n;j++) {
                arr[i][j] = scanf.nextInt();
            }
        }

        int temp = 0;
        for(int j = 0;j < n;j++) {                        //循环找出第一个好的芯片
            int True = 0;
            int False = 0;

            for(int i = 0;i < n;i++) {
                if(i == j)
                    continue;
                else if(arr[i][j] == 0)
                    False++;
                else
                    True++;
            }
            if(True >= False) {                          //通过一轮所有芯片对于某一芯片的测试比对得出结果
                temp = j;
                break;
            }

        }

        for(int i = 0;i < n;i++) {                      //将这个好的芯片所得的测试结果按格式输出
            if(arr[temp][i] == 1)
                System.out.print(i+1+" ");
        }
    }
}
