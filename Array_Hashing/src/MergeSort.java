public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 7};
        mergeSort(arr,0,arr.length-1);
        for(int s : arr){
            System.out.print(s+" ");
        }
    }
    public static void mergeSort(int[] arr,int lb,int ub){
        if(lb<ub){
            int mid=(lb+ub)/2;
            mergeSort(arr,lb,mid);
            mergeSort(arr,mid+1,ub);
            merge(arr,lb,mid,ub);
        }
    }
    public static void merge(int[] arr,int lb,int mid,int ub){
        int[] temp = new int[ub-lb+1];
        int i = lb;
        int j= mid+1;
        int k = 0;
        while( i <= mid && j<=ub){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j <= ub){
            temp[k]=arr[j];
            j++;
            k++;
        }
        //Copy Sorted element to the arr Array.
        for(int p=0;p<temp.length;p++){
            arr[lb+p]=temp[p];
        }
    }
}
