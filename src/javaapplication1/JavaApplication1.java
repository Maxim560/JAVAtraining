/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

// Imports
import java.util.Random;

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
        
        //Input
        int n=100000; //Length of data array
        
        int[] Data=DataRand(n);
        
        int[] BiggestDiff={Integer.MIN_VALUE,0,0};
        int[] CurrentMin={Integer.MAX_VALUE,0};
        
        for(int c1=0; c1<Data.length; c1++) {
            if(Data[c1]-CurrentMin[0] > BiggestDiff[0]) {
                BiggestDiff=new int[]{Data[c1]-CurrentMin[0],CurrentMin[1]+1,c1+1};              
            }
            if(CurrentMin[0] > Data[c1]) {
                CurrentMin=new int[]{Data[c1],c1};              
            }
        }
              
        
//        for(int c1=2; c1<Data.length; c1++){
//            for(int c2=0; c2<c1; c2++){
//                diff=Data[c1]-Data[c2];
//                if(diff>BiggestDiff[0]){
//                    BiggestDiff=new int[]{diff,c2+1,c1+1};
//                }
//            }
//        }
        
       System.out.println("The biggest profit would be "+Integer.toString(BiggestDiff[0])+" buying on day "+Integer.toString(BiggestDiff[1])+" and selling on day "+Integer.toString(BiggestDiff[2]));
        
    }
    
    public static int randomFill() {
        Random rand = new Random();
        int randNum = rand.nextInt();
        return randNum;
    }
    
    public static int[] DataRand(int n) {
        int[] data = new int[n];
        for(int c1=0; c1<n; c1++) {
            data[c1]=randomFill();
            
        }
        return data;
    }
    
}
