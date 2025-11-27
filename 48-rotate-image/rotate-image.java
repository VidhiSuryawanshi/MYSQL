// class Solution {
//     public void rotate(int[][] matrix) {
//         int n = matrix.length;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[j][i];
//                 matrix[j][i] = temp;
//             }
//         }
//         for(int i=0;i<n;i++){
//             reverse(matrix[i]);
//         }
//     }

//     void reverse(int[]arr ){
//         int start=0;
//         int end=arr.length-1;
//         while(start<end){
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//     }
// }

class Solution {
    public void rotate(int[][] mat) {
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            reverse(mat[i]);
        }
        
    }
    
    void reverse(int arr[]){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
}

