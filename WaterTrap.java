class WaterTrap{
    static int trap(int height[]){
        int res=0;
        for(int i=1;i<=height.length-2;i++){
        int Lb=height[i];
        for(int j=0;j<i;j++){
            if(height[j]>Lb){
        Lb=height[j];
            }
        }
        int Rb=height[i];
        for(int j=i+1;j<height.length;j++){
            if(height[j]>Rb){
        Rb=height[j];
            }
        }
        int waterLabel;
        if(Rb>Lb){
            waterLabel=Lb;
        }
        else{
            waterLabel=Rb;
        }
        int trapWater=waterLabel-height[i];
        res=res+trapWater;
        //System.out.println(res);
        }
        return res;
    }
    public static void main(String args[]){
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println(trap(height));
    }
}