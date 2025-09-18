



## 组合模式
### 概念
在 GoF 的《设计模式》一书中，组合模式是这样定义的：
```
Compose objects into tree structure to represent part-whole hierarchies. Composite lets client treat individual objects 
and compositions of objects uniformly.
```
将一组对象组织（compose)成树形结构，以表示一种"部分-整体"的层次结构。组合让客户端（在很多设计模式书籍中，"客户端"代指代码的使用者。)可以统一单个
对象和组合对象的处理逻辑。

这种组合模式的设计思路，与其说是一种设计模式，倒不如说是对业务场景的一种数据结构和算法的抽象。其中，数据可以表示成树这种数据结构，业务需求可以通过在
树上的递归遍历算法来实现。


### 应用场景
数据可以组织成树形结构。比如：电脑文件系统、公司/团体/国家/行政区域等组织结构
