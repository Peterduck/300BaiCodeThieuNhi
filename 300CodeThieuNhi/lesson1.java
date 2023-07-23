// <!-- Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order. -->

public class lesson1{
    public static void main(String[] args){
        int[] array ={0,1,2,3,4,5,6,7,8,9,10};
        int target = 9;
        for(int i = 1; i<array.length; i++){
            int result = array[i]+array[i-1];
            if(result==target){
                System.out.println("Successful");
                System.out.println(array[i] +"&"+array[i-1]);
            }
        }
        }
    }