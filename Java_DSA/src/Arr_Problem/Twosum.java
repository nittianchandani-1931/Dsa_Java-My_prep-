package Arr_Problem;

public class Twosum {
    public int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        for(int i=0;i<n-1; i++){
            for(int j=i+1; j<n;j++){
                if(nums[i]+ nums[j]== target){
                    int ans[]={i,j};
                    return ans;
                }
            }
        }
        int ans[]={};
        return ans;
    }
     public static void main(String[] args) {

        Twosum s = new Twosum();

        int nums[] = {2, 7, 11, 15};
        int target = 9;

        int[] result = s.twoSum(nums, target);

        System.out.println(result[0] + " " + result[1]);
}

}