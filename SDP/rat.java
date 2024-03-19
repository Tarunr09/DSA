public class rat {
    public static int calculate(int r, int unit, int[] arr, int n){
        int foodreq = r*unit,i;
        int foodtillnow = 0;
        if(n<=0)
            return -1;
        for(i=0; i<n; i++){
            foodtillnow += arr[i];
            if(foodtillnow >= foodreq){
                break;
            }
        }
            if(foodtillnow < foodreq) 
                return 0;
            else return i+1;
    }
    public static void main(String[] args) {
        int r = 7;
        int unit = 2;
        int n = 8;
        // arr - 2 8 3 5 7 4 1 2
        int arr[] = { 2, 8, 3, 5, 7, 4, 1, 2 };

        int result = calculate(r, unit, arr, n);
        System.out.println(result);       
    }
}
