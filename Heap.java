import java.util.ArrayList;

class Heap<T extends Comparable<T>>{

    private ArrayList<T> list;

    public Heap(){
        list = new ArrayList<>();

    }
    private void swap(int index1, int index2){
        T tempVal1 = list.get(index1);
        T tempVal2 = list.get(index2);
        list.set(index2, tempVal1);
        list.set(index1, tempVal2);
    }

    private int parent(int index){
        return (index-1) / 2;
    }

    private int leftChild(int index){
        return index*2+1;
    }

    private int rightChild(int index){
        return index*2+2;
    }

    private void upHeap(int index){
        if(index==0){
            return;
        }
        int parentIndex=parent(index);
        T value = list.get(index);
        T parentValue = list.get(parentIndex);
        if(value.compareTo(parentValue) < 0){
            swap(index, parentIndex);
            upHeap(parentIndex);
        };
    }

    private void downHeap (int index){
        int min = index;
        int leftChild = leftChild(index);
        int rightChild = rightChild(index);

        if(leftChild < list.size()&& list.get(min).compareTo(list.get(leftChild))>0){
            min = leftChild;
        }
        if(rightChild < list.size()&& list.get(min).compareTo(list.get(rightChild))>0){
            min = rightChild;
        }
        if(min!=index){
            swap(min, index);
            downHeap(min);
        }
    }

    public void insert(T value){
        list.add(value);
        upHeap(list.size()-1);
    }

    public T remove() throws Exception {
        if (list.isEmpty()) {
          throw new Exception("Heap is empty");
        }
    
        T temp = list.get(0);
    
        T last = list.remove(list.size() - 1);
        if (!list.isEmpty()) {
          list.set(0, last);
          downHeap(0);
        }
        
        return temp;
    }

    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data = new ArrayList<>();
        while(!list.isEmpty()) {
          data.add(this.remove());
        }
        return data;
      }

}