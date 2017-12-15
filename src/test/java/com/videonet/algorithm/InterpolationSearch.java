package com.videonet.algorithm;

/**
 * @author tangjinhui
 * @date 2017/12/13
 */
public class InterpolationSearch {
    /**
     * 插值查询
     * @param a
     * @param key
     * @return
     */
    public static int search(int[]a,int key){

        int low = 0;
        int high = a.length -1;
        int mid ;
        while (a[low]!=a[high] && key>=a[low] && key<a[high] ){

            mid= low + (high-low)*(key-a[low])/(a[high]-a[low]);
            if(key<a[mid])
                high=mid-1;
            else if(key>a[mid])
                low = mid+1;
            else
                return mid;
        }
        if(key == a[low])
            return low;
        else return -1;

    }

    /**
     * 测试方法
     * @param args
     */
    public static void main(String[] args) {
        int[] a = {2,3,4};
        int index = search(a,3);
        System.out.println("查询结果："+index);
    }


}
