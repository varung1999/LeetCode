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
        map = new HashMap<>();
        
        if(employees == null || employees.size() == 0) return 0;
        
        for(Employee e: employees)
        {
            map.put(e.id,e);
        }
        
        Queue<Integer> q = new LinkedList<>();
        q.add(id);
        int total = 0;
        while(!q.isEmpty())
        {
            int curr = q.poll();
            Employee emp = map.get(curr);
            total+=emp.importance;
            
            for(int jr: emp.subordinates)
            {
                q.add(jr);
            }
        }
        
        return total;
    }
}