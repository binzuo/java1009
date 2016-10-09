package cn.edu.tsinghua.training.java.demo;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Administrator on 2016/10/9 0009.
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] ints = new int[10];
        Arrays.fill(ints,1,3,-999);//fill(int[] a, int fromIndex, int toIndex, int val)将指定的 int 值分配给指定 int 型数组指定范围中的每个元素。
        for (int anInt : ints) {
            System.out.println(anInt);
        }//0 -999 -999 0 0 0 0 0 0 0
        int[] newInts=Arrays.copyOf(ints,3);//copyOf(int[] original, int newLength)复制指定的数组，截取或用 0 填充（如有必要），以使副本具有指定的长度。
        for (int newInt : newInts) {
            System.out.println(newInt);
        }//0,-999,-999
        int[] ints1={5,4,6,8,1,9,0,3,2,7};
        Arrays.sort(ints1);//sort(int[] a)对指定的 int 型数组按数字升序进行排序。
        for (int i : ints1) {
            System.out.println(i);
        }//0 1 2 3 4 5 6 7 8 9
        String[] strings = {"hello", "test...", "hi", "apple","zuo","bin"};
        Arrays.sort(strings);
        for (String string : strings) {
            System.out.println(string);
        }//apple
         //bin
         //hello
         //hi
         //test...
         //zuo
        System.out.println(Arrays.toString(strings));//toString(String[] a)返回指定数组内容的字符串表示形式。
        System.out.println(Arrays.toString(ints1));////toString(int[] a)返回指定数组内容的字符串表示形式。























    }
}