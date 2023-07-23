// <!-- Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order. -->

public class lesson1{
    public static void main(String[] args){
        int target = 100;
        for(int i=0; i<target;i++){
            if(i+(i-1)==target){
                System.out.println("Done!");
            }
        }
    }
}