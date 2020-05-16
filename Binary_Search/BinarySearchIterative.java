package searching;

public class BinarySearchIterative {

    public int search(int[] arr, int k){
        int l = 0;
        int r = arr.length-1;
        while(r>=l){
            int m = (l+r)/2;

            if(arr[m] == k){
                return m;
            }

            if(arr[m]<k){
                l = m+1;
            }else{
                r = m-1;
            }
        }
        return -1;

    }
    public static void main(String[] args){
        int[] arr = new int[]{2,5,8,12,16,23,38,56,72,91};
        int k = 23;
        BinarySearchIterative bs = new BinarySearchIterative();
        System.out.println(bs.search(arr, k));
    }
}
