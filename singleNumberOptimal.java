public class singleNumberOptimal {
    public static void main(String[] args) {
        int num[] = {1,2,1,2,4};
        int ans = 0 ;
        for(int i = 0 ; i < num.length ; i++){
            ans ^= num[i];
        }
        System.out.print(ans);
    }
}
