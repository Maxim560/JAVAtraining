/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

// Imports


/**
 *
 * @author Maxim
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Hi test!");
        int[] Data={2,3,56,34,64,86,2,345,23,43};
        int[] BiggestDiff={Data[1]-Data[2],1,2};
        int diff;
        
        for(int c1=2; c1<Data.length; c1++){
            for(int c2=0; c2<c1; c2++){
                diff=Data[c1]-Data[c2];
                if(diff>BiggestDiff[0]){
                    BiggestDiff=new int[]{diff,c2+1,c1+1};
                }
            }
        }
        
       System.out.println("The biggest profit would be "+Integer.toString(BiggestDiff[0])+" buying on day "+Integer.toString(BiggestDiff[1])+" and selling on day "+Integer.toString(BiggestDiff[2]));
        
    }
    
}
