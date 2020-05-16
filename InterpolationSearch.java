package searching;

public class InterpolationSearch {

    public int search(int[] arr,int k){

        int l = 0;
        int r = arr.length-1;

        while(r >= l && arr[r] >=k && k >= arr[l]){

            if(l == r){
                if(arr[l] == k) return l;
                return -1;
            }

            int pos = l +  ((k - arr[l]) * ((r - l) / (arr[r] - arr[l])));

            if(arr[pos] == k){
                return pos;
            }

            if(arr[pos] < k){
                l = pos+1;
            }

            if(arr[pos] > k){
                r = pos - 1;
            }
        }
        return -1;

    }
    public static void main(String[] args){
        int[] arr = new int[]{10,12,13,16,18,19,20,21,22,23,24,33,35,42,47};
        int k = 23;
        InterpolationSearch interpolationSearch = new InterpolationSearch();
        System.out.println(interpolationSearch.search(arr,k));
    }
}
