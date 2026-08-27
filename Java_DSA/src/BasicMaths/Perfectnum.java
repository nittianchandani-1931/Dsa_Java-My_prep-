package BasicMaths;

public class Perfectnum {
    static boolean checkPerfectNumber(int num){
            int sum=1;
            for(int i=2; i*i <= num; i++){
if(num % i == 0){
    // i ne num ko perfectly divide kr dia h
    //  toh ab factor pair ky banega
    // 1st factor -> i
    int firstFactor = i;
    int secondFactor = num/i;
    sum =sum +firstFactor +secondFactor;
            }
        }
        if(sum==num)

    {
        return true;
    }else
    {
        return false;
    }
}
static void main(){
    System.out.println(checkPerfectNumber(6));
}
}