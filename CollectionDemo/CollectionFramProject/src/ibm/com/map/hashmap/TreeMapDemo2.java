package ibm.com.map.hashmap;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapDemo2 {
	public static void main(String[] args){
        //Comparator����
		//Sort keys in reverse order
        TreeMap<Integer, String> pairs = new TreeMap<>(Collections.reverseOrder());//reverseOrder��Դ��
        pairs.put(2,  "B" );
        pairs.put(1,  "A");
        pairs.put(3,  "C");
        //�������
        Iterator<Integer> iterator =  pairs.keySet().iterator();
        while(iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println("Key: " + key + ", Value: " + pairs.get(key));
        }
	}
}
