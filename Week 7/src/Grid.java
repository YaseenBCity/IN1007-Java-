public class Grid {
    int[][] grid;
    Line row;

    Grid(int num){
        grid = new int[num][num];
        for (int i = 0; i < num; i++){
            for (int j = 0; j < num; j++){
                grid[i][j] = 0;
            }
        }
        grid[0][0] = 2;
    }

    void returnRow(int rownum){
        Line row = new Line(rownum);
    }
}
