class medianSorted {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        
//         to get bigger array as b
        if(a.length > b.length){
            int[] temp = a;
            a = b;
            b = temp;
            
            // for(int i : a)
            //     System.out.print(i);
        }
        
        int lo = 0;
        int hi = a.length;
        int te = a.length + b.length;
        
        while(lo <= hi){
            int aleft = (lo + hi)/2;
            int bleft = (te + 1)/2 - aleft;
            
            int alm1 = (aleft == 0) ? Integer.MIN_VALUE : a[aleft - 1];
            int al = (aleft == a.length) ? Integer.MAX_VALUE : a[aleft];
            
            int blm1 = (bleft == 0) ? Integer.MIN_VALUE : b[bleft - 1];
            int bl = (bleft == b.length) ? Integer.MAX_VALUE : b[bleft];
            
//             check if the segregation is correct
            if(alm1 <= bl && blm1 <= al){
                
//                 if total elements are odd
                if(te % 2 == 0){
                    int maxL = Math.max(alm1, blm1);
                    int minR = Math.min(al, bl);
                    
                    return (maxL + minR) / 2.0;
                }
                
//                 if total elements are even
                else{
                    int maxL = Math.max(alm1, blm1);
                    return maxL;
                }
            }
            
//             if seg is not correct and needed to left shift
            else if(alm1 > bl){
                hi = aleft - 1;
            }
            
//             if seg is not correct and needed to right shift
            else if(blm1 > al){
                lo = aleft + 1;
            }
        }
        return 0.0;
    }
}
