package brigebluecup;

import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/2/27 22:30
 */
public class RecoveryNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int minN=-1;
        int minM=-1;
        int maxN=n;
        int maxM=m;
        int total=m*n;
        int flag=0;//0表示向下，1表示向右，2表示向上，3表示向左
        while (total!=0){
            switch (flag){
                case 0:
                    minM++;
                    for (int i = minN+1; i <maxN ; i++) {
                        System.out.print(arr[i][minM]+" ");
                    }
                    total--;
                    break;
                case 1:
                    maxN--;
                    for (int j = minM+1; j <maxM ; j++) {
                        System.out.print(arr[maxN][j]+" ");
                    }
                    total--;
                    break;
                case 2:
                    maxM--;
                    for (int i = maxN-1; i >minN ; i--) {
                        System.out.print(arr[i][maxN]+" ");
                    }
                    total--;
                    break;
                case 3:
                    minN++;
                    for (int j = maxM-1; j >minM ; j--) {
                        System.out.print(arr[minN][j]+" ");
                    }
                    total--;
                    break;
            }
            flag=(flag+1)%4;
        }
    }
}