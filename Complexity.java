import java.util.Random;

public class Complexity {
    
    //Part 1 Method for creating a list of random numbers
    public int[] createRandomList(int size) {
        Random random = new Random();
        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            list[i] = random.nextInt();
        }
        return list;
    }
    
    //Method to print the Array
    public void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    //Part 2 - Method for creating arrays
    //Ascending    
    public int[] generateAscendingList(int size){
        
        int[] upList = new int[size];
        Random random = new Random();
        int randomInt = random.nextInt(0,10);
        for(int i = 0; i < size; i++){
            upList[i] = randomInt++ ;
        }
        return upList; 
    }
    
    //Decending
    public int[] generateDecendingList(int size){
        int[] downList = new int[size];
        Random random = new Random();
        int randomInt = random.nextInt(0,10);
        for(int i = 0; i < size; i++){
            downList[i] = randomInt--;
        }
        return downList;  
    }
    
    //Repeat
    public int[] generateRepeatList(int size){
        
        int[] List = new int[size];
        Random random = new Random();
        int randomInt = random.nextInt(0,10);
        for(int i = 0; i < size; i++){
            List[i] = randomInt;
        }
        return List;
        
    }
    
    //Part 3 - Sort Methods code obtained from Baeldung.com
    //Insertsort
    public static void insertionSortImperative(int[] input) {
        for (int i = 1; i < input.length; i++) { 
            int key = input[i]; 
            int j = i - 1;
            while (j >= 0 && input[j] > key) {
                input[j + 1] = input[j];
                j = j - 1;
            }
            input[j + 1] = key; 
        }

    }
    
    //Mergesort
    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        
        merge(a, l, r, mid, n - mid);
    }
    
    public static void merge(int[] a, int[] l, int[] r, int left, int right) {
        
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
    
    //Quicksort
    public static void quickSort(int arr[], int begin, int end)
    {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
            
            // Recursively sort elements of the 2 sub-arrays
            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }
    
    private static int partition(int arr[], int begin, int end)
    {
        int pivot = arr[end];
        int i = (begin-1);
        
        for (int j=begin; j<end; j++)
        {
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

    //Part 4 - Timing Analysis
    public static void insertsorttime(int arr[]){
        long startTime = System.nanoTime();  //Current System Time at start
        insertionSortImperative(arr);
        long endTime = System.nanoTime(); //Current system Time at end
        long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        System.out.println(duration);
    }

    public static void mergesorttime(int arr[]){
        long startTime = System.nanoTime();  //Current System Time at start
        mergeSort(arr,arr.length);
        long endTime = System.nanoTime(); //Current system Time at end
        long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        System.out.println(duration);
    }

    public static void quicksorttime(int arr[]){
        long startTime = System.nanoTime();  //Current System Time at start
        quickSort(arr,0,0);
        long endTime = System.nanoTime(); //Current system Time at end
        long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        System.out.println(duration);
    }
    
    
    
    
}


