# stock.simon
java stock 小实例

## 测试方法
运行Test.java  

## 包/文件说明
1. com.xingxunlei.bean  
行情数据相关bean  

    1.1 Stock.java  
    股票行情数据bean
    
2. com.xingxunlei.connector  
查询行情数据的接口以及实现  

    2.1 StockConnector.java  
    行情数据查询接口  
    
    2.2 com.xingxunlei.connector.sina  
    新浪行情数据查询接口包目录
    
    2.2.1 SinaConnector
    新浪行情数据查询接口实现类
    
3. com.xingxunlei.util  
查询行情数据所需的一些工具类  

    3.1 HttpUtils.java  
    HttpClient工具类 
    
    3.2 StockUtils.java  
    新浪行情数据查询接口实现
    
## 依赖jar包
1. commons-codec-1.7.jar
2. commons-httpclient-3.0.1.jar
3. commons-io-1.4.jar
4. commons-lang-2.5.jar
5. commons-logging-1.1.1.jar

在使用中有任何问题，欢迎反馈给我，可以用以下联系方式跟我交流

* 邮件(xingxunlei@126.com)