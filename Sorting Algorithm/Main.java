
// Sorting Algorithms
public class Main{
    private static void swap(int a[],int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void bubbleSort(int a[]) {
        for (int i = 0; i <  a.length - 1;i++) {
            boolean swapped = false;
            for(int j = 0;j < a.length - 1 - i;j++){
                if(a[j] > a[j+1]){
                    swap(a, j, j+1);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;  // position
            for(int j = i + 1;j < arr.length;j++){
                if(arr[j] < arr[min]){  // finding the smallest number
                    min = j;       
                }
            }
            if(min != i){     // putting smallest element at front of an array
                swap(arr, i, min);
            }
        }
    }
    public static void insertionSort(int a[]){
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j = i-1;
            while(j > -1 && a[j] > temp){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }
    }
    public static int partition(int a[],int l, int r){
        int pivot = a[l];
        int i = l;
        int j = r;
        while(i < j){
            while(a[i] <= pivot) i++; // finding larger element position
            while(a[j] > pivot) j--;  // finding smaller element position

            if(i < j){
                swap(a, i, j);
            }
        }
        swap(a, j, l);
        return j;
    }
    public static void quickSort1(int a[],int l,int r){
        if(l < r){
            int pivot = partition(a,l,r);

            quickSort1(a, l, pivot - 1);
            quickSort1(a, pivot + 1, r);
        }
    }
    public static void quickSort(int a[]){
        quickSort1(a,0,a.length - 1);
    }

    // Merge Sort
    public static void merge(int a[],int l,int mid, int r){
        int i = l;
        int j = mid + 1;
        int k = 0;
        int b[] = new int[r-l+1];

        while(i <= mid && j <= r){
            if(a[i] <= a[j]){
                b[k++] = a[i++];
            }
            else{
                b[k++] = a[j++];
            }
        }
        
        while(i <= mid){
            b[k++] = a[i++];
        }
        while(j <= r){
            b[k++] = a[j++];
        }
        for(int t = l,x = 0;x < k;t++,x++){
            a[t] = b[x];
        }

    }
    public static void mergeSort1(int a[],int l, int r){
        if(l < r){
            // int mid =l+ (r-l)/2;
            int mid = l + (r - l)/2;
            mergeSort1(a, l, mid);
            mergeSort1(a, mid + 1, r);

            merge(a, l, mid, r);
        }
    }
    public static void mergeSort(int a[]){
        mergeSort1(a, 0, a.length - 1);
    }

    public static void fun(int a, int b){
        System.out.println(a+b);
    }


    public static void main(String[] args) {
        int arr[] = {1,8,2,5,9,7};
        // selectionSort(arr);
        // bubbleSort(arr);
        // insertionSort(arr);
        // quickSort(arr);
        mergeSort(arr); 
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}