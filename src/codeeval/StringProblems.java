/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeeval;

/**
 *
 * @author admin
 */
public class StringProblems {
    
    /*
        Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo"
    */
    public static String stringBits(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i+=2){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    
    /*
        Given a string, return true if it ends in "ly".	
    */
    public static boolean endsLy(String str){
     
        return str.substring(str.length()-2, str.length()).equals("ly");
    }
    
    
    /*
        Given a string, return a string made of the chars at 
        indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".	
    */
    
    public static String altPairs(String str){
        for(int i=0; i<str.length()-1; i+=2){
            System.out.println(str.charAt(i));
            System.out.println(str.charAt(i));
        }
        return null;
    }
    
    /*
        Given a string of any length, return a new string where 
        the last 2 chars, if present, are swapped, so "coding" yields "codign".	
    */
    public static String lastTwo(String str){
        
        char[] arr = str.toCharArray();
        char temp = arr[str.length()-2];
        arr[str.length()-2]=arr[str.length()-1];
        arr[str.length()-1] = temp;
        return new String(arr);
        
    }
    
    /*
        Given a string, if the first or last chars are 'x', return the string
        without those 'x' chars, and otherwise return the string unchanged.	
    */
    public static String withoutX(String str){
        
        char first = str.charAt(0);
        char last = str.charAt(str.length()-1);
      
        if(first=='x' && last=='x'){
            return str.substring(1, str.length()-1);
        }
        else if(first=='x'){
            return str.substring(1, str.length());
        }
        else if(last=='x'){
            return str.substring(0, str.length()-1);
        }
        else{
            return str;
        }
    }
    
    /*
        Given 2 strings, return their concatenation, except omit the first char 
        of each. The strings will be at least length 2.	
    */
    public static String nonStart(String a, String b){
        String sub1=a.substring(1,a.length());
        String sub2=b.substring(1,b.length());
        
        return sub1+sub2;
    }
    
    /*
        Given a string, return true if the first 2 chars in the string also
        appear at the end of the string, such as with "edited".	
    */
    public boolean frontAgain(String str){
        
        String sub1 = str.substring(0,2);
        String sub2 = str.substring(str.length()-2, str.length());
        
        if(sub1.equals(sub2)){
            return true;
        }
        return false;
    }
    
    /*
        Given a string, return a new string where the last 3 chars are now in upper case. 
        If the string has less than 3 chars, uppercase whatever is there. 
        Note that str.toUpperCase() returns the uppercase version of a string.	
    */
    public static String endUp(String str){
        
        char[] strArr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        if(strArr.length<3){
            return str.toUpperCase();
        }
        else if(strArr.length>=3){
            for(int i=0; i<strArr.length; i++){
            if(i<=strArr.length-4){
                sb.append(strArr[i]);
            }
            if(i>strArr.length-4){
                sb.append(Character.toUpperCase(strArr[i]));
            }
          }
        }
        return sb.toString();
    }
    
    /*
        Given a string, return a version without both the first and last char
        of the string. The strings will be at least length 3.	
    */
    public static String withoutEnd2(String str){
        
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<str.length()-1; i++){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    
    
    public static void test(){
        
        System.out.println("Hello World");
        
        String a = "nalla";
        int b = 0;
        
        while(b<5){
            System.out.println(b);
            if(b==a){
                System.out.println("b is equal to a");
            }
            b+=1;
        }
    
    }
    
    public static void main(String[] args){
        
        
        test();
        
       // System.out.println(withoutEnd2("hello"));
        
        //System.out.println(endUp("war"));
       // System.out.println(nonStart("Hello", "World"));
       // System.out.println(withoutX("xHello"));
      //System.out.println(lastTwo("Hello"));
      //System.out.println(altPairs("kittens"));
      //System.out.println(endsLy("Happily"));
      //System.out.println(stringBits("Hello"));
      
      
//      String str1 = "helloworld";
//      String str2 = "hello" + "world";
//              
//     System.out.println(str1==str2); 
//     System.out.println(str1.equals(str2));
//    
    }
    
}
