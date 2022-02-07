package JH.codetest;

public class secondArr {
    public static void main(String[] args) {
        int[][] arr2 = new int[3][2];
        arr2 = new int[][]{{2, 3}, {3, 4}, {5, 6}};

        for(int i: arr2[0]){
            System.out.print(i + ", ");
        }
        System.out.println();
        for(int i: arr2[1]){
            System.out.print(i + ", ");
        }
        System.out.println();
        for(int i: arr2[2]){
            System.out.print(i + ", ");
        }
    }
}
