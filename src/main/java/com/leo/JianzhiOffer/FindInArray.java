package com.leo.JianzhiOffer;

/**
 * Created by lionel on 18/2/12.
 */
public class FindInArray {
    public boolean Find(int target, int [][] array) {
        int rows=array.length;
        int columns=array[0].length;
        int currentRow=rows-1;
        int currenctColumn=0;
        while(currentRow>=0&&currenctColumn<columns){
            if(array[currentRow][currenctColumn]<target){
                currenctColumn += 1;
            }
            else if(array[currentRow][currenctColumn]>target){
                currentRow -= 1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
