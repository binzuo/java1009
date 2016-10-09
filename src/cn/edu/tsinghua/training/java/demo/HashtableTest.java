package cn.edu.tsinghua.training.java.demo;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/9 0009.
 */
//java.util.Hashtable
public class HashtableTest {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable=new Hashtable();
        hashtable.put(1,"hello");//将指定 key 映射到此哈希表中的指定 value
        System.out.println(hashtable);//{1=hello}
        hashtable.put(200, "hello");
        System.out.println(hashtable);//{200=hello, 1=hello}
        hashtable.put(200,"test");
        System.out.println(hashtable);//{200=test, 1=hello}
        //size()返回此哈希表中的键的数量。
        System.out.println(hashtable.size());//2
        //get()返回指定键所映射到的值，如果此映射不包含此键的映射，则返回 null.
        System.out.println(hashtable.get(200));//test
        System.out.println(hashtable.get(100));//null
 /*     for (Integer integer : hashtable.keySet()) { // iter + tab
            System.out.println(integer + " > " + hashtable.get(integer));
        }
        for (String s : hashtable.values()) {
            System.out.println(s);
        }
        for (Map.Entry<Integer, String> integerStringEntry : hashtable.entrySet()) {
            System.out.println(integerStringEntry.getKey() + " > " + integerStringEntry.getValue());
        }
 */
         hashtable.clear();//将此哈希表清空，使其不包含任何键。
        System.out.println(hashtable);







    }
}
