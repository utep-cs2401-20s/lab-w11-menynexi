class NewSorting{

    public static void newSorting(int[] A, int size){
        //size tells you what you are sorting and can be a random number
        if(A.length <= size){
            toQuicksort(A);
        }
        else{
            int mid = A.length/2;
            int[] LH = new int[mid];//always mid size
            int[] RH = new int[A.length - mid];

            //populate LH,RH with loop populate with LH and RH

            //recursivebly call
            newSorting(LH,size);
            newSorting(RH, size);

            //merge them both write both methods
            mergeSortedHalfes(A,LH,RH);
        }
    }
    public static void mergeSortedHalfes(int[] A, int[] LH, int[] RH){
        //where LH and RH is copied to A
    }

    public static void toQuicksort(int[] A){
        //this is going to quick sort everything
    }

}