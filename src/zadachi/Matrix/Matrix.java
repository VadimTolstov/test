package zadachi.Matrix;

public class Matrix {
   private int[][] matrix;
   private int w;
   private int h;

    public int[][] getMatrix() {
        return matrix;
    }

    public Matrix(int w, int h) {
        this.w = w;
        this.h = h;
        this.matrix=new int[h][w];
    }

    public Matrix(int[][] matrix) {
        this.h = matrix.length;
        this.w = matrix[0].length;
        this.matrix = matrix;

    }

    public void summ(int n) {
        for (int i = 0; i < h ; i++) {
            for (int j = 0; j < w; j++) {
                this.matrix[i][j] += n;
            }
            
        }
    }

    public void summ(Matrix matrix){
        if ((this.h == matrix.getH()) && (this.w == matrix.getW())) {
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    this.matrix[i][j]+= matrix.getMatrix()[i][j];

                }
                
            }
                    }else {
            System.out.println("Матрицы разных размерность, я не хочу это считать");
        }
    }
    public void pprint() {
        for (int i=0; i<h; i++) {
            for (int j =0; j<w; j++){
                System.out.printf(this.matrix[i][j] + "\t ");
            }
            System.out.println();
        }
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
}
