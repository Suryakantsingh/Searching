package binary_search;

public class FindMissingElement {
    public void arrange(int[] arr, int l , int r) {

        if (l < r) {
            int m = (l + r) / 2;
            arrange(arr, l, m);
            arrange(arr, m + 1, r);
            arrange(arr, l, r);
        }
    }





    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,10,11,12,13,14,15};
        int l = 0;
        int r = arr.length-1;
        FindMissingElement findMissingElement = new FindMissingElement();
        findMissingElement.arrange(arr,l,r);

    }
}
