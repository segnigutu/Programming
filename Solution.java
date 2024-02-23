class Solution {
    public int minOperations(String s) {
         int a = s.length();
      
        int sum = 0;
        int count = 0;
        for (int i =0; i< a;i++){
            if (i%2==0){
                if (s.charAt(i)=='0'){
                    sum += 1;
                }
            }
            else{
                if (s.charAt(i)=='1'){
                    sum += 1;
                }
            }
        }
        for (int i =0; i< a;i++){
            if (i%2==0){
                if (s.charAt(i)=='1'){
                    count += 1;
                }
            }
            else{
                if (s.charAt(i)=='0'){
                    count += 1;
                }
            }
        }
        if (sum < count){
            return sum;
        }
        return count;
        
    }
}