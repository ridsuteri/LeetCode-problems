class spiralMatrix {
    public List<Integer> spiralOrder(int[][] arr) {
        int minr = 0;
        int maxr = arr.length - 1;

        int minc = 0;
        int maxc = arr[0].length - 1;

        int count = 1;
        int totalElements = arr.length * arr[0].length;

        List <Integer> res = new ArrayList <> ();

        while(count <= totalElements){

            //Right Wall, upwards
            for(int j=minc; j<=maxc &&  count <= totalElements; ++j){
                res.add(arr[minr][j]);
                count++;
            }

            minr++;


            //Down Wall, rightwards
            for(int j=minr; j<=maxr  &&  count <= totalElements; ++j){
                res.add(arr[j][maxc]);
                count++;
            }

            maxc--;


            //Left Wall, downwards
            for(int j=maxc; j>=minc  &&  count <= totalElements; --j){
                res.add(arr[maxr][j]);
                count++;
            }

            maxr--;


            //Up Wall, leftwards
            for(int j=maxr; j>=minr &&  count <= totalElements; --j){
                res.add(arr[j][minc]);
                count++;
            }

            minc++;    

        }

        return res;
    }
}
