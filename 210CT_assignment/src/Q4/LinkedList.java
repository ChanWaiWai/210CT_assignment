/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q4;

import Q3.*;

/**
 *
 * @author wai
 */
class ListNode{
    private Object data;
    private ListNode next;
    
    public ListNode(Object o){
        data = o;
        next = null;
    }
    
    public ListNode(Object o, ListNode nextNode){
        data = o;
        next = nextNode;
    }
    
    public Object getData(){
        return data;
    }
    
    public void setData(Object o){
        data = o;
    }
    
    public ListNode getNext(){
        return next;
    }
    
    public void setNext(ListNode next){
        this.next=next;
    }
}

class EmptyListException extends RuntimeException{
    public EmptyListException(){
        super("List is empty");
    }
}

public class LinkedList {
    private ListNode head;
    private ListNode tail;
    public LinkedList() { head = tail = null; }
    public boolean isEmpty() { return head == null; }
    public void addToHead(Object item) {
        if(isEmpty()){
            head = tail = new ListNode(item);
        }else {
            head = new ListNode(item, head);
        }
    }
    public void addToTail(Object item) {
        if(isEmpty()){
            head = tail = new ListNode(item);
        }else {
            tail.setNext(new ListNode(item));
            tail = tail.getNext();
        }
    }
    public Object removeFromHead() throws EmptyListException {
        Object item = null;
        
        if(isEmpty()){
            throw new EmptyListException();
        }
        item = head.getData();
        if(head == tail){
            head = tail = null;
        }else{
            head = head.getNext();
        }
        return item;
    }
    public Object removeFromTail() throws EmptyListException {
        Object item = null;
        
        if(isEmpty()){
            throw new EmptyListException();
        }
        item = tail.getData();
        if(head == tail){
            head = tail = null;
        }else{
            ListNode current = head;
            while(current.getNext() != tail){
                current = current.getNext();
            }
            tail = current;
            current.setNext(null);
        }
        return item;
    }
    public String toString () {
            String s = "[ ";
            ListNode current = head;
            while (current != null) {
                    s += current.getData() + " ";
                    current = current.getNext();
            }
            return s + "]";
    }
}
