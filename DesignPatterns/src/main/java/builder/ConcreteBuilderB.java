package builder;

public  class ConcreteBuilderB extends Builder {
    public String getColor() {
        return "red";
    }
    public String getWeight() {
        return "1t";
    }
    public String getHigh() {
        return "1.3m";
    }
    public Product getProduct(){
        Product product=new Product();
        product.color= getColor();
        product.weight= getWeight();
        product.high= getHigh();
        return product;
    }
}
