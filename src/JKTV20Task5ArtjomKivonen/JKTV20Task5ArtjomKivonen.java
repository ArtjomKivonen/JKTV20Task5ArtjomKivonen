/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JKTV20Task5ArtjomKivonen;

import java.util.Random;

/**
 *
 * @author pupil
 */
public class JKTV20Task5ArtjomKivonen {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        
        Random random=new Random();

        int[][] jaggedArray = new int [5][];
        jaggedArray[0]=new int[3];
        jaggedArray[1]=new int[5];
        jaggedArray[2]=new int[7];
        jaggedArray[3]=new int[8];
        jaggedArray[4]=new int[9];
        System.out.println("Jagged array");
        for (int i=0; i<jaggedArray.length; i++) {
            for (int j = 0; j<jaggedArray[i].length; j++) {
                jaggedArray[i][j] = random.nextInt(100-50);
            }
        }
        
        for (int i=0; i<jaggedArray.length; i++) {
            for (int j = 0; j<jaggedArray[i].length; j++) {
                for(int k=0; k<jaggedArray.length; k++){
                    for(int m=0; m<jaggedArray[k].length; m++){
                        if(jaggedArray[i][j]<jaggedArray[k][m]){
                            jaggedArray[i][j]=jaggedArray[i][j]+jaggedArray[k][m];
                            jaggedArray[k][m]=jaggedArray[i][j]-jaggedArray[k][m];
                            jaggedArray[i][j]=jaggedArray[i][j]-jaggedArray[k][m];
                        }
                        
                    }
                }
            }
        }
        for (int i=0; i<jaggedArray.length; i++) {
            for (int j = 0; j<jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
        
    }


    
}
