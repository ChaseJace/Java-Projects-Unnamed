import java.util.Random;

public class LinearSearching {
    public static void main(String[] args) {
        int num[]=LinearSearching.addElements();
    }//end of main

    public static int[] addElements() {
        int num[]=new int[Integer.MAX_VALUE/5];
        Random rnd=new Random();
        int val=0;
        for(int i=0; i<num.length; i++) {
            val=rnd.nextInt(Integer.MAX_VALUE)-num.length;
            System.out.println(val);
            num[i]=val;
        }//end of for
        return num;
    }//end of addElements

    public int removeOutliers() {
        int outlier=0;
        //Write your codes here
        return outlier;
    }
}