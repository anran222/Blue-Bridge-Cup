package brigebluecup;

import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/3/23 22:36
 * 龟兔赛跑
 */
public class RaceBetweenTheTortoiseAndTheHare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //录入数据
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        int t = sc.nextInt();
        int s = sc.nextInt();
        int l = sc.nextInt();

        int s1=0,s2=0;//分别表示兔子\乌龟距离起点的距离
        int time = 0;
        while(s1 < l && s2 < l ){
            if(s1 - s2 >= t){//兔子休息
                for(int i=0;i<s;i++){
                    s2 += v2;
                    time++;
                    if(s2 == l)//乌龟到达终点
                        break;
                }
            }else{//兔子不休息
                s1 += v1;
                s2 += v2;
                time++;
            }
        }
        if(s1 == l && s2 < l)
            System.out.println("R");
        else if(s1 < l && s2 == l)
            System.out.println("T");
        else
            System.out.println("D");
        System.out.println(time);
    }
}