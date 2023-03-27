class Logger {
    
    HashMap<String,Integer> map;
    public Logger() {
        map = new HashMap<>();        
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(map.containsKey(message))
        {
            int nextTime = map.get(message);
            
            if(timestamp>=nextTime)
            {
                map.put(message,timestamp+10);
                return true;
            }
            else return false;
        }
        else{
            map.put(message,timestamp+10);
            return true;
        }
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */