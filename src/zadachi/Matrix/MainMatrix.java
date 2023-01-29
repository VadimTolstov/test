package zadachi.Matrix;

public class MainMatrix {
    public static void main(String[] args) {
        Matrix matrix =new Matrix(3,2);
//        System.out.println(matrix.getH());
//        System.out.println(matrix.getW());
//        System.out.println(Arrays.deepToString(matrix.getMatrix()));
//        matrix.pprint();

        Matrix m = new Matrix(new int[][] {

                {1,2,3},
                {4,5,6}
        });
//        m.pprint();
//        System.out.println(m.getH()); //высота 2
//        System.out.println(m.getH());  //ширина 3
        matrix.summ(-4);
        matrix.pprint();

        m.summ(matrix);

        m.pprint();

    }
}
