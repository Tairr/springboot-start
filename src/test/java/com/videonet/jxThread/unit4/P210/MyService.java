package com.videonet.jxThread.unit4.P210;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author tangjinhui
 * @Description：
 * @date 2017/12/15
 */
public class MyService {

    private ReentrantLock lock = new ReentrantLock();
    public Condition conditionA = lock.newCondition();
    public Condition conditionB = lock.newCondition();


    public ReentrantLock getLock(){
        return lock;
    }

    public void awaitA(){

        try {
            lock.lock();
            System.out.println("begin awaitA 时间："+System.currentTimeMillis()+" thread name:"+Thread.currentThread().getName());
            conditionA.await();
            System.out.println("end awaitA 时间："+System.currentTimeMillis()+" thread name:"+Thread.currentThread().getName());
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            System.out.println("before awaitA unlock:"+lock.getHoldCount());
            lock.unlock();
            System.out.println("after awaitA unlock"+lock.getHoldCount());
        }

    }

    public void awaitB(){

        try {
            System.out.println("awaitB before lock"+lock.getHoldCount());
            lock.lock();
            System.out.println("begin awaitB 时间："+System.currentTimeMillis()+" thread name:"+Thread.currentThread().getName());
            conditionB.await();
            System.out.println("end awaitB 时间："+System.currentTimeMillis()+" thread name:"+Thread.currentThread().getName());
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            System.out.println("awaitB "+lock.getHoldCount());
            lock.unlock();
        }

    }

    public void signalAll_A(){

        try {
            System.out.println("signalAll_A before lock"+lock.getHoldCount());
            lock.lock();
            System.out.println("begin signalAll_A 时间："+System.currentTimeMillis()+" thread name:"+Thread.currentThread().getName());
            conditionA.signalAll();
            System.out.println("end signalAll_A 时间："+System.currentTimeMillis()+" thread name:"+Thread.currentThread().getName());
        }finally {
            System.out.println("signalAll_A "+lock.getHoldCount());
            lock.unlock();
        }

    }

    public void signalAll_B(){

        try {
            lock.lock();
            System.out.println("begin signalAll_B 时间："+System.currentTimeMillis()+" thread name:"+Thread.currentThread().getName());
            conditionA.signalAll();
            System.out.println("end signalAll_B 时间："+System.currentTimeMillis()+" thread name:"+Thread.currentThread().getName());
        }finally {
            System.out.println("signalAll_B "+lock.getHoldCount());
            lock.unlock();
        }

    }

}
