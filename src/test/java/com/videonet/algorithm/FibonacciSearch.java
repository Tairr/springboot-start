package com.videonet.algorithm;

/**
 * @author tangjinhui
 * @date 2017/12/13
 */
public class FibonacciSearch {


    /**
     * @description: 创建最大值刚好>=待查找数组长度的裴波纳契数组
     * @param a: 待查找的数组
     */
    public static int[] amakeFiArray(int[]a){
        int N = a.length;
        int first = 1,sec=1,third=2,fbLength=2;
        int high=a[N-1];
        while (third<N){
            third  = first+sec;
            first = sec;
            sec = third;
            fbLength++;
        }
        int []fb = new int[fbLength];
        fb[0] = 1;
        fb[1] = 1;
        for (int i = 2; i <fbLength ; i++) {
            fb[i] = fb[i-1]+fb[i-2];
        }
        return fb;
    }

    /**
     * @description: 创建最大值刚好>=待查找数组长度的裴波纳契数组
     * @param a: 待查找的数组
     */
    public static int search(int[] a,int key){

        int low,high;
        int lastA;
        int []fiboArray = amakeFiArray(a);
        int filledLength = fiboArray[fiboArray.length-1];
        int []filledArray = new int[filledLength];
        for (int i = 0; i <a.length ; i++) {
            filledArray[i] = a[i];
        }
        lastA = a[a.length-1];
        for (int i = a.length; i <filledLength ; i++) {
            filledArray[i]=lastA;
        }

        low = 0;
        high = a.length; // 取得原待排序数组的长度 （注意是原数组！）
        int mid;
        int k = fiboArray.length-1;
        while (low<=high){
            mid = low + fiboArray[k-1]-1;
            if(key<filledArray[mid]){
                high = mid -1;// 排除右半边的元素
                k = k-1; // f(k-1)是左半边的长度
            }else if(key>filledArray[mid]){
                low = mid +1; // 排除左半边的元素
                k = k-2; // f(k-2)是右半边的长度
            }else {
                if(mid>high){
                    return high;// 说明取到了填充数组末尾的重复元素了
                }else{
                    return mid;// 说明没有取到填充数组末尾的重复元素
                }
            }
        }
        return -1;

    }


    public static void main(String[] args) {
        int [] a = new int []{1,4,6,9,11,66,78};
        int index= FibonacciSearch.search(a,4);
        System.out.println("查找到，下标为"+index);

    }

}
