package array2;

public class trappingrain {
    public static int rainWater(int height[]){
        int n = height.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        int waterLevel[] = new int[n];
        int trappedWater = 0;

        leftMax[0] = height[0];
        rightMax[n-1] = height[n-1];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i] , leftMax[i-1]);
        }
        for(int j=n-2; j>=0; j--){
            rightMax[j] = Math.max(height[j] , rightMax[j+1]);
        }
        for(int k=0; k<n; k++){
            waterLevel[k] = Math.min(leftMax[k] , rightMax[k]);
        }
        for(int m=0; m<n; m++){
            trappedWater+= (waterLevel[m] - height[m]);
        }
        return trappedWater;
    }
    public static void main(String args[]) {
        // int height[] = {4,2,0,6,3,2,5};
        // int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int height[] = {4,2,0,3,2,5};
        System.out.println(rainWater(height));
    }
}
