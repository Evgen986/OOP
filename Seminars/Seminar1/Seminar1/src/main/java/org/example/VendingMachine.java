package org.example;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> proucts = new ArrayList<>();

    public void intProduct(List<Product> proucts){
        this.proucts = proucts;
    }
    public Product getProduct(String name){
        for (Product p: proucts) {
            if(p.getName().equals(name)) return p;
        }
        return new Product("Продукт не найден", 0);
    }
}
