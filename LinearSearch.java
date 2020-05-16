package searching;

public class LinearSearch {

    public int search(int[] arr,int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args){
        int[] arr = new int[]{10,50,30,70,80,60,20,90,70};
        int k = 20;
        LinearSearch linearSearch = new LinearSearch();
        System.out.println(linearSearch.search(arr,k));
    }
}
