### serializabledemo
### 主要是实现Serializable接口，从而序列化。
### 技术点
1. 通过ObjectOutputStream和ObjectInputStream序列化和反序列化class。
2. 通过transient关键字修饰变量，通过writeObject()和readObject()对此变量的序列化
3. 实现Externalizable接口，从而自定义控制整个序列化过程。它的原理是利用默认构造器实例化对象，再给属性赋值。
4. 通过在类里面的readResolve()方法，从而在整个序列的过程中，保持单例。即你只想序列化之前和序列化之后是一模一样的对象，那可以在readResolve()返回序列化之前的那个对象。它的原理是在反序列化的过程中，直接调用此方法，而不用调用其他方法，从而返回序列化之前一模一样的对象。