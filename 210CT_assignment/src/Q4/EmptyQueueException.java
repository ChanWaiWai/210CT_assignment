/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q4;

/**
 *
 * @author wai
 */
public class EmptyQueueException extends RuntimeException{
    public EmptyQueueException () {
        super("Queue is empty");
    }
}
