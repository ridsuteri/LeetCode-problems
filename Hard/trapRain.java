class trapRain {
    public int trap(int[] arr) {
        int n = arr.length;
        if(n == 0)
            return 0;
        int left[] = new int[n];
        
        int right[] = new int[n];
        
        left[0] = arr[0];
        for (int i = 1;i < n;i++)
            left[i] = Math.max(left[i - 1], arr[i]);
        
        right[n - 1] = arr[n - 1];
        for(int i = n - 2;i >= 0;i--)
            right[i] = Math.max(right[i + 1], arr[i]);
        
        int water = 0;
        for (int i = 1;i < n - 1;i++)
            water += Math.min(left[i], right[i]) - arr[i];
        
        return water;
    }
}
