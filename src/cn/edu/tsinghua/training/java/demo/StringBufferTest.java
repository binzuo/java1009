package cn.edu.tsinghua.training.java.demo;

/**
 * Created by Administrator on 2016/10/9 0009.
 */
//java.lang.StringBuffer
public class StringBufferTest {
    public static void main(String[] args) {
        //String s="";
        //long start = System.currentTimeMillis();
        //for (int k = 0; k < 100000; k++) {
        //    s+="ABC";
        //}
        //System.out.println(System.currentTimeMillis() - start);//60661
        //System.out.println(s.length());//300000
        StringBuffer stringBuffer=new StringBuffer();
        long start = System.currentTimeMillis();
        for (int m = 0; m < 100000; m++) {
            stringBuffer.append("ABC");
        }
        System.out.println(System.currentTimeMillis() - start);//8
        System.out.println(stringBuffer.length());//300000
        //System.out.println(System.currentTimeMillis()/1000/60/60/24/365);

    }
}
