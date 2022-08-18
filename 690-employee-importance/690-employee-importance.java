/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    HashMap<Integer,Employee> map;
    public int getImportance(List<Employee> employees, int id) {
        if(employees == null || employees.size() == 0) return 0;
        map = new HashMap<>();
        
        for(Employee e: employees)
        {
            map.put(e.id,e);
        }
        
        int total=0;
        Queue<Integer> q = new LinkedList<>();
        q.add(id);
        
        while(!q.isEmpty())
        {
            int curr = q.poll();
            Employee temp = map.get(curr);
            total+=temp.importance;
            
            for(int juniors: temp.subordinates)
            {
                q.add(juniors);
            }
        }
        
        return total;
    }
}