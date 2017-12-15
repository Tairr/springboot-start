package com.videonet.algorithm;

/**
 * @author tangjinhui
 * @date 2017/12/13
 */
public class BinaryTree {


    public static int search(int[]a ,int key){

        int low =0;
        int high = a.length-1;
        int mid;
        while (low<high){
            mid = (low+high)/2;
            System.out.println("mid:"+mid);
            if(key<a[mid]) {
                high = mid - 1;
            }else if(key>a[mid]) {
                low = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int []a ={1,2,3,4,22,33,44,55};
        int index = search(a,33);
        System.out.println("查找结果："+index);

    }

}
