/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class SpecBrick extends Brick{
    private int color;

    public SpecBrick() {
    }

    public SpecBrick( String place, int price, int color) {
        super(place, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.getPlace() + "," + super.getPrice() + "," +color;
    }
    
    public void setData(){
        String str = super.getPlace();
        String x = "";
        String  y = "";
        for(int i = 0 ; i < str.length(); i++){
            if(i <= 1){
                x = x + str.charAt(i);
            }
            if(i > 1) {
                y = y + str.charAt(i);
            }
        }
        super.setPlace(x + "BCA" + y);
    }
    
    public int getValue(){
        int resoult = 0;
        if(color > 7){
            resoult = super.getPrice() + 9;
        }else{
            resoult = super.getPrice() + 6;
        }
        return resoult;
    }
}
