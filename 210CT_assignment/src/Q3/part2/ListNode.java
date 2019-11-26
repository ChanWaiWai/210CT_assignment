/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3.part2;

/**
 *
 * @author wai
 */
public class ListNode {
    protected Object data;
    protected ListNode next;
    
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
