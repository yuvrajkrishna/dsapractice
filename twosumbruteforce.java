public class twosumbruteforce{
    public static void main (String args[]){
        int target = 7;
        int arr [] = {2,4,5,9};
        for(int i = 0 ; i < arr.length ; i++){
           for(int j = i+1; j < arr.length; j++){
                if(arr[i]+arr[j] == target){
                    System.out.print(i);
                    System.out.print(j);
                }
           }
        }
    }
}cc