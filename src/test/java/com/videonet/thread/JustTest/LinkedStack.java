package com.videonet.thread.JustTest;

/**
 * @author tangjinhui
 * @date 2017/12/12
 */
public class LinkedStack<T> {

    private static class Node<U>{
        U item;
        Node<U> next;
        Node(){
            item =null;
            next =null;
        }

        public Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }
        boolean isEnd(){
            return item==null && next==null;
        }
    }

    private Node<T> top = new Node<T>();

    public void push(T item){
        top = new Node<T>(item,top);
    }

    public T pop(){
        T result = top.item;
        if(!top.isEnd())
            top = top.next;
        return result;
    }

    public static void main(String[] args) {
        LinkedStack<String> lss = new LinkedStack<>();
        for(String s:"phasers on stun!".split(" ")){
            lss.push(s);
        }

        String s;
        while ((s= lss.pop())!=null)
            System.out.println(s);
    }

}
