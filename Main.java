import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        //Part 1 - Creating a list of random numbers
        Complexity genComp = new Complexity();
        int[] randomList = genComp.createRandomList(10);
        

        Heap<Integer> heap = new Heap<>();
        heap.insert(34);
        heap.insert(45);
        heap.insert(22);
        heap.insert(89);
        heap.insert(76);
        ArrayList list = heap.heapSort();
        System.out.println(list);
    
        genComp.printArray(randomList);
        
        //Part 2 - Creating arrays
        genComp.printArray(genComp.generateAscendingList(10));
        genComp.printArray(genComp.generateDecendingList(10));
        genComp.printArray(genComp.generateRepeatList(10));

        // //Part 3 - Sort Methods
        // //Insert sort
        // Complexity.insertionSortImperative(randomList);
        // //Merge sort
        // Complexity.mergeSort(randomList,randomList.length);
        // //Quick sort
        // Complexity.quickSort(randomList, 0, 0);
        // genComp.printArray(randomList);

        // //Part 4 - Timing Analysis

        // //insert sort random
        // System.out.println("insert");
        // for(int i = 0; i <= 10000; i = i+500){
        //     Complexity.insertsorttime(genComp.createRandomList(i));  
        // }
        // //merge sort random
        // System.out.println("merge");
        // for(int i = 0; i <= 10000; i = i+500){
        //     Complexity.mergesorttime(genComp.createRandomList(i));
        // }
        // //quick sort random
        // System.out.println("quick");
        // for(int i = 0; i <= 10000; i = i+500){
        //     Complexity.quicksorttime(genComp.createRandomList(i));
        // }

        // //insert sort ascending
        // System.out.println("insert");
        // for(int i = 0; i <= 10000; i = i+500){
        //     Complexity.insertsorttime(genComp.generateAscendingList(i));  
        // }
        // //merge sort ascending
        // System.out.println("merge");
        // for(int i = 0; i <= 10000; i = i+500){
        //     Complexity.mergesorttime(genComp.generateAscendingList(i));
        // }
        // //quick sort ascending
        // System.out.println("quick");
        // for(int i = 0; i <= 10000; i = i+500){
        //     Complexity.quicksorttime(genComp.generateAscendingList(i));
        // }

        // //insert sort decending
        // System.out.println("insert");
        // for(int i = 0; i <= 10000; i = i+500){
        //     Complexity.insertsorttime(genComp.generateDecendingList(i));  
        // }
        // //merge sort decending
        // System.out.println("merge");
        // for(int i = 0; i <= 10000; i = i+500){
        //     Complexity.mergesorttime(genComp.generateDecendingList(i));
        // }
        // //quick sort decending
        // System.out.println("quick");
        // for(int i = 0; i <= 10000; i = i+500){
        //     Complexity.quicksorttime(genComp.generateDecendingList(i));
        // }

     }
    
    
}

