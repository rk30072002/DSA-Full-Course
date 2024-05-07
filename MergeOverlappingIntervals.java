import java.util.Arrays;
class MergeOverlappingIntervals{
    public static void main(String args[]){
        int intervals[][]={{6,8},{1,4},{9,10},{3,5}};
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        int mergedIndex=0;
        int mergedIntervals[][]=new int[intervals.length][2];
        mergedIntervals[0]=intervals[0];
        for(int i=1;i<intervals.length;i++){
            int currentInterval[]=intervals[i];
            int lastMergedInterval[]=mergedIntervals[mergedIndex];

            if(currentInterval[0]<=lastMergedInterval[1]){
                lastMergedInterval[1]=Math.max(currentInterval[1],lastMergedInterval[1]);

            }
            else{
                mergedIndex++;
                mergedIntervals[mergedIndex]=currentInterval;
            }
        }
        for(int i=0;i<=mergedIndex;i++){
       // System.out.print(mergedIntervals[i]);
    System.out.println(Arrays.toString(mergedIntervals[i]));
        }
        
        
    }
}