| Ⅰ | Ⅱ | Ⅲ |
| :--------: | :--------: | :--------: |
| 语言:coffee:| 项目:computer:| 设计:bulb:|
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
单例模式只有一个自己的类，可以选择饿汉模式和懒汉模式
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

#### 工厂模式
##### 1.什么是工厂模式
##### 2.什么时候使用工厂模式
##### 3.UML类图
##### 4.JAVA实现
##### 5.其他

#### 抽象工厂模式
##### 1.什么是抽象工厂模式
##### 2.什么时候使用抽象工厂模式
##### 3.UML类图
##### 4.JAVA实现
##### 5.其他

#### 模版方法模式
##### 1.什么是模版方法模式
##### 2.什么时候使用模版方法模式
##### 3.UML类图
##### 4.JAVA实现
##### 5.其他

#### 建造者模式
##### 1.什么是建造者模式
##### 2.什么时候使用建造者模式
##### 3.UML类图
##### 4.JAVA实现
##### 5.其他

#### 代理模式
##### 1.什么是代理模式
##### 2.什么时候使用代理模式
##### 3.UML类图
##### 4.JAVA实现
##### 5.其他

#### 原型模式
##### 1.什么是原型模式
##### 2.什么时候使用原型模式
##### 3.UML类图
##### 4.JAVA实现
##### 5.其他

#### 中介者模式
##### 1.什么是中介者模式
##### 2.什么时候使用中介者模式
##### 3.UML类图
##### 4.JAVA实现
##### 5.其他

#### 命令模式
##### 1.什么是命令模式
##### 2.什么时候使用命令模式
##### 3.UML类图
##### 4.JAVA实现
##### 5.其他

#### 责任链模式
##### 1.什么是责任链模式
##### 2.什么时候使用责任链模式
##### 3.UML类图
##### 4.JAVA实现
##### 5.其他

#### 装饰模式
##### 1.什么是装饰模式
##### 2.什么时候使用装饰模式
##### 3.UML类图
##### 4.JAVA实现
##### 5.其他

#### 策略模式
##### 1.什么是策略模式
##### 2.什么时候使用策略模式
##### 3.UML类图
##### 4.JAVA实现
##### 5.其他

#### 适配器模式
##### 1.什么是适配器模式
##### 2.什么时候使用适配器模式
##### 3.UML类图
##### 4.JAVA实现
##### 5.其他

#### 迭代器模式
##### 1.什么是迭代器模式
##### 2.什么时候使用迭代器模式
##### 3.UML类图
##### 4.JAVA实现
##### 5.其他

#### 组合模式
##### 1.什么是组合模式
##### 2.什么时候使用组合模式
##### 3.UML类图
##### 4.JAVA实现
##### 5.其他

#### 观察者模式
##### 1.什么是观察者模式
##### 2.什么时候使用观察者模式
##### 3.UML类图
##### 4.JAVA实现
##### 5.其他

#### 门面模式
##### 1.什么是门面模式
##### 2.什么时候使用门面模式
##### 3.UML类图
##### 4.JAVA实现
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
##### 5.其他

#### 解释器模式
##### 1.什么是解释器模式
##### 2.什么时候使用解释器模式
##### 3.UML类图
##### 4.JAVA实现
##### 5.其他

#### 享元模式
##### 1.什么是享元模式
##### 2.什么时候使用享元模式
##### 3.UML类图
##### 4.JAVA实现
##### 5.其他

#### 桥梁模式
##### 1.什么是桥梁模式
##### 2.什么时候使用桥梁模式
##### 3.UML类图
##### 4.JAVA实现
##### 5.其他
  
