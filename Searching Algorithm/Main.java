 
 
 // Searching Algorithms
 
public class Main{
    public static int linearSearch(int arr[],int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key)
                return i;
        }
        return -1;
    }
    public static int binarySearch(int arr[],int l,int r,int key){ // recursive
        if(l < r){
            int mid = (l + r)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] > key){
                return binarySearch(arr, l, mid - 1, key);
            }
            return binarySearch(arr, mid + 1, r, key);
        }
        return -1;
    }
    public static int binarySearch(int arr[],int target){ // non recursive
        int l = 0;  // best for time and space complexity
        int r = arr.length;
        while(l <= r){
            int mid = l + (r - l)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] > target){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(linearSearch(arr, 8));
        System.out.println(binarySearch(arr,8));
    }
}