public class Main {

    public static void main(String[] args) {
        int[][] array =
                {
                        {1, 2, 3},
                        {77, 88, 25},
                        {4, 120, -6}
                };

        for (int[] row : array) {
            int rowSum = 0;
            for (int value : row) {
                rowSum += value;
            }
            System.out.println(rowSum);
        }

        for (int[] col : array) {
            int colSum = 0;
            for (int value : col) {
                colSum += value;
            }
            System.out.println(colSum);
        }
    }


}
