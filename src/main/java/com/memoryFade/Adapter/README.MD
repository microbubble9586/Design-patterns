#适配器模式
在程序中总是存在无法直接使用的程序，需要做适当的转换才可以使用。这种用于填补“现有的程序”和“所需的程序”之间差异的设计模式就是**适配器模式**
##实现方式
- 类适配器模式(使用继承)
- 对象适配器模式(使用委托)
##角色

###Target(对象)
该角色负责定义所需的方法 
###Client(请求者)
该角色负责使用Target角色所定义的方法进行具体处理
###Adaptee(被适配)
是一个持有既定方法的角色
###Adapter(适配)
使用adaptee角色的方法来满足target角色的需求
可通过继承或使用内部属性委托的方式