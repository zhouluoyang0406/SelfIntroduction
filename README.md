| Ⅰ | Ⅱ | Ⅲ |
| :--------: | :--------: | :--------: | :--------: |:--------: |
| 语言:coffee:| 项目:computer:| 设计:bulb:| 读后感:bulb: |源码解析:bulb:|
## :coffee: 语言
### java语法
#### 第某章：java泛型
### kotlin基础语法
#### 第某章：kotlin泛型
##### 什么是泛型？
广泛的类型就是泛型,粗暴点讲List<T>中的T，和普通的类型差别就是这个T。List<T>表示的含义是List队列中不存储具体的类型而是存储广泛的类型，比如List<String>表示可以操作String数组，List<Long>表示可以操作Long数组。
##### 为什么使用泛型？
有的类可以处理一系列对象，比如List类的作用是以操作一些对象列表，如果定义StringList，LongList，这两个类除了操作的对象之外，其他的操作都是一样的，这种情况下使用泛型可以减少冗余代码，在代码中冗余代码就是坏味道的开始。
##### 什么时候使用？
一个类可以操作或者产生一些不同的类的时候可以使用泛型
##### 怎么使用kotlin泛型？
泛型的作用和概念，在java中和kotlin中都是相似的，但是使用方法略有区别，可以java泛型那章对比着看。
###### 名次解释
类型形参:List<T>中的T就是类型形参
类型形参声明:`fun <T> List<T> `第一个T是声明
类型实参:List<String>中的String就是类型形参
###### 声明一个kotlin泛型
泛型可以被使用在类上,函数上，属性上。
###### 泛型函数和属性
泛型用在扩展函数上
`fun <T> List<T>.slice(indics:IntRange):List<T> `第一个是声明，第二个和第三个是形参。
```kotlin
  val letters = ('a'..'z').toList()
  println(letters.slice<Char>(0..2))//类似于 public static <T> slice（List<T> list,IntRange indics）
```
letters会被kotlin编译器识别是<Char>所以可以省略
  
泛型也可以用在lambda上
```kotlin
  val authors= listOf (”Dmitry”, ”Svetlana")
  val readers = mutableListOf<String> (/* . . */)
  fun <T> List<T>.filter (predicate: (T) - > Boolean) : List<T>
  readers.filter { it !in authors }
```
上面的例子表示接受一个入参类型为<T>的函数
  
泛型用在扩展属性上
```kotlin
  val <T> List<T>.penultimate: T //类似于public static <T> getPenultimate（List<T> list）
      get() = this[size - 2]
```
不能声明泛型非扩展属性
###### 泛型类
和java一样，在类名称后面加一个尖括号，再把类型参数反正括号内来声明泛型类和泛型接口
```kotlin
interface List<T> {
  operator fun Int): T //在接口和类中T可以当作普通类型使用
```
如果继承了一个泛型类或泛型接口，你得为基础类提供一个类型实参或是另外一个类型形参数,如StringList:List<String>或List2<T>:List<T>
## :computer: 项目
## :bulb: 设计
### 设计模式
#### 单例模式
##### 1.什么是单例模式
一个国家只有一个皇帝，这个皇帝就是单例模式
##### 2.什么时候使用单例模式
当你觉得一个类在应用中只有一个实例的时候，就应该使用单例模式
##### 3.UML类图
单例模式只有一个自己的类，可以选择饿汉模式和懒汉模式，里面包含线程安全和线程不安全的问题不是该章节的重点
* UML图：
![](http://www.plantuml.com/plantuml/png/SoWkIImgAStDuKhEIImkLWZEp4lFIIt9prEevbBG1KgMP2Ohf6Nc9UOWITagvAMM8_WQcbmAsb2b24NfgIN8Acgv75BpKe0M0G00)
##### 4.JAVA实现
```java
public class Singleton {
    private static final Singleton singleton=new Singleton();
    public static Singleton getSingleton(){
        return singleton;
    }
}
```
##### 5.其他
* Spring里面默认的对象管理方法，就是单例的,如果想使用原型就'prototype'。在kotlin中可以使用object定义一个类，这个类就可以当作单例使用，例如工具类
* 也可以不是单例，选择固定数量的对象，用一个ArrayList保管就好
#### 工厂模式
##### 1.什么是工厂模式
负责创建产品类实例的类，就是工厂模式。具体定义就是定义一个创建对象的接口，让子类决定实例化哪一个类，工厂方法使一个类的实例化延迟到子类。
##### 2.什么时候使用工厂模式
你有一些产品初始化比较复杂的时候，就是用工厂类吧，可以屏蔽复杂的实现。
##### 3.UML类图
* UML图：
![](http://www.plantuml.com/plantuml/png/SoWkIImgAStDuKfCAYufIamkKKZEIImkLWWeoizA1VAgkRGLKlABytDJIp8oyz8rDBbgkI0g_FDIYL1Kaf5QH5YP6z3Y_A9Ai0gOwlJK4YXJ8xYa2AXUeHXCWNGXsQshMsC7qyC5jmvJ1g53JyyEPY5C0wQ4GsfU2Z1O0000)
##### 4.JAVA实现
```java
public abstract class Project {
    abstract void doSomething();
}
public class OtherProject extends Project {
    void doSomething() {
        System.out.printf("Other");
    }
}
public class OneProject extends Project {
    void doSomething() {
        System.out.printf("one");
    }
}
public class Factory {
    public static Project getProject(String string){
        if (string.equals("Other")){
            return new OtherProject();
        }else if (string.equals("One")){
            return new OneProject();
        }else {
            return null;
        }

    }
}
public class Client {
    public static void main(String[] args) {
        Factory.getProject("One").doSomething();
        Factory.getProject("Other").doSomething();
    }
}
```
##### 5.其他
* 符合洛必达法则，我只想知道我可以知道的；符合依赖倒置，只生产抽象；里氏替换法则，子类可以替换父类，ok！
#### 抽象工厂模式
##### 1.什么是抽象工厂模式
就是工厂模式的升级版本，普通工厂模式中工厂类是一个具体的类，而抽象工厂模式中是一个抽象的类
##### 2.什么时候使用抽象工厂模式
在生产一系列相互关联的产品类的时候，比如A信号的4个车门和B型号的4个轮胎组合或者B信号的4个车门和A型号的4个轮胎这种情况
##### 3.UML类图
![](http://www.plantuml.com/plantuml/png/XP1H3i8W44J_EKKlq9x0c7QyW5T0oXyjoRB43_NkJPCksHJKttd3x0nZOakSbs1Si2brqoCnMSStyfOZTI_pESYXJBK4aTJxEyKvEzPkaUBg6oe_u_SOr0_GZ874d7TStdrV9loaCDM67UlwROUUSdQWEAJx7yUUKNvy6AxwV1D00GYGEZMG6wDVvxo43G00)
##### 4.JAVA实现
```java
public abstract class AbstractCreator {
    public abstract AbstractProductA createProductA();
    public abstract AbstractProductB createProductB();
}
public abstract class AbstractProductA {
    public void shartMethod() {}
    public abstract void doSomething();
}
public abstract class AbstractProductB {
    public void shartMethod(){ }
    public abstract void doSomething();
}
public  class CreatorA extends AbstractCreator {
    public AbstractProductA createProductA() {
        return new ProductAone();
    }
    public AbstractProductB createProductB() {
        return new ProductBone();
    }
}
public  class CreatorB  extends AbstractCreator {
    public AbstractProductA createProductA() {
        return new ProductAtwo();
    }
    public AbstractProductB createProductB() {
        return new ProductBtwo();
    }
}
public  class ProductAone extends AbstractProductA {
    public void doSomething() {
        System.out.printf("Aone");
    }
}
public  class ProductAtwo extends AbstractProductA {
    public void doSomething() {
        System.out.printf("Atwo");
    }
}
public  class ProductBone extends AbstractProductB {
    public void doSomething() {
        System.out.printf("Bone");
    }
}
public  class ProductBtwo extends AbstractProductB {
    public void doSomething() {
        System.out.printf("Btwo");
    }
}
public class Client {
    public static void main(String[] args) {
        AbstractCreator creatorA=new CreatorA();
        AbstractCreator creatorB=new CreatorB();
        AbstractProductA productA = creatorA.createProductA();
        AbstractProductB productB = creatorA.createProductB();
        AbstractProductA productA1 = creatorB.createProductA();
        AbstractProductB productB1 = creatorB.createProductB();
    }
}
```
##### 5.其他
假设一套应用有需要几个平台，在每个平台上的功能，页面都是相似的就可以定义一个抽象工厂factory(ui+feature),不同的平台工厂组装不同的ui和feature
#### 模版方法模式
##### 1.什么是模版方法模式
在父类中定义算法结构，将具体的实现延迟到子类当中
##### 2.什么时候使用模版方法模式
很多开源框架中学写了一些抽象类，如果你想扩张功能就继承这个抽象类，并实现他的protect方法，类似于这种情况的时候
##### 3.UML类图
![](http://www.plantuml.com/plantuml/png/SoWkIImgAStDuKhEIImkLd1CAYufIamkSGRpghcK5ShoCrCKKl8TyofBCZBpqZKq4MB1-RcfC45jY619Qcv1Jc99gYzG8Zy5A5uBDTWvFo-vABKa5Momeq8rTWadi0GNgYjiQdHrqVGJLE74vP2QbmBq5m00)
##### 4.JAVA实现
```java
public abstract class AbstractClass {
    protected abstract void doAnything();
    protected abstract void doSomething();
    public void templateMethod() {
        doAnything();
        doSomething();
    }
}
public  class ConcreteClassA extends AbstractClass {
    protected void doAnything() {
        System.out.println("any A");
    }
    protected void doSomething() {
        System.out.println("some A");
    }
}
public  class ConcreteClassB extends AbstractClass {
    protected void doAnything() {
        System.out.println("any B");
    }
    protected void doSomething() {
        System.out.println("some B");
    }
}
public class Client {
    public static void main(String[] args) {
        AbstractClass a=new ConcreteClassA();
        AbstractClass b=new ConcreteClassB();
        a.templateMethod();
        b.templateMethod();
    }
}
```
##### 5.其他
模版模式常常会在项目中用到，举一个我个人的例子，我有一个方法会得到一个Field对象，但是这个Field的封装方法可能有多种，但是
格式都是getName getType getValue，在这个案例里面，getName getType getValue就是我交给子类实现的方法，getField就是模版方法

#### 建造者模式
##### 1.什么是建造者模式
又叫生成器模式，将一个复杂对象的创建和他的表示分离，是的使用相同的构建过程可以创建不同的表示。
##### 2.什么时候使用建造者模式
工厂类关注生产产品，而见建造者模式关注生产一个类的具体细节，一个类的不同属性。
##### 3.UML类图
![](http://www.plantuml.com/plantuml/png/lPAnZi8m38RtF4MaMmvLUG8GQbC6HYG6vf9QRKwXaLnN3C2xurH92ntOkCt-4lzVv3RlgK8QBauOL_MzFA3_0qFo9Z9v9BHT8urt7kVs2hPfQUvRRiKZZkl1kXgGnt_IUGDKXeJVrHixZJ4Bk6V6A0lFg0T3WSMISPAKlZC8155M_AjDVzUsimY6FB8bcxPPnMBzmiupInyj9CQoIAO5rwDAf12bjkcIcCnUgMIPBcxk39Tx_tYgHGvTpJ_M4m00)
##### 4.JAVA实现
```java
public class Product {
    public String color;
    public String weight;
    public String high;
}
public abstract class Builder {
    protected abstract String getColor();
    protected abstract String getWeight();
    protected abstract String getHigh();
    public abstract Product getProduct();
}
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
public class Client {
    public static void main(String[] args) {
        Director director=new Director();
        director.getProjectA();
        director.getProjectB();
    }
}
```
##### 5.其他
感觉就是宝马和奥迪，两个车都是一样的属性(属性值不一样)，所有的方法都一样，这种情况下设置为两种类就不太合适
#### 代理模式
##### 1.什么是代理模式
代理模式通俗点将就是中介,比如你想买一个二手车的时候，可以选择自己区二手车市场买，也可以选择一个代理人，他帮你做了选择和一些复杂的操作，你直接拿成品就可以了
##### 2.什么时候使用代理模式
在某些情况下，一个客户类不想或者不能直接引用一个委托对象，而代理类对象可以在客户类和委托对象之间起到中介的作用，其特征是代理类和委托类实现相同的接口
特点是代理类和委托类实现相同的接口，并且代理类依赖委托类
##### 3.UML类图
![](http://www.plantuml.com/plantuml/png/SoWkIImgAStDuKhEIImkLl1qJynD3SX9h4mjKgZcqbOeoyzCKSZEpCbnoYykrj24YPGMf1SbbgG21MgX6YdN5r2KNr69q5oSMeAGqq1sLpgSgKcAJSuvcQbv9GhLG04kA5jNrmxPnrp8jjZKwEeg49H3k9pB8JKl1HYG0000)
##### 4.JAVA实现
```java
interface IGamePlayer {
    void killBoss();
    void upgrate();
}
public  class GamePlayer implements IGamePlayer {
    public void killBoss() {
        System.out.printf("zly kill boss");
    }
    public void upgrate() {
        System.out.printf("zly upgrate");
    }
}
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer iGamePlayer;
    public void setGamePlayer(IGamePlayer gamePlayer) {
        this.iGamePlayer = gamePlayer;
    }
    public void killBoss() {
        iGamePlayer.killBoss();
    }
    public void upgrate() {
        iGamePlayer.upgrate();
    }
}
public class Client {
    public static void main(String[] args) {
        IGamePlayer player=new GamePlayer();
        GamePlayerProxy playProxy=new GamePlayerProxy();
        playProxy.setGamePlayer(player);
        playProxy.killBoss();
        playProxy.upgrate();
    }
}
public class DynamicProxyHandler implements InvocationHandler {
    private Object object;
    public DynamicProxyHandler(final Object object) {
        this.object = object;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName() == "killBoss") {
            System.out.println("前准备");
            Object result = method.invoke(object, args);
            System.out.println("后准备");
            return result;
        }else {
            Object result = method.invoke(object, args);
            return result;
        }
    }
}
public class DynamicProxyClient {
     public static void main(String[] args) {
         IGamePlayer gamePlayer = new GamePlayer();
         IGamePlayer gamePlayerProxy = (IGamePlayer) Proxy.newProxyInstance(IGamePlayer.class.getClassLoader(), new
                 Class[]{IGamePlayer.class}, new DynamicProxyHandler(gamePlayer));
         gamePlayerProxy.killBoss();
         gamePlayerProxy.upgrate();
     }
 }
```
##### 5.其他
代理模式有两种形式。一种是静态代理，就是我案例中的例子。另外一种叫做动态代理,因为静态代理的功能是给现有服务的接口加上前置执行和后知执行
基本的模式是【before()；静态接口()；after()】,静态代理缺点就是接口需要提前存在。现在把静态接口()抽象出一层，所有的接口其实都是method
这样就变成【before()；method()；after()】这样就不需要在开始的时候就存在接口(java自带的动态代理需要实现相同接口,cglib不需要)，SpringAop或者说整个Spring都是用了动态代理的逻辑。
#### 原型模式
##### 1.什么是原型模式
##### 2.什么时候使用原型模式
##### 3.UML类图
![]()
##### 4.JAVA实现
```java
```
##### 5.其他

#### 中介者模式
##### 1.什么是中介者模式
##### 2.什么时候使用中介者模式
##### 3.UML类图
![]()
##### 4.JAVA实现
```java
```
##### 5.其他

#### 命令模式
##### 1.什么是命令模式
##### 2.什么时候使用命令模式
##### 3.UML类图
![]()
##### 4.JAVA实现
```java
```
##### 5.其他

#### 责任链模式
##### 1.什么是责任链模式
##### 2.什么时候使用责任链模式
##### 3.UML类图
![]()
##### 4.JAVA实现
```java
```
##### 5.其他

#### 装饰模式
##### 1.什么是装饰模式
##### 2.什么时候使用装饰模式
##### 3.UML类图
![]()
##### 4.JAVA实现
```java
```
##### 5.其他

#### 策略模式
##### 1.什么是策略模式
##### 2.什么时候使用策略模式
##### 3.UML类图
![]()
##### 4.JAVA实现
```java
```
##### 5.其他

#### 适配器模式
##### 1.什么是适配器模式
##### 2.什么时候使用适配器模式
##### 3.UML类图
![]()
##### 4.JAVA实现
```java
```
##### 5.其他

#### 迭代器模式
##### 1.什么是迭代器模式
##### 2.什么时候使用迭代器模式
##### 3.UML类图
![]()
##### 4.JAVA实现
```java
```
##### 5.其他

#### 组合模式
##### 1.什么是组合模式
##### 2.什么时候使用组合模式
##### 3.UML类图
![]()
##### 4.JAVA实现
```java
```
##### 5.其他

#### 观察者模式
##### 1.什么是观察者模式
##### 2.什么时候使用观察者模式
##### 3.UML类图
![]()
##### 4.JAVA实现
```java
```
##### 5.其他

#### 门面模式
##### 1.什么是门面模式
##### 2.什么时候使用门面模式
##### 3.UML类图
![]()
##### 4.JAVA实现
```java
```
##### 5.其他

#### 备忘录模式
##### 1.什么是备忘录模式
* 备忘录模式，是指一种可以回退到初始化数据的模式。(在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，之后就可以将该对象恢复到状态保存的时候)
##### 2.什么时候使用备忘录模式
* 需要保存和恢复数据的相关状态场景
* 提供回滚
* jdbc的事务管理就是备忘录模式
* 分析备份数据
##### 3.UML类图
* 场景:一个男孩拥有回到过去的能力，可以反复的追求一个妹子。男孩在靠近一个妹子前先打点记录当前的状态，如何一顿穷追猛打，惨遭失败后，回到记录之前，再来一次。
* UML图：
![](http://www.plantuml.com/plantuml/png/dP3D2i9038Jl-nGvMgHz12bwzjGdY6kenVqfIIg8-EvIxFQdeWTF0z-mCxCfHP6ryyvOXoAmZtTuc1nQRcwe19Lo4seGHIMpXROxkSQ2lM2egUhX9fjmJVh19B5vqiotJAXq94z1u_mXasZaqHaK_5ipynmM9-FRwh_cfV03CYbUYHVngosBXi5RTVpuHN_nejYbK3DLnZmVQKdXt7dt0W00)
##### 4.JAVA实现
```java
@Data
public class Boy {
    private String state ="";

   public Memento createMento(){
       return new Memento(this.state);
   }
    public void restoreMento(Memento memento){
         this.state=memento.getState();
    }
}
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Memento {
    private String state ="";
}
@Data
public class Caretaker {
    private Memento memento;
}
public class Client {
    public static void main(String[] args) {
        Boy boy=new Boy();
        Caretaker caretaker=new Caretaker();
        boy.setState("开心");
        System.out.println(boy.getState());
        caretaker.setMemento(boy.createMento());
        boy.setState("失败了,难过");
        System.out.println(boy.getState());
        boy.restoreMento(caretaker.getMemento());
        System.out.println(boy.getState());
    }
}
```
##### 5.其他
其一使用clone融合备忘录角色和发起类(Boy)。其二多状态模式就是多个state。其三多备份就是管理多个快照。其四为了使内置类不被外部使用到，可以让备忘录管理者管理接口(Imemento)，正式的实现使用内部实现(Memento)
#### 访问者模式
##### 1.什么是访问者模式
封装一些作用于某种数据结构中的各元素的操作，它可以在不改变数据结构的前提下定义作用于这些元素的新操作
##### 2.什么时候使用访问者模式
业务规则需要遍历不同的对象，这些对象属于同一对象结构。遍历多个不同的对象,然后执行不同的操作，也就是针对访问的对象不同，执行不同的操作。
##### 3.UML类图
* UML图：
![](http://www.plantuml.com/plantuml/png/ZP7DJiGW483lFCKSQSoIo0EOJOm7JnusyKwdes8eR63efVhkijqkLJOQJy1yasz-s2SsaVFeXFLCySKWmUEpJPP3X5dSm37tpY9CmGumdUBoFdYCnFJWQ2JFjq3bqlqdLI-fkXEVGg0pAS5MgOQU-dT2Fd3Cd2Dzxs6rG56QwfIRhIQqVG_X44RYD-jVvQbHqoUE1lbC3I8TMTQff_DPlAlsQk3vDwGNT14fzN5NbockBBjTmUkhfVedRNQYr8Ok_YNOrlYJQh4dFvIl_m80)
##### 4.java实现
```java
public abstract class Element {
    public void dosome(){

    }
    abstract void accept(Ivisitor ivisitor);
}
public class ConcreteElementOne extends Element {
    void accept(Ivisitor ivisitor) {
        ivisitor.visit(this);
    }
    @Override
    public void dosome() {
        System.out.println(1);
    }
}
public class ConcreteElementTwo extends Element {
    void accept(Ivisitor ivisitor) {
        ivisitor.visit(this);
    }

    @Override
    public void dosome() {
        System.out.println(2);
    }
}
public interface Ivisitor {
    void visit(ConcreteElementOne concreteElementOne);
    void visit(ConcreteElementTwo concreteElementTwo);
}
public class ObjectStruture {
    public  static Element createElem(){
        Random random=new Random();
        int a=random.nextInt(100);
        if (a>50){
            return new ConcreteElementOne();
        }else {
            return new ConcreteElementTwo();
        }
    }
}
public class Visitor implements Ivisitor {
    public void visit(ConcreteElementOne concreteElementOne) {
        concreteElementOne.dosome();
    }

    public void visit(ConcreteElementTwo concreteElementTwo) {
        concreteElementTwo.dosome();
    }
}
public class Client {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            Element e=ObjectStruture.createElem();
            e.accept(new Visitor());
        }
    }
}
```
##### 5.其他
只要切换Visitor，可以很方便的改变样式；多访问者,IShowVisitor和ITotalVisitor继承IVisitor；这个和java的双分派有关，重载是静态，重写是动态

#### 状态模式
##### 1.什么是状态模式
##### 2.什么时候使用状态模式
##### 3.UML类图
##### 4.JAVA实现
```java
```
##### 5.其他

#### 解释器模式
##### 1.什么是解释器模式
##### 2.什么时候使用解释器模式
##### 3.UML类图
![]()
##### 4.JAVA实现
```java
```
##### 5.其他

#### 享元模式
##### 1.什么是享元模式
##### 2.什么时候使用享元模式
##### 3.UML类图
![]()
##### 4.JAVA实现
```java
```
##### 5.其他

#### 桥梁模式
##### 1.什么是桥梁模式
##### 2.什么时候使用桥梁模式
##### 3.UML类图
![]()
##### 4.JAVA实现
```java
```
##### 5.其他
  
