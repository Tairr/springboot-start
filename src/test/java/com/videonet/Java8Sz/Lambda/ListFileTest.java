package com.videonet.Java8Sz.Lambda;

import java.io.File;

/**
 * @author tangjinhui
 * @Description： java8 方法引用语法
 * @date 2017/12/22
 */
public class ListFileTest {

    public static void main(String[] args) {
        File [] files = new File("").listFiles(File::isHidden);
    }


}
