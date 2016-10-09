package cn.edu.tsinghua.training.java.demo;

import java.util.Vector;

/**
 * Created by Administrator on 2016/10/9 0009.
 */
//java.util.Vector
public class VectorTest {
    public static void main(String[] args) {
        Vector<String> strings=new Vector<>();
        strings.add("hello");
        strings.add("hi");
        strings.add("hi");
        strings.add("test");
        System.out.println(strings);//[hello, hi, hi, test]
        System.out.println(strings.size());//4
        strings.set(3, "test new...");//set(int index, E element) 用指定的元素替换此向量中指定位置处的元素。
        System.out.println(strings);//[hello, hi, hi, test new...]
        strings.remove(3);//remove(int index)移除此向量中指定位置的元素。
        System.out.println(strings);//[hello, hi, hi]
        //size()返回此向量中的组件数
        System.out.println(strings.size());//3
        //get()返回向量中指定位置的元素。
        System.out.println(strings.get(strings.size()-3));//hello
        //clear从此向量中移除所有元素。
        strings.clear();
        System.out.println(strings);//[]
        System.out.println(strings.size());//0
















    }
}
