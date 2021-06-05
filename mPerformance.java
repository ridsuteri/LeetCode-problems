class mPerformance{
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int[][] engineers = new int[n][];
        for (int i = 0; i < n; i++) {
            engineers[i] = new int[]{efficiency[i], speed[i]};
        }
        Arrays.sort(engineers, (int[] a, int[] b) -> (b[0] - a[0]));
        
        Queue<Integer> pq = new PriorityQueue<>();
        long sum = 0, res = 0;
        for (int[] engineer : engineers) {
            pq.offer(engineer[1]);
            sum += engineer[1];
            if (pq.size() > k) {
                sum -= pq.poll();
            }
            res = Math.max(res, sum * engineer[0]);
        }
        
        return (int) (res % (long) (1e9 + 7));
    }
}
