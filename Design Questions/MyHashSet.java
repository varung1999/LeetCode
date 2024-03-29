import java.util.*;
class MyHashSet {

    public static ArrayList<Integer> numbers;
    public MyHashSet() {
        
        numbers = new ArrayList<>();
    }
    
    public void add(int key) {
        
        if(!numbers.contains(key))
        {
            numbers.add(key);
        }
    }
    
    public void remove(int key) {
        
        if(numbers.contains(key)){
        numbers.remove(new Integer(key));
    }
    }
    
    public boolean contains(int key) {
        
        return numbers.contains(key)==true;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
