package com.java.samples;

import java.util.Arrays;

public class Linear_Search {
    public static void main(String[] args) {
        int[] nums={23,45,3,56,23,67,-6,-34,23,46,26};
        int target=56;
//        int ans=linearSearch(nums, target);
//        System.out.println(ans);
//        searchInString();
        System.out.println(search3(nums,target,1,5));
    }
    // search the target and return true or false
    static boolean linearSearch3(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return false;
    }

    // search the target and return the element
    static int linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int element : arr) {
             if (element == target) {
                return element;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return Integer.MAX_VALUE;
    }

//     search in the array; return the index if item found
//    otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index =0;index<arr.length;index++){
            //check for elements at every index if it is = target
            int element=arr[index];
            if(element==target){
                return index;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }

    static void searchInString(){
        String name="Abdullah";
        char target='e';
//        System.out.println(search(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    static boolean search2(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }

    //search for the 3 in the range of index[1,4]
    static int search3(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int index = start; index <= end; index++){
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }

}
