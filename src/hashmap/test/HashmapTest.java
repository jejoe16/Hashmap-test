/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap.test;

/**
 *
 * @author JesperJørgensen
 */
public class HashmapTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hmap map = new Hmap();
        map.put(0, 0);
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        Hmapextend mape = new Hmapextend();
        mape.remove(3);
        
        // search for value
        boolean status = map.search(2);
        if (status == true)
            System.out.println("yes the value exist");
        else 
            System.out.println("no we cant find it");
        
        map.print();
    }

}
