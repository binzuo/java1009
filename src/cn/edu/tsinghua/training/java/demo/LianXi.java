package cn.edu.tsinghua.training.java.demo;

/**
 * Created by Administrator on 2016/10/9 0009.
 */
public class LianXi {
    public static void main(String[] args) {
        for (int j = 1; j <10 ; j++) {
            for (int i = 2; i <10 ; i++) {
                System.out.printf("%d*%d=%2d",i,j,i*j);
            }
            System.out.println();
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        back:{
            for (int i = 0; i < 10; i++) {
                if (i==9){
                    System.out.println("break");
                    break back;
                }
                //System.out.println("test");
            }
            System.out.println("test");
        }
        back1:
        for (int i = 0; i < 10; i++) {
            back2:
            for (int j = 0; j < 10; j++) {
                if (j==9){
                    continue back1;
                }
            }
            System.out.println("test");
        }
        System.out.println("南无地藏菩萨摩诃萨");
        System.out.println(-Integer.MIN_VALUE==Integer.MIN_VALUE);
        for (int number = 0; number != 5; number=(int)(Math.random()*10)) {
            System.out.println(number);

        }
        int i=10;
        System.out.println(i);//10
        System.out.println(i++);//10
        System.out.println(++i);//12
        int[] scores={88,81,74,68,78,76,77,85,95,93};
        //for (int j = 0; j < scores.length; j++) {
        //   System.out.println(scores[j]);

        //}
        for (int score:scores){
            System.out.println(score);
        }
        String s="";
        long start = System.currentTimeMillis();
        for (int k = 0; k < 100000; k++) {
            s+="ABC";
        }
        System.out.println(System.currentTimeMillis() - start);//60661
        System.out.println(s.length());//300000
        //StringBuffer stringBuffer=new StringBuffer();
        //long start = System.currentTimeMillis();
        //for (int m = 0; m < 100000; m++) {
        //    stringBuffer.append("ABC");
        //}
        //System.out.println(System.currentTimeMillis() - start);//8
        //System.out.println(stringBuffer.length());//300000
        //System.out.println(System.currentTimeMillis()/1000/60/60/24/365);




























    }

}
