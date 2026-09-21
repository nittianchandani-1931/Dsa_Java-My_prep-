class Bs {
    public int search(int[] nums, int target) {
    int start=0;
    int n = nums.length;
    int end= n-1;
    int mid= (start+end)/2;
    while(start <= end){
        // compare target  with mid value
    if(nums[mid] == target){
    // target found
    return mid;
    }
     else if(target> nums[mid]){
    // go to right side
    start = mid + 1;
     }
    else{
        // target < nums[mid]
        // go to left
        end = mid-1;
    }
    //  update mid
         mid= (start+end)/2;


    }
// agar aap yha tk aagye h mtlb target  not found

        return -1;
    }
    public static void main(String[] args) {

        Bs obj = new Bs();

        int[] nums = {10, 20, 30, 40, 50, 60, 70};

        int target = 50;

        int result = obj.search(nums, target);

        System.out.println("Index = " + result);
}}