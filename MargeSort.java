 

class MargeSort {
    public static void margeSort(int arr[],int si,int ei) {
        //base case
        if(si>=ei){
            return;
        }
        //kaam
        int mid=(si+ei)/2;
        margeSort(arr, si, mid);
        margeSort(arr, mid+1, ei);
        //call
        
        marge(arr,si,mid,ei);
    }
    public static void marge(int arr[],int si,int mid,int ei) {
        int temp[]=new int[ei-si+1];
        int i=si; // left part 
        int j=mid+1; // right part
        int k=0;

        while (i<=mid && j<=ei) {
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
                
            }
        }
        // left part 
        while (i<=mid) {
            temp[k++]=arr[i++];
            
        }
        while (j<=ei) {
            
            temp[k++]=arr[j++];
        }

        // copy 
        for(i=si,k=0;k<temp.length;i++,k++){
            arr[i]=temp[k];
        }

    }
    public static void main(String[] args) {
      int num[]={6,3,2,1,5,4,-3};
      margeSort(num, 0, num.length-1);

      for (int i = 0; i < num.length; i++) {
        System.out.println(num[i]);
      }
    }    
}
