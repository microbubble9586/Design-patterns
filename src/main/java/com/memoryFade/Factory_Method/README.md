#方法工厂
##类图
图解设计模式P38
##角色
分为框架和具体加工
###Product 产品
产品角色位于框架侧，属于抽象类，定义了工程方法模式中生成实例所持有的API，但是具体的处理由子类ConcreteProduct来处理
###Creator 创建者
框架侧，负责生产product的抽象类，具体处理由子类ConcreteCreator角色处理
###ConcreteProduct 具体产品
###ConcreteCreator 具体创建者