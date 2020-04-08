class NewSorting{

    public static void newSorting(int[] A, int size){
        if(size <= 0){
            size = 1;
        }
        //size tells you what you are sorting and can be a random number
        if(A.length <= size){
            toQuicksort(A, 0, A.length - 1);
        }
        else{

            int mid = A.length/2;
            int[] LH = new int[mid];//always mid size
            int[] RH = new int[mid];

            //try forcefully populating them
            for(int i = 0; i < LH.length; i++) {
                LH[i] = A[i];
            }

            for(int i = 0; i < RH.length; i++) {
                RH[i] = A[mid++];
            }


            newSorting(LH, size);
            newSorting(RH, size);

            mergeSortedHalves(A,LH,RH);
        }
    }

    public static void mergeSortedHalves(int[] A, int[] LH, int[] RH){
        int lh = 0;
        int rh = 0;

        for(int i = 0; i < A.length; i++){
            if(lh < LH.length && rh < RH.length){
                if(LH[lh] <= RH[rh]){
                    A[i] = LH[lh];
                    lh++;
                }
                else{
                    A[i] = RH[rh];
                    rh++;
                }
            }
            else if(lh < LH.length){
                A[i] = LH[lh];
                lh++;
            }
            else if (rh < RH.length){
                A[i] = RH[rh];
                rh++;
            }
        }

    }

    public static void toQuicksort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partitionOfQuicksort(arr, begin, end);

            toQuicksort(arr, begin, partitionIndex-1);
            toQuicksort(arr, partitionIndex+1, end);
        }
    }
    
    public static int partitionOfQuicksort(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }

}