package homework;

public class b1TimSoTuyenTinhLN {
    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*100);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = getArr();
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(max<= arr[i]){
                max = arr[i];
            }
            System.out.println(arr[i]);
        }
        System.out.println("LN");
        System.out.println(max);

    }
}
