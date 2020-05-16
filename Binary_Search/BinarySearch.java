package searching;

public class BinarySearch {
    public int search(int[] arr,int l, int r, int k) {
        if (r >= l)
        {
            int m = l+(r-l)/2;
            if(arr[m] == k){
               return m;
            }

            if(arr[m] > k){
                r = m-1;
               return search(arr,l,r,k);
            }else{
                l = m+1;
               return search(arr,l,r,k);
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = new int[]{2,5,8,12,16,23,38,56,72,91};
        int k = 23;
        int l = 0;
        int r = arr.length-1;
        BinarySearch bs = new BinarySearch();
        System.out.println(k+" is available at index : "+bs.search(arr,l,r,k));
    }
}
