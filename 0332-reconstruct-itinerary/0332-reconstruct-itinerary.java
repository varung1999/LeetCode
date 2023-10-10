class Solution {
    Map<String, PriorityQueue<String>> map;
    public List<String> findItinerary(List<List<String>> tickets) {
        List<String> result = new ArrayList<>();
        if(tickets == null || tickets.size() == 0) return result;
        
        map = new HashMap<>();
        
        for(List<String> ticket: tickets)
        {
            map.putIfAbsent(ticket.get(0), new PriorityQueue<>());
            map.get(ticket.get(0)).add(ticket.get(1));
        }
        
        //System.out.println(map);
        
        dfs("JFK",result);
        return result;
    }
    
    private void dfs(String airport, List<String> result)
    {
        PriorityQueue<String> nextAirports = map.get(airport);
        
        while(nextAirports!=null && !nextAirports.isEmpty())
        {
            dfs(nextAirports.poll(),result);
        }
        
        result.add(0,airport);
    }
}