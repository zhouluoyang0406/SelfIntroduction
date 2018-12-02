package builder;

public  class ConcreteBuilderA extends Builder {
    public String getColor() {
        return "yellow";
    }
    public String getWeight() {
        return "2t";
    }
    public String getHigh() {
        return "1m";
    }
    public Product getProduct() {
        Product product=new Product();
        product.color= getColor()+"*";
        product.weight= getWeight()+"*";//为了和A区别
        product.high= getHigh()+"*";
        return product;
    }
}
