import java.util.Scanner;
public class AlternateTraversal {
        static Scanner sc = new Scanner(System.in);
        /* 
        public static int[][] arrInput(int m, int n){
                int[][] arr = new int[m][n];
                for(int i=0; i<m; i++){
                        for(int j=0; j<n; j++){
                                arr[i][j] = sc.nextInt();
                        }
                }
                return arr;
        }

        public static int[] newArray(int[][]arr){
                int[] ans = new int[arr.length*arr[0].length];
                int k = 0;
                for(int i=0; i<arr.length; i++){
                        if(i%2 == 0){
                                for(int j=0; j<arr[0].length; j++){
                                        ans[k++] = arr[i][j];
                                }
                        }
                        else{
                                for(int j = arr[i].length - 1; j >= 0; j--) {
                                        ans[k++] = arr[i][j];
                                }
                        }
                }
                return ans;                        
        }

        public static void arrOutput(int[] arr){
                for(int i = 0; i<arr.length; i++){
                        System.out.print(arr[i]);
                        if(i != (arr.length-1)){
                                System.out.print(" ");
                        }
                }
        }
        */
        public static void alternate(int m, int n){
                int k = 0;
                int[] ans = new int[m*n];
                for(int i=0; i<m; i++){
                        if(i%2==0){
                                for(int j=0; j<n; j++){
                                        ans[k++] = sc.nextInt();
                                }
                        }
                        else{
                                int[] temp = new int[n];
                                for(int j=0; j<n; j++){
                                        temp[j] = sc.nextInt();
                                }
                                for(int j=n-1; j>=0; j--){
                                        ans[k++] = temp[j];
                                }
                        }
                }
                for(int i=0; i<ans.length; i++){
                        System.out.print(ans[i]);
                        if(i != ans.length-1){
                                System.out.print(" ");
                        }
                }
        }
        // TODO: Read the matrix
        // TODO: Traverse the matrix:
        //       - If row index is even (0, 2...): Print Left -> Right
        //       - If row index is odd (1, 3...): Print Right -> Left
        public static void main(String[] args) {
                int m = sc.nextInt();
                int n = sc.nextInt();
                // int[][] arr = arrInput(m, n);
                // int[] ans = newArray(arr);
                // arrOutput(ans);
                alternate(m, n);
        }
}