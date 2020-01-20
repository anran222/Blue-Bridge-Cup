package lianxi;

import java.util.HashSet;
import java.util.Scanner;

public class WithFractions {
    public static void main(String[] args) {
        new WithFractions().run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count=0;
        double start = System.currentTimeMillis();
        for(int i=1;i<n-1 ;i++){
            if(i%10!=0){
                for(int k=1;k<5000 ;k++){//
                    if( k%10!=0 && k/10%10!=0 && k/100%10!=0){
                        if(i!=k){
                            int j=(n-i)*k;
                            if(j%10!=0 && j/10%10!=0 && j/100%10!=0)
                                if(judge(i,j,k)){
                                    count++;
                                    System.out.println(i+"+"+j+"/"+k);
                                }

                        }
                    }
                }
            }
        }
        double end = System.currentTimeMillis();
        double time = end-start;
        System.out.println(count+" "+ time);
    }

    public boolean judge(int i, int j, int k) {
        StringBuffer sb = new StringBuffer(i + "" + j + "" + k);
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int c = 0; c < sb.length(); c++) {
            hs.add(sb.charAt(c) - 48);
        }
        if (hs.size() == 9 && sb.length() == 9) {
            return true;
        } else {
            return false;
        }
    }
}
