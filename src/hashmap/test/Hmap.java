/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap.test;

import java.util.HashMap;

/**
 *
 * @author JesperJørgensen
 */
public class Hmap {

    protected static HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

    void put(int a, int b) {
        hmap.put(a, b);
    }

    int get(int a) {
        int b;
        return hmap.get(a);
    }

    int size() {
        return hmap.size();
    }
    
    void print(){
        for (int i = 0; i < hmap.size(); i++){
            if (hmap.get(i)!= null){
                System.out.println(hmap.get(i));
            }
        }
    }
    
    boolean search(int key){
        boolean status = hmap.containsValue(key);
        return status;
        
    }
    

}
