public class A_47 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for(int i = 0; i <nums.length; i++){
            if(nums[i] == 1){
                count++;
                System.out.println("Count At " + i +" : "+ count);

                if(maxCount < count){
                    maxCount = count;

                    System.out.println("Max Count At " + i +" : "+ maxCount);
                }
            }
            else{

                System.out.println("Hi");
                count = 0;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        
        int[] a = {1,0,1,1,0,1};

        int ans = findMaxConsecutiveOnes(a);

        System.out.println(ans);
    }
}