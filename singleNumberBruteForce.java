public class singleNumberBruteForce {
    public static void main(String[] args) {
        int num[] = {1,2,1,2,4};
        for(int i = 0 ; i < num.length;i++){
            int count = 0;
            for(int j = 0 ; j < num.length;j++){
                if(num[i] == num[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(i);
            }
        }
    }
}
