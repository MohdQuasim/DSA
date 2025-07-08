public class SecondLargest{
  public static int secondLargest(int arr[]){
    int largest=Integer.MIN_VALUE;
    int scndLargest=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
      if(arr[i]>largest){
        scndLargest=largest;
        largest=arr[i];
      }
      else if(arr[i]>scndLargest&&arr[i]!=largest){
        scndLargest=arr[i];
      }
    }
  return scndLargest;
  }
  public static void main(String args[]){
    int arr[]={1,2,3,4,5,67,5,8,9,10};
    System.out.println("Second largest element of array is: "+secondLargest(arr));
  }
}
