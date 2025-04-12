class practical4 {

    public static void main(String[] args) {
        int[][] arr = {{1, 3, 4}, {2, 4, 6}, {3, 7, 9}};
        int[][] arr2 = {{4, 2, 1}, {3, 8, 1}, {8, 2, 6}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(arr[i][j] + arr2[i][j]);
            }
        }
    }
}
