/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class MyString implements IString{

    @Override
    public int f1(String str) {
        int count  = 0;
        String[] arr = str.split(" ");
        for(int i = 0; i < arr.length; i++){
            if(arr[i].endsWith("m")||arr[i].endsWith("n")){
                count = count + 1;
            }
        }
        return count;
    }

    @Override
    public String f2(String str) {
        String newString = "";
        String[] arr = str.split(" ");
        String longString= "";
        int index = 0;
        for(int i = 0; i < arr.length ; i++){
            if(longString.length() < arr[i].length()){
                longString = arr[i];
                index = i;
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(index == i){
                for(int j = arr[index].length() - 1; j>= 0; j -- ){
                    newString = newString + arr[i].charAt(j);
                }
            }else{
                newString = newString + arr[i];
            }
            if(i < arr.length){
                newString = newString + " ";
            }
        }
        return newString;
    }
    
}
