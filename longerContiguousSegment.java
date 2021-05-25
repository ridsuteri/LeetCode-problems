class longerContiguousSegment {
    public boolean checkZeroOnes(String s) {
        
        int n = s.length();
        int ocount = 0, maxo = -1;
        int zcount = 0, maxz = -1;
        
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '1'){
                ocount++;
                zcount = 0;
            }
            
            else{
                zcount++;
                ocount = 0;
            }
            
            
            if(zcount > maxz)
                maxz = zcount;
            
            if(ocount > maxo)
                maxo = ocount;
        }
        
        if(maxo > maxz)
            return true;
        else
            return false;
    }
}
