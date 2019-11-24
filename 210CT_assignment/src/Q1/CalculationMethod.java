/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1;

/**
 *
 * @author chan_
 */
public class CalculationMethod {
    int n;
    int result;
    
    public int calculationMethod1(int n){
        result = n*(n-1)/2;
        return result;
    }
    
    public int calculationMethod2(int n){
        result = 2*n+26;
        return result;
    }
    
    public String toString(){
        return "n(n-1)/2" + "\t2n+26";
    }
}
