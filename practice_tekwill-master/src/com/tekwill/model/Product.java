//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//
package com.tekwill.model;

public abstract class Product {
    
    protected Integer id;
    protected String name;
    
    public Product(Integer id, String name) {
        
        this.id = id;
        
        this.name = name;
        
    }
    
    public int getId() {
        
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
        
    }
    
    public abstract void setType(String type);
    
    public abstract void setSize(double size);
    
    public boolean equals(Object obj) {
        Product prod = (Product) obj;
        
        return (this.id == prod.getId() && this.name.equals(prod.getName()));
         
    }
    
}
