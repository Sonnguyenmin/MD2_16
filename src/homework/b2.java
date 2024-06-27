package homework;

public class b2 {
    private static int[][] getArr(){
        int arr[][] = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }

        }
        return arr;
    }
    private static int[][] getArr2(){
        int arr[][] = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = getArr();
        int[][] arr2 = getArr2();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
        }
        boolean dkl = false;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
               for (int k = 0; k < arr.length; k++) {
                   for (int l = 0; l < arr[k].length; l++) {
                       if (arr[k][l] == arr2[i][j]) {
                           System.out.println("ptu o arr1: " + k+","+j + " trung voi arr2 vi tri" + i + "," + j);
                       }
                   }
               }
            }
        }
    }
}
