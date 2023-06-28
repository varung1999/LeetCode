import java.util.*;

class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        List<List<Pair>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            double p = succProb[i];
            graph.get(u).add(new Pair(v, p));
            graph.get(v).add(new Pair(u, p));
        }
        
        double[] prob = new double[n];
        prob[start] = 1.0;
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Double.compare(b.probability, a.probability));
        pq.offer(new Pair(start, 1.0));
        
        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int node = curr.node;
            double curProb = curr.probability;
            
            if (node == end) {
                return curProb;
            }
            
            if (curProb < prob[node]) {
                continue;
            }
            
            for (Pair neighbor : graph.get(node)) {
                int nextNode = neighbor.node;
                double edgeProb = neighbor.probability;
                double newProb = curProb * edgeProb;
                
                if (newProb > prob[nextNode]) {
                    prob[nextNode] = newProb;
                    pq.offer(new Pair(nextNode, newProb));
                }
            }
        }
        
        return 0.0;
    }
    
    private static class Pair {
        int node;
        double probability;
        
        public Pair(int node, double probability) {
            this.node = node;
            this.probability = probability;
        }
    }
}
