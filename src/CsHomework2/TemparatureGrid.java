package CsHomework2;


public class TemparatureGrid {
    double[][] temps = {{95.5, 100, 100, 100, 100, 110.3}, {0.0, 50, 50, 50, 50, 0}, {0, 40, 40, 40, 40, 0,}, {0, 20, 20, 20, 20, 0}, {0,0,0,0,0,0.1}};

    private double computeTemp(int row, int col) {
        if (row == 0 || row == temps.length - 1 || col == 0 || col == temps[0].length - 1){
            return temps[row][col];
        }
        else {
            double average = (temps[row - 1][col] + temps[row + 1][col] + temps[row][col - 1] + temps[row][col + 1]) / 4.0;
            return average;
        }
    }

    public boolean updateAllTemps(double tolerance) {
        double[][] updatedTemps = new double[5][6];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                updatedTemps[i][j] = computeTemp(i, j);
            }
        }
        boolean isInTolerance = true;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if (Math.abs(updatedTemps[i][j]-temps[i][j]) > tolerance){
                    isInTolerance = false;
                    break;
                }
            }
        }
        temps = updatedTemps;
        return isInTolerance;
    }
}