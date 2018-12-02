package builder;


public  class Director{
    private Builder aBuilder=new ConcreteBuilderA();
    private Builder bBuilder=new ConcreteBuilderB();
    public Product getProjectA(){
        return aBuilder.getProduct();
    }
    public Product getProjectB(){
        return bBuilder.getProduct();
    }
}
