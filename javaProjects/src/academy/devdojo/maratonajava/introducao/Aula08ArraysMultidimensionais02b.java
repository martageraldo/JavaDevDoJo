package academy.devdojo.maratonajava.introducao;
//o exercício anterior pode ser feito desta forma
public class Aula08ArraysMultidimensionais02b {
    public static void main(String[] args) {
        int[][] arrayInt = new int [3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1,2,3};
        arrayInt[2] = new int[] {1,2,3,4,5,6};

        for(int[] arrayBase: arrayInt){
            System.out.println("\n---------");
            for(int num: arrayBase){
                System.out.print(num + " ");
            }
        }
    }
}

