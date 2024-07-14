package arraysPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Triplets {
    public static void main( String[] args ) {
        int [] nums = {-1,0,1,2,-1,4};
        ArrayList<ArrayList<Integer>>  list = new ArrayList<>();
        System.out.println(threeSum( nums ));
    }
    public static ArrayList<ArrayList<Integer>> threeSum(int nums[]) {
        ArrayList<ArrayList<Integer>> res = new ArrayList <ArrayList<Integer>> ();
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0) {
                      ArrayList<Integer> a = new ArrayList < Integer > ();
                        a.add(nums[i]);
                        a.add(nums[j]);
                        a.add(nums[k]);
                        Collections.sort(a);
                        res.add(a);
                    }
                }
            }
        }
        res = new ArrayList<ArrayList<Integer>> (new LinkedHashSet<ArrayList<Integer>>(res));
        return res;
    }
}
