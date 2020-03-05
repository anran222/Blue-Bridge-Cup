package brigebluecup;

/**
 * @Author:xiang
 * @Date:2020/3/5 23:06
 * Queries on Young Machine - Sample
 */
public class QueriesOnYoungMachineSample {
    public static void main(String[] args) {
        Test t1=new Test("1","100","600000","1500","7000000");
        Test t2=new Test("2","800","600000","1500","7000000");
        Test t3=new Test("编号","N","MaxLen","MaxStep","MaxOp");
        System.out.println(t3.biaHao+" "+t3.N+" "+t3.maxLen+" "+t3.maxStep+" "+t3.maxOp);
        System.out.println(t1.biaHao+" "+t1.N+" "+t1.maxLen+" "+t1.maxStep+" "+t1.maxOp);
        System.out.println(t2.biaHao+" "+t2.N+" "+t2.maxLen+" "+t2.maxStep+" "+t2.maxOp);
    }
   static class Test{
        String biaHao;
        String N;
        String maxLen;
        String maxStep;
        String maxOp;

        public Test() {
        }

        public Test(String biaHao, String n, String maxLen, String maxStep, String maxOp) {
            this.biaHao = biaHao;
            N = n;
            this.maxLen = maxLen;
            this.maxStep = maxStep;
            this.maxOp = maxOp;
        }
    }
}