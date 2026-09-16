
import java.util.ArrayList;
import java.util.List;

public class TwoDarr_rowsum {
    public List<Integer> rowSum(int[][] arr) {
        // Implmentation logic
        List<Integer> result = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;
        // traversal
        for (int row = 0; row < m; row++) {
            // jaise hi mai kisis nayi row me aayunga
            // waise hi main sum=0 kr dunga
            int sum = 0;
            for (int col = 0; col < n; col++) {
                int value = arr[row][col];
                sum = sum + value;
            }
            // jab mai sare column ki values travel and add
            // kr chuka hounga , tb mere pass sum ble variable me
            // entire row ka sum rady hoga
            result.add(sum);
        }
        return result;
    }

    public static void main(String[] args) {

        TwoDarr_rowsum obj = new TwoDarr_rowsum();

        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        List<Integer> result = obj.rowSum(arr);

        System.out.println(result);
    }
}