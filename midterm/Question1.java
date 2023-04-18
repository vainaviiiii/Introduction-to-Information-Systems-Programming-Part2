package midterm;

import java.util.ArrayList;

public class Question1 {
    public static void main(String[] args) {
        // Test code for sumOfPositiveElements
        int[] numbers = {1,2,3,-6};
        System.out.println(sumOfPositiveElements( numbers )); // 6

        // Test code for createGrid()
        int n = 5;
        int m = 9;
        int[][] g = createGrid(n, m);
        System.out.println(g[0][0] == 1); // true
        System.out.println(g[4][8] == 1); // true

        // Test code for negativeFilter()
        ArrayList<Double> arr = new ArrayList<>();
        arr.add(4.3);
        arr.add(-2.1);
        arr.add(52.9);
        arr.add(-71.0);
        arr.add(-6.0);
        arr.add(2.8);

        negativeFilter(arr);
        System.out.println(arr);  // [4.3, 52.9, 2.8]
    }
    public static int sumOfPositiveElements(int[] numbers){
        int output =0;
        for (int i : numbers){
            if (i>0){output += i;}

        }
        return output;
    }

    public static int[][] createGrid(int n, int m){
        if(n<1 ||m<1){
            int[][] defaultOutput= new int[5][5];
            for (int i=0; i<5;i++){
                for(int k=0;k<5;k++){
                    defaultOutput[i][k] = 1;
                }
            }
            return defaultOutput;
        }
        int[][] output= new int[n][m];
        for (int i=0; i<n;i++){
            for(int k=0;k<m;k++){
                output[i][k] = 1;
            }
        }

        return output;
    }

    public static void negativeFilter(ArrayList<Double> arr) {
        for (int i=0 ; i<arr.size();i++){
            if(arr.get(i) <0){

                arr.remove(i);
                i = 0;
            }
        }


    }
}


