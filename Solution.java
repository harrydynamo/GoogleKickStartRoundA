// Google KickStart Round-A Question 1
// 1. Sorted Array
// 2. Applied Greedy Approach.
// Time Complexity O(NlogN)-for sorting. O(N)-for counting number of houses can be bought.

import java.util.*;
public class Solution {
    public static int countMax(int[] houses, int dollars) {
        int count = 0;

        Arrays.sort(houses);
        for (int house : houses) {
            if (dollars-house < 0 )
                return count;
            dollars -= house;
            count++;
        }
        return count;
    }
    
    public static void main(String args[]) {
        
        try (Scanner in = new Scanner(System.in)) {
            int T = Integer.parseInt(in.nextLine());
            for ( int t = 1; t <= T; t++) {
                String[] a = in.nextLine().split(" ");
                int size = Integer.parseInt(a[0]);
                int dollars = Integer.parseInt(a[1]);
                
                String[] b = in.nextLine().split(" ");
                int[] costs = new int[size];
                
                for ( int i = 0; i < size; i++ )
                    costs[i] = Integer.parseInt(b[i]);
                
                System.out.println("Case #"+t+": "+countMax(costs, dollars));
            }            
        } catch(Exception e) {
            System.out.println("Exception");
        }
        
    }
}
