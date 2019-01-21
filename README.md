| Ⅰ | Ⅱ | Ⅲ | Ⅳ | Ⅴ |Ⅵ |Ⅶ|Ⅷ|Ⅸ|Ⅹ|Ⅺ|
| :--------: | :--------: | :--------: | :--------: |:--------: |:--------: |:--------: |:--------: |:--------: |:--------: |:--------: |
|算法:scissors:| 语言:books:| 数据库:floppy_disk:| 中间件:wrench:| 设计:pencil2:| 项目:office:| 想法:stars:| 大数据:1234:| 代码解析:100:| 工作记录:scroll:| 杂记:smoking: |
## :scissors: 算法
## :books: 语言
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
### java虚拟机
#### java内存区域与内存溢出异常
#### 垃圾收集器与内存分配策略
#### 虚拟机性能监控与故障处理工具
#### 调优案例分析与实战
#### 类文件结构
#### 虚拟机类加载机制
#### 虚拟机字节码执行引擎
#### 类加载及执行子系统的案例与实战
#### 早期(编译期)优化
#### 晚期(运行期)优化
#### java内存模型与线程
#### 线程安全与锁优化
## :floppy_disk: 数据库
## :wrench: 中间件

### canal从入门到放弃到继续入门
#### 前言
canal的定位是基于数据库增量日志解析，提供增量数据订阅&消费，目前主要支持了mysql。canal的作用会在后续的章节进行详细描述，这一节主要讲明白为什么先写canal，会后续的章节的综述。canal的功能强大，
代码逻辑在各个中间件中属于比较容易的。通过学习canal的使用和源码，不仅仅能在开发过程中提供另外设计的思路，更能在学习源码的过程中提高自己代码水平，可以说这是码龄3年内程序员最好的选择。后续的内容我主要从三个方向
区讲述canal。一是canal的使用，canal有哪些功能，生产环境canal是如何发挥功效的，开发人员又是如何使用的，二是canal大体的工作原理，三是canal的源码解析，包括一些实体类的作用和框架。主要的逻辑就是从宏观到微观。
#### 简单使用
##### 单机部署
###### 架构
###### 配置架构
###### 代码示例
##### 集群部署-server主备
###### 架构
###### 配置架构
###### 代码示例
##### 集群部署-client主备
###### 架构
###### 配置架构
###### 代码示例
##### 内嵌canal使用
###### 架构
###### 配置架构
###### 代码示例
##### 配置详解
#### 工作原理
##### canal的工作原理
##### EventParser设计
##### EventSink设计
##### EventStore设计
##### Instance设计
##### Server设计
##### 增量订阅/消费设计
##### HA机制设计
#### 源码解析
##### 
#####
#####
#####
#####
#####
#####
#####
#####
#####
### kafka
## :pencil2: 设计
### 设计模式
 [设计模式](https://github.com/zhouluoyang0406/SelfIntroduction/blob/master/DesignPatterns/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F.md)
### 重构:改善既有代码的设计
#### 什么是重构？
#### 为什么需要重构？
#### 怎么重构？
#### 重构案例
#### 重构原则
#### 代码的坏味道
#### 重构列表
#### 重新组织函数
#### 在对象之间搬移特性
#### 重新组织数据
#### 简化条件表达式
#### 简化函数表达式
#### 处理概括关系
#### 大型重构
#### 重构，复用和现实
#### 重构工具





## :office: 项目
## :stars: 想法
## :1234: 大数据
## :100: 代码解析
## :scroll: 工作记录
## :smoking: 杂记
