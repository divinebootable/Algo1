/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productofarrayexceptself;

import java.util.Arrays;

/**
 *
 * @author divine
 */
public class ProductOfArrayExceptSelf {

    /**
     * @param args the command line arguments
     */
    
    public static int[] productExceptSelf(int[] nums) {

        int temp =1;
        int[] result = new int [nums.length];
        for(int i=0; i< nums.length; i++){
            result[i]= temp;
            temp=temp*nums[i]; // left prefix
        }
        
        temp = 1;
        for(int i= nums.length-1; i>=0; i--){
            result[i] = result[i] * temp;
            temp = temp*nums[i]; // right prefix
        }
        System.out.println(Arrays.toString(result));
       return result; 
    }
    public static void main(String[] args) {
        // TODO code application logic here
         int[] nums = {1,2,3,4};
        productExceptSelf(nums);
    }
    
}
