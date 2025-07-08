public class Solution{
  public static int Largest(int arr[]){
    int largest=arr[0];
    for(int i=1;i<arr.length;i++){
      if(arr[i]>largest){
      largest=arr[i];
      }
    }
  return largest;
  }
  public static void main(String args[]){
    int arr[]={1,2,3,4,5,4,6,3,7,10};
    System.out.println("Largest element of an array is: "+Largest(arr));
  }
}
