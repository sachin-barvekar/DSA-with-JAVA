public class trapRainwater {
    public static int getTrapRainwater(int height[], int width){  //O(n) time complexity;
        int n = height.length;
        int trapWater=0;
        
        //calculate leftmaxboundary
        int leftMaxBoundary[] = new int[n];
        leftMaxBoundary[0]=height[0];
        for(int i=1; i<leftMaxBoundary.length; i++){
            leftMaxBoundary[i]=Math.max(leftMaxBoundary[i-1], height[i]);
        }
        
        //calculate rightmaxboundary
        int rightMaxBoundary[] = new int[n];
        rightMaxBoundary[n-1]=height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMaxBoundary[i]=Math.max(rightMaxBoundary[i+1], height[i]);
        }
        
        for(int i=0; i<n; i++){
            int waterLevel = Math.min(leftMaxBoundary[i], rightMaxBoundary[i]);
            trapWater+= (waterLevel-height[i])*width;
        }
        return trapWater;
    }

    public static void main(String[] args) {
        int height[] ={4,2,0,6,3,2,5};
        int width = 1;
        System.out.println("Total trap water is: "+getTrapRainwater(height, width));
    }
}
