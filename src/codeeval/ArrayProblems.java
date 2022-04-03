/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeeval;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author admin
 */
public class ArrayProblems {
    
    /*
    Q.21-Given an array of ints, return true if the array contains either 3 even
    or 3 odd values all next to each other  
    */
    public static boolean modThree(int[] nums){
        
        for(int i=0; i<nums.length-1; i++){
            if((nums[i]%2==0 && nums[i+1]%2==0 && nums[i+2]%2==0) || (nums[i]%2==1 && nums[i+1]%2==1 && nums[i+2]%2==1)){
                return true;
            }
        }
        return false;
    }
    
    /*
        Given an array of ints, return true if every element is a 1 or a 4
    */   
    public static boolean only14(int[] nums){
        
        for(int i : nums){
            if(i!=1 && i!=4){
                return false;
            }
        }
        return true;
    }
    
    /*
        Given an array of ints, return true if the number of 1's is greater than the number of 4's
    */
    public static boolean more14(int[] nums){
        
        int count4 = 0;
        int count1 = 0;
        
        for(int i : nums){
            if(i==4){
                count4++;
            }
            if(i==1){
                count1++;
            }
        }
        
        if(count1 > count4){
            return true;
        }
        else{
        
            return false;
        }
    
    }
    
    /*
    Question: Given an array of ints, swap the first and last elements 
    in the array. Return the modified array. The array length will be at least 1.
    */
    public static int[] swapEnds(int[] nums){
        if(nums.length==1){
            return nums;
        }
        int temp=nums[0];
        nums[0]=nums[nums.length-1];
        nums[nums.length-1]=temp;
        return nums;
    }
    
    /*
    Question: Given an array of ints, return the number of times that two
    6's are next to each other in the array. Also count instances where 
    the second "6" is actually a 7.
    */
    public static int array667(int[] nums){
        
        int count = 0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==6 && nums[i+1]==6){
                count++;
            }
            if(nums[i]==6 && nums[i+1]==7){
                count++;
            }
        }
        return count;
    }
    
    /*
    Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
    */
    public static boolean twoAsOne(int a, int b, int c){
        
        return a+b==c || b+c==a || c+a==b;
    }

    /*
        Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".	
    */
    public static int countXX(String str){
        
        int count=0;
        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i)=='x' && str.charAt(i+1)=='x'){
                count++;
            }
        }
        return count;
    }
    
    /*
        Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.
    */
    public static boolean either24(int[] nums){
        
        int count = 0;
        for(int i=0; i<nums.length-1; i++){
            if((nums[i]==2 && nums[i+1]==2)){
                count++;
            }
            if(nums[i]==4 && nums[i+1]==4){
                count++;
            }
       }
        if(count == 0){
            return false;
        }
        else{
            return count<2;
        }
    }
    
    /*
        Return the sum of the numbers in the array, except ignore sections of 
        numbers starting with a 6 and extending to the next 7 (every 6 will be 
        followed by at least one 7). Return 0 for no numbers.	
    */
    //REFACTOR
    public static int sum67(int[] nums){

        int sum=0;
        boolean flag = true;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==6){
                flag=false;
            }
            if(nums[i]==7){
                flag=true;
            }
            if(flag){
                sum=sum+nums[i];
            }
        }
        if(flag){
            return sum-7;
        }
        else{
            return sum;
        }
        
    }
    
    /*
        Given 2 int values, return true if they are both in the range 30..40 inclusive, 
        or they are both in the range 40..50 inclusive.	
    */
    public static boolean in3050(int a, int b){
        
        if(a>=30 && a<=40 && b>30 && b<=40){
            return true;
        }
        if(a>=40 && a<=50 && b>40 && b<=50){
            return true;
        }
        return false;
    }
    
    /*
        Given an array of 'n ' ints, return the sum of the first 2 elements
        in the array. If the array length is less than 2, just sum up the elements that exist.	
    */
    public static int sum2(int[] arr){
        
        if(arr.length>=2){
            return arr[0]+arr[1]; 
        }
        else{
            return arr[0];
        }
    }
    
    /*
        Given 2 int arrays, a and b, each length 3, return a new array length 
        2 containing their middle elements.	
    */
    public static int[] middleWay(int[] a, int[] b){
        int middleIndex = 0;
        int midA=0;
        int midB=0;
        if(a.length%2==1 && b.length%2==1 && a.length==b.length){
            middleIndex = a.length/2;
            midA=a[middleIndex];
            midB=b[middleIndex];
        }
        else{
            System.out.println("arrays length is not odd");
        }
        return new int[] {midA, midB};
    }
    
    /*
        Given an array of positive ints, return a new array of length "count" 
        containing the first even numbers from the original array. The original 
        array will contain at least "count" even numbers.	
    */
    public static int[] copyEvents(int[] nums, int count){
        
        int[] evenArr=new int[count];
        
        
        int evenArrLength = 0;
        int k=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                evenArr[k]=nums[i];
                k++;
                evenArrLength++;
            }
            if(evenArrLength==count){
                break;
            }
        }
        return evenArr;
    }
    
    
    /*
        Given 2 int values, return whichever value is nearest to the value 10, 
        or return 0 in the event of a tie. Note that Math.abs(n) returns the 
        absolute value of a number.	
    */
    public static int close10(int a, int b){
        if((Math.abs(10-a))==(Math.abs(10-b))){
            return 0;
        }
        if((Math.abs(10-a))<(Math.abs(10-b))){
            return a;
        }
        else{
            return b;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(close10(13, 8));
        
        //System.out.println(Arrays.toString(copyEvents(new int[] {1,3,5,2,4,6}, 2)));
        //System.out.println(sum67(new int[] {1,2,2}));
        //System.out.println(either24(new int[] {1,3,3,4}));
        //System.out.println(array667(new int[] {2,6,6,6,7}));
        //System.out.println(Arrays.toString(swapEnds(new int[] {12, 33, 47})));
        //System.out.println(more14(new int[] {1,1,4,4,4}));
        //System.out.println(only14(new int[] {1}));
        //System.out.println(modThree(new int[] {3,2,2,3}));
    }
    
}
