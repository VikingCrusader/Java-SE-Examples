public class array {
    public static void main(String[] args) {
        System.out.println("declare a one demension array");
        int number [] = {1,2,3,4,5,6};
        System.out.println(number[0]);
        int matrix [][] = {{1,2},{2,3}};
        System.out.println(matrix[0][1]);
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.println(matrix[i][j]);
            }
        }
    }
}
