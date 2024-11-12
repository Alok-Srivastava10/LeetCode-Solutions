/*

Problem URL = https://leetcode.com/problems/keys-and-rooms/

class Solution {
    
    public void dfs(List<List<Integer>> rooms, int currRoom, boolean visited[]){
         
        List<Integer> keys = rooms.get(currRoom);
        
        //Marking the Cuurent Room Visited
        visited[currRoom] = true;
        
        //If room doesn't contains any key
        if(keys.size() == 0)
           return;

        for(int idx = 0; idx < keys.size(); idx++)
            if(visited[keys.get(idx)] == false)
                dfs(rooms, keys.get(idx), visited);
              
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        boolean visited[] = new boolean[rooms.size()];

        dfs(rooms, 0, visited);
        
        //Checking for Unvisited Nodes
        for(boolean val: visited)
            if(val == false)
                return false;

        return true;

    }
}


*/