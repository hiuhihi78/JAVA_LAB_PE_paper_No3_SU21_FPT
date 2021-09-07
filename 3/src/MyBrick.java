
import java.util.List;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class MyBrick implements IBrick{

    @Override
    public int f1(List<Brick> t) {
        int count = 0;
        for(int i = 0; i < t.size() ; i++){
            String str = t.get(i).getPlace();
            for(int j = 0; j < str.length(); j++){
                if(Character.isAlphabetic(str.charAt(0)) && Character.isDigit(str.charAt(str.length() - 1))){
                    count = count + 1;
                }
                str = "";
            }
        }
        
        return  count;
    }

    @Override
    public void f2(List<Brick> t) {
        int minPrice = t.get(0).getPrice();
        for(int i = 0; i < t.size() ; i++){
            if(minPrice > t.get(i).getPrice() && t.get(i).getPrice() % 2 != 0){
                t.set(i, new Brick("YY", t.get(i).getPrice()));
                break;
            }
        }
    }

    @Override
    public void f3(List<Brick> t) {
        int maxPrice = 0;
        int index = 0;
        for(int i = 0; i< t.size(); i++){
            if(maxPrice < t.get(i).getPrice()){
                maxPrice = t.get(i).getPrice();
                index = i;
            }
        }
        ArrayList<Brick> frist = new ArrayList<Brick>();
        ArrayList<Brick> last = new ArrayList<Brick>();
        for(int i = 0; i <  t.size(); i++){
            try {
                if(i < index ){
                frist.add(t.get(i));
                }else{
                last.add(t.get(i));
            }
            } catch (Exception e) {
            }
        }
        Collections.sort(last, new Comparator<Brick>() {
            @Override
            public int compare(Brick t, Brick t1) {
                if(t.getPrice()>t1.getPrice()){
                    return -1;
                }else if(t.getPrice()<t1.getPrice()){
                    return 1;
                }else{
                    return 0;
                }
            }
        });
        t.removeAll(t);
        t.addAll(frist);
        t.addAll(last);
    }
    
}
