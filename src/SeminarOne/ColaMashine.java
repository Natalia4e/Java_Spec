package SeminarOne;

import java.util.List;

public class ColaMashine extends  VendingMashine {
    public void initProductName(List<Product> list){
        super.initProductName(list);
        System.out.println("You added new drink to ColaMashine");
    }
}
