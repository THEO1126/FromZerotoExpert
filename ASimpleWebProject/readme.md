# 快捷

遍历map集合 **iter**

```
for (String s : map.keySet()) {
    
}
```

输出 **sout**

```
System.out.println("");
```

# 1、一个最简单的web页面

🧷 [从0设计一个web项目-跟着帅地玩转校招，拿捏大厂offerPlayOffer](https://www.playoffer.cn/253.html)

## 1.1 创建远程仓库

略🤡

## 1.2 一个最简单的web页面

平时我们学习一门语言的时候，最简单的一个程序就是在控制台打印一行 hello world，在我们的 web 服务里，一个最简单的 web 服务就是当我们在浏览器输入`http://localhost/FromZerotoExpert` 这个网址时，展示一个页面，这个页面有如下文字：嗨，欢迎您来到 from zero to expert.

如果你可以成功展示这个页面，你就完成了最重要的一步了，那就是你的 web 服务创建成功了，接下来我们就可以不停着来丰富我们的服务了。

所以第二个任务，是最简单亦或最难，也是最重要的一步，创建一个 web 服务，在浏览器输入`http://localhost/FromZerotoExpert`这个地址后，出现一个 html 页面，页面展示 **嗨，欢迎您来到 from zero to expert.**。

**学习指南**：技术选型优先级：springboot=>spring=>servlet，如果这些都没有学习过，说明你 web 0 基础，那么请按照这个技术栈学习：hmtl=>css=>javascript=>servlet，学完servlet，即可完成。

**资料推荐**：如果你不是永久会员，我给你找了B站黑马的javaweb：[Javaweb入门](https://www.bilibili.com/video/BV1Qf4y1T7Hx)。先跳过mysql+jdbc的学习，直接学习**maven(P41~P45)**，学完从hmtl(P61)开学学到servlet的 P108 结束。那么你就成功入门了。当然，你要重头看到尾也行，因为随着学习进度，mysql等这些也是 要学的。

📌 **任务：**

开始时间：2022年10月24日

**maven**：(P42~P46) ✅

**hmtl(P61)-servlet的 P108**：P61-P108 ✅ 

完成时间：2022年10月28日

### 1.2.1 maven下载与环境配置

- 配置环境

![image-20221025163856883](C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221025163856883.png)

![image-20221025163908705](C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221025163908705.png)

![image-20221025163925491](C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221025163925491.png)

 教程：https://blog.csdn.net/u012660464/article/details/114113349

- **下载：**

🧷 使用meavn3.6.3版本，高版本不兼容会报错 

> 链接：https://pan.baidu.com/s/12SuxtOXiUhNgkb0DH1eyCw
> 提取码：gnaf

- **修改配置文件的本地仓库地址**

![image-20221025164037287](C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221025164037287.png)

- **添加阿里云镜像**

  D:\program\Java\repository\apache-maven-3.6.3\conf\settings.xml

  ```xml
  <mirror>
      <id>alimaven</id>
      <name>aliyun maven</name>
      <url>
          http://maven.aliyun.com/nexus/content/groups/public/
      </url>
      <mirrorOf>central</mirrorOf>        
  </mirror>
  ```

  <img src="C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20220609112753903.png" alt="image-20220609112753903" style="zoom:67%;" />

### 1.2.2 配置Tomcat运行项目

#### Tomcat基本使用

**Tomcat**

教程：https://blog.csdn.net/zzvar/article/details/114896761、

下载：[Apache Tomcat® - Apache Tomcat 10 Software Downloads](https://tomcat.apache.org/download-10.cgi)

>链接：https://pan.baidu.com/s/1CONf8KVXM4gyJj4pxjFBkA
>提取码：rb0t

启动Tocat

> **打开 starup.bat**  路径： D:\program\Java\repository\apache-tomcat-9.0.43\bin\starup.bat
>
> <img src="C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221027104643131.png" alt="image-20221027104643131" style="zoom:50%;" />

**关闭Tomcat**

> 强制关闭：直接 x 窗口
>
> 正常关闭 ：bin\shutdown.bat 或 ctrl + c





**乱码解决方式：**

>  打开 D:\program\Java\repository\apache-tomcat-9.0.43\conf\logging.properties
>
> 更改编码方式   `java.util.logging.ConsoleHandler.encoding = GBK
>
> ![image-20221027105107007](C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221027105107007.png)

**访问localhost:8080**

<img src="C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221027104717822.png" alt="image-20221027104717822" style="zoom:50%;" />



#### Tomcat配置和部署项目

- 修改端口号

  conf/server.xml

  ![image-20221027115519168](C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221027115519168.png)

- 启动可能出现的问题

  1. 端口号冲突：找到对应程序，将其关闭
  2. 启动器一闪而过，重新检查JAVA_HOME是否配置正确
  3. Tomcat部署项目

- Tomcat部署项目

  - 将项目放置到webapps目录下，即部署完成

  - 一般项目会被打包成war包，将war包放在webapps目录下，Tomcat会自动解压war文件



#### IDEA构建Maven Web项目

**方法一：使用骨架**

- 项目结构

![image-20221027120605660](C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221027120605660.png)

- 创建Maven Web项目

<img src="C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221027121122418.png" alt="image-20221027121122418" style="zoom:80%;" />

<img src="C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221027121330176.png" alt="image-20221027121330176" style="zoom:80%;" />

- 手动创建Java目录和resources目录

![image-20221027122344023](C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221027122344023.png)

**方法二：不使用骨架**

![image-20221027122643438](C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221027122643438.png)

#### IDEA中使用Tomcat

- 添加配置

<img src="C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221027121701575.png" alt="image-20221027121701575" style="zoom:80%;" />

<img src="C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221027121744542.png" alt="image-20221027121744542" style="zoom:80%;" />

<img src="C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221027121823100.png" alt="image-20221027121823100" style="zoom:80%;" />

![image-20221027121858025](C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221027121858025.png)

![image-20221027122018174](C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221027122018174.png)

- 修改默认访问路径

  ![image-20221027123244931](C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221027123244931.png)

<img src="C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221027123340206.png" alt="image-20221027123340206" style="zoom: 67%;" />

### 1.2.3 Tomcat Maven插件

![image-20221027123942130](C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221027123942130.png)

### 1.2.4 pom.xml导入jar包

maven 仓库路径：`D:\program\Java\repository\apache-maven-3.6.3\lib`

**方法一：使用aliyun仓库 **✅

📝 [仓库服务 (aliyun.com)](https://developer.aliyun.com/mvn/search)   

<img src="C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221025154226588.png" alt="image-20221025154226588" style="zoom: 67%;" />

**方法二：使用IDEA自带的Maven**

📝 [(170条消息) 【Maven】org.codehaus.plexus.component.repository.exception.ComponentLookupException_幽灵雾的博客-CSDN博客](https://u05-kid.blog.csdn.net/article/details/126104959)

### 1.2.5 导入其他Maven项目

<img src="C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221025170823282.png" alt="image-20221025170823282" style="zoom:67%;" />

# 知识点

## 1、jar包和war包区别

**jar**是java普通项目打包，通常是开发时要引用通用类，打成jar包便于存放管理。当你使用某些功能时就需要这些jar包的支持，需要导入jar包。

**war**是java web项目打包，web网站完成后，打成war包部署到服务器，目的是为了节省资源，提供效率。

## 2、Maven命令和声明周期

- **命令**

`shift+鼠标右键` 打开shell窗口

`mvn clean`删除target文件夹

`mvn package` 命令 打包jar包或war包，是java项目则jar包，web项目则war包

`mvn install` 将但前项目安装到本地仓库

- **声明周期**

  同一个声明周期，执行后边的命令，前边所有的命令都会自动执行

  ![image-20221025165336288](C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221025165336288.png)

## 3、Maven项目依赖范围

📝 [maven依赖范围 - 知乎 (zhihu.com)](https://zhuanlan.zhihu.com/p/129733579)

- **编译依赖范围（compile）**

  该范围就是默认依赖范围，**此依赖范围对于编译、测试、运行三种classpath都有效。**举个简单的例子，假如项目中有spring-core的依赖，那么spring-core不管是在编译，测试，还是运行都会被用到，因此spring-core必须是编译范围（构件**默认的是编译范围**，所以依赖范围是编译范围的无须显示指定）

- **测试依赖范围（test）**

  顾名思义就是针对于测试的，使用此依赖范围的依赖，**只对测试classpath有效**，在编译主代码和项目运行时，都将无法使用该依赖。最典型的例子就是 Junit,，构件在测试时才需要，所以它的依赖范围是测试，因此它的依赖范围需要显示指定为<scope>test</scope> ，当然不显示指定依赖范围也不会报错，但是该依赖会被加入到编译和运行的classpath中，造成不必要的浪费 。

- **运行时依赖范围（runtime）**

  使用该依赖范围的maven依赖，**只对测试和运行的classpath有效**，对编译的classpath无效，典型例子就是JDBC的驱动实现，项目主代码编译的时候只需要JDK提供的JDBC接口，只有在测试和运行的时候才需要实现上述接口的具体JDBC驱动。

- **已提供依赖范围（provided）**

  使用该依赖范围的maven依赖，**只对编译和测试的classpath有效，对运行的classpath无效。**典型的例子就是servlet-api， 编译和测试该项目的时候需要该依赖，但是在运行时，web容器已经提供的该依赖，所以运行时就不再需要此依赖，如果不显示指定该依赖范围，并且容器依赖的版本和maven依赖的版本不一致的话，可能会引起版本冲突，造成不良影响。

- 系统依赖范围（system）

  该依赖与classpath的关系**与provided依赖范围完全一致**，但是系统依赖范围**必须通过配置systemPath元素来显示指定依赖文件的路径**，此类依赖不是由maven仓库解析的，而且往往与本机系统绑定，可能造成构件的不可移植，因此谨慎使用，systemPath元素可以引用环境变量.

  ```xml
  <dependency>
      <groupId>javax.sql</groupId>
      <artifactId>jdbc-stext</artifactId>
      <version>2.0</version>
      <scope>system</scope>
      <systemPath>${java.home}/lib/rt.jar</systemPath> 
  </dependency>
  ```

- **导入依赖范围（import）**

  该依赖范围不会对三种classpath产生影响，该依赖范围只能与dependencyManagement元素配合使用，其功能为**将目标pom文件中dependencyManagement的配置导入合并到当前pom的dependencyManagement中**。

# Servlet

## Servlet简介&快速入门

<img src="C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221027133724217.png" alt="image-20221027133724217" style="zoom:80%;" />

基本概念：

- Servlet 是 Java 提供的一门动态web资源开发技术
- Servlet 是JavaEE 规范之一，其实就是一个接口，将来我们需要定义 Servlet 类实现 Servlet 接口，并由服务器运行 Servlet 

1.  创建web项目，导入Servlet 依赖坐标，刷新Maven

```xml
  <dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>javax.servlet-api</artifactId>
    <version>3.1.0</version>
    <scope>provided</scope>
  </dependency>
```

2. 定义一个类，实现Servlet接口，并重写接口中的所有方法，并在service方法中输入一句话

```java
public class ServletDemo1 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
    }
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("嗨，欢迎您来到 from zero to expert.");
    }
    @Override
    public String getServletInfo() {
        return null;
    }
    @Override
    public void destroy() {
    }
}
```

3. 配置：在类上使用@WebServlet注解，配置该Servlet的访问路径

   控制台输出：嗨，欢迎您来到 from zero to expert.

   ```java
   @WebServlet("/demo1")
   public class ServletDemo1 implements Servlet{
   }
   ```

4. 启动访问 http://localhost:8080/FromZerotoExpert/demo1

   控制台输出：嗨，欢迎您来到 from zero to expert.

## Servlet执行流程&生命周期

Servlet运行在servlet容器(web服务器)中，其生命周期由容器来管理，分为4个阶段:

1. **加载和实例化:** 默认情况下，当Servlet第一次被访问时，由容器创建servlet对象
2. **初始化:** 在servlet实例化之后，容器将调用Servlet的**init()**方法初始化这个对象，完成一些如
   加载配置文件、创建连接等初始化的工作。该方法**只调用一次**
3. **请求处理:** 每次请求servlet时，Servlet容器都会调用servlet的**service()**方法对请求进行处理。
4. **服务终止:** 当需要释放内存或者容器关闭时，容器就会调用Sservlet实例的destroy()方法完成
   资源的释放。在**destroy()**方法调用之后，容器会释放这个Servlet实例，该实例随后会被Java的垃圾收集器所回收，方法调用一次

`@WebServlet(urlPatterns = "/demo1",loadOnStartup = 1)`

负整数：第一次被访问时创建Servlet对象

0或正整数：服务器启动时创建Servlet对象，数字越小优先级越高



## Servlet方法介绍&体系结构

### 方法介绍

- 初始化方法init()

  ```java
  public void init(ServletConfig servletConfig) throws ServletException {
      this.config=servletConfig;
      System.out.println("init...");
  }
  ```

- 提供服务方法，每次Servlet被访问，都会调用该方法

  ```Java
  public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
      System.out.println("嗨，欢迎您来到 from zero to expert.");
  }
  ```

- 销毁方法，当Servlet被销毁时，调用该方法，在内存释放或服务器关闭时销毁Servlet

  ```java
  public void destroy() {
      System.out.println("destory...");
  }
  ```

- 获取ServletConfig对象

  ```java
  private ServletConfig config;
  public ServletConfig getServletConfig() {
      return config;
  }
  ```

- 获取Servlet信息

  ```java
  public String getServletInfo() {
      return null;
  }
  ```

### 体系结构

- **Servlet接口**

  Servlet 体系根接口

- **GenericServlet  抽象类**

  1. GenericServlet是一个通用的协议无关的Servlet，它实现了Servlet和ServletConfig接口。

  2. GenericServlet继承自Servlet，应该重写service()方法。

- **HttpServlet类**

  HttpServlet指能够处理HTTP请求的Servlet，它在原有Servlet接口上添加了对HTTP协议的处理，它比Servlet接口的功能更为强大。

 🌰 **HttpServlet类例子** 

ServletDemo2.java

```Java
@WebServlet("/demo2")
public class ServletDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get...");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post...");
    }
}
```

test.html

get请求：直接访问 http://localhost:8080/FromZerotoExpert/demo2   

post 请求：

1. 访问页面  http://localhost:8080/FromZerotoExpert/test.html

2. 点击提交按钮后跳转至   http://localhost:8080/FromZerotoExpert/demo2   

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>test</h1>
<form action="/FromZerotoExpert/demo2" method="post">
    <input name="username"><input type="submit">
</form>
</body>
</html>
```

<img src="C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221027214455068.png" alt="image-20221027214455068" style="zoom: 80%;" />

<img src="C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221027214946643.png" alt="image-20221027214946643" style="zoom:67%;" />

### 获取不同的请求方法

根据请求方法的不同，进行分别的处理  ：

```java
public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
    HttpServletRequest request=(HttpServletRequest) servletRequest;
    // 1. 获取请求方式
    String method = request.getMethod();
    // 2. 判断
    if("GET".equals(method)){
        // get方式的处理逻辑
    }else if("POST".equals(method)){
        // post方法的处理逻辑
    }
}
```

创建自己的类 MyHttpServlet.java  ：

```java
public class MyHttpServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
    }
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        // 1. 获取请求方式
        String method = request.getMethod();
        // 2. 判断
        if("GET".equals(method)){
            // get方式的处理逻辑
            doGet(servletRequest,servletResponse);
        }else if("POST".equals(method)){
            // post方法的处理逻辑
            doPost(servletRequest,servletResponse);
        }
    }
    // protected 是为了让派生类能重写父类方法
    protected void doPost(ServletRequest servletRequest, ServletResponse servletResponse) {
    }
    protected void doGet(ServletRequest servletRequest, ServletResponse servletResponse) {
    }
    @Override
    public String getServletInfo() {
        return null;
    }
    @Override
    public void destroy() {
    }
}
```

创建 MyHttpServlet的派生类ServletDemo3，并重写doGet() 和 doPost() ：

```java
public class ServletDemo3 extends MyHttpServlet {
    @Override
    protected void doGet(ServletRequest servletRequest, ServletResponse servletResponse) {
        System.out.println("get...");
    }
    @Override
    protected void doPost(ServletRequest servletRequest, ServletResponse servletResponse) {
        System.out.println("post...");
    }
}
```

### Servlet urlPattern配置

Servlet要想被访问，必须配置起访问路径（rulPattern）

1. 一个Servlet，可以配置多个urlPattern

   `@WebServlet(urlPatterns = {"/demo1","/demo2"})`

2. urlPattern配置规则

   1. 精确匹配

      - 配置路径：@WebServlet(urlPatterns = "user/select")
      - 访问路径：http://localhost:8080/FromZerotoExpert/user/select

   2. 目录匹配

      - 配置路径：@WebServlet(urlPatterns = "user/*")

      - 访问路径：http://localhost:8080/FromZerotoExpert/user/aaa

        ​					http://localhost:8080/FromZerotoExpert/user/bbb

   3. 扩展名匹配

      - 配置路径：@WebServlet(urlPatterns = "*.do")

        > @WebServlet(urlPatterns = "/*.do") 是错误的，不可以加 ' / ' 符号

      - 访问路径：http://localhost:8080/FromZerotoExpert/aaa.do

        ​					http://localhost:8080/FromZerotoExpert/bbb.do

   4. 任意匹配

      - 配置路径 ：

        @WebServlet(urlPatterns = "/") 

        @WebServlet(urlPatterns = "/*") 

      - 访问路径：

        http://localhost:8080/FromZerotoExpert/abcd

        http://localhost:8080/FromZerotoExpert/sasf

      - / 和 /* 的区别

        - 当项目中的Servlet配置了 "/" 会覆盖tomcat中的DefaultServlet，当其他的url-Pattern 都匹配不上时就会走这个Servlet
        - 当我们的项目中配置了 "\*" ，意味着匹配任意访问路径

## Request&Response

- Request 获取请求数据

- Response 设置响应数据

```java
@WebServlet("/requestdemo")
public class RequestDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 使用 request 对象 获取请求数据
        String name = req.getParameter("name"); //url?name=zhangsan

        // response 设置响应数据
        // 设置响应头
        resp.setHeader("content-type","text/html;charset=utf-8");
        // 设置响应消息请求数据
        resp.getWriter().write("<h1>"+name+"欢迎你！</h1>");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post...");
    }
}
```

访问 http://localhost:8080/FromZerotoExpert/requestdemo?name=蔡徐坤

<img src="C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221027230103890.png" alt="image-20221027230103890" style="zoom:67%;" />



### Request继承体系

- ServletRequest 

  Java提供请求的对象根接口

- HttpServletRequest 

  Java提供到的对Http协议封装的请求对象接口，继承自ServletRequest

- RequestFacade

  Tomcat定义的实现类

1. Tomcat 需要解析请求数据，封装为request对象，并且创建request对象传递到service方法中
2. 使用request对象，查阅JavaEE Api文档的HttpServletRequest 接口

### Request获取请求数据

请求数据有三部分

1. **请求行：**
   - String getMethod() : 获取请求方式：GET
   - String getContextPath() ：获取虚拟目录（项目访问路径）：/FromZerotoExpert
   - StringBuffer getRequestURL()：获取URL（统一资源定位符）：http://localhost:8080/FromZerotoExpert/requestdemo
   - String getRequestURI() ：获取URI（统一资源标识符）：/FromZerotoExpert/requestdemo
   - String getQueryString() ：获取请求参数（GET方式）：username=zhangsan&password=123

```java
@WebServlet("/requestdemo2")
public class RequestDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        - String getMethod() : 获取请求方式：GET
        String method=req.getMethod();
        System.out.println(method);
//        - String getContextPath() ：获取虚拟目录（项目访问路径）：/FromZerotoExpert
        String contextPath=req.getContextPath();
        System.out.println(contextPath);
//        - StringBuffer getRequestURL()：获取URL（统一资源定位符）：http://localhost:8080/FromZerotoExpert/requestdemo
        StringBuffer url=req.getRequestURL();
        System.out.println(url);
//        - String getRequestURI() ：获取URI（统一资源标识符）：/FromZerotoExpert/requestdemo
        String uri=req.getRequestURI();
        System.out.println(uri);
//        - String getQueryString() ：获取请求参数（GET方式）：username=zhangsan&password=123
        String queryString = req.getQueryString();
        System.out.println(queryString);

//       - String getHeader(String name)：根据请求头名称，获取值
        String agent = req.getHeader("user-agent");
        System.out.println(agent);
//       - ServletInputStream getIuputStream() ：获取字节输入流

//       - BufferedReader getReader() ：获取字符输入流
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取post：请求体：请求参数
        // 1. 获取字符输入流
           // - BufferedReader getReader() ：获取字符输
        BufferedReader br= req.getReader();
        // 2. 读取数据
        String line = br.readLine();
        System.out.println(line);
    }
}
```

访问：http://localhost:8080/FromZerotoExpert/requestdemo2?name=zhangsan

后台输出：

```
GET
/FromZerotoExpert
http://localhost:8080/FromZerotoExpert/requestdemo2
/FromZerotoExpert/requestdemo2
name=zhangsan
```

2. **请求头**

   Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/107.0.0.0 Mobile Safari/537.36

   - String getHeader(String name)：根据请求头名称，获取值

3. **请求体**

   username=zhangsan&password=123

   - ServletInputStream getIuputStream() ：获取字节输入流
   - BufferedReader getReader() ：获取字符输入流

requestdemo2.html

访问：http://localhost:8080/FromZerotoExpert/requestdemo2.html

输入用户名和密码

跳转至：http://localhost:8080/FromZerotoExpert/requestdemo2

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form action="/FromZerotoExpert/requestdemo2 " method="post">
    <input type="text" name="username">
    <input type="password" name="password">
    <input type="submit">
</form>
</body>
</html>
```

<img src="C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221027235849697.png" alt="image-20221027235849697" style="zoom:80%;" />

控制台输出：username=theo&password=123



### Request通用方式获取请求参数

RequestDemo3.java

```java
@WebServlet("/requestdemo3")
public class RequestDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // get请求逻辑
        System.out.println("get...");

        // 1. 获取所有集合参数的map集合
        Map<String,String[]> map=req.getParameterMap();
        for (String key : map.keySet()) {
            System.out.print(key+":");
            //获取值
            String[] values=map.get(key);
            for (String value : values) {
                System.out.print(value+" ");
            }
            System.out.println();
        }

        // 2. 根据key获取参数值，数组
        String[] hobbies=req.getParameterValues("hobby");
        for (String hobby : hobbies) {
            System.out.println(hobby);
        }

        // 3. 根据key获取单个参数值
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        System.out.println("username:"+username);
        System.out.println("password:"+password);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // post请求逻辑
        System.out.println("post...");
        doGet(req,resp);
    }
}
```

requestdemo3.html

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form action="/FromZerotoExpert/requestdemo3" method="get">
    <input type="'text" name="username">
    <input type="text" name="password">
    <input type="checkbox" name="hobby" value="1">游泳
    <input type="checkbox" name="hobby" value="2">爬山
    <input type="submit">
</form>
</body>
</html>
```

get请求方式，提交表单后浏览器链接显示用户信息

![image-20221028161312894](C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221028161312894.png)![image-20221028161326690](C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221028161326690.png)

post请求方式，浏览器不显示用户信息

![image-20221028161616077](C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221028161616077.png)

### 解决请求参数中文乱码

**只有Tomcat8之前的版本会有中文乱码**

POST：设置输入流的方法

```java
request.setCharacterEncoding("UTF-8");
```

GET：

<img src="C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221028202403274.png" alt="image-20221028202403274" style="zoom:80%;" />

URL编码：

1. 将字符串按照编码方式转成二进制
2. 每个字节转成2个16进制数并在前面加上%

解释：

```java
// 解决GET中文乱码
// 获取username
String username=request.getParameter("username");
// 1. URL编码
String encode= URLEncoder.encode(username,"utf-8");
// 2. URL解码
String decode= URLDecoder.decode(encode,"ISO-8859-1");
// 3. 转换为字节数据
byte []bytes=decode.getBytes("ISO-8859-1");
// 4. 将字符数组转换成字符串
String s=new String(bytes,"utf-8");
```

GET解决方法：

```java
// 解决GET中文乱码
// get获取参数的方式：getQueryString
// 乱码原因：tomcat进行URL编码，默认的字符集为ISO-8859-1
// 1.对乱码进行编码：转为字节数组
byte []bytes=username.getBytes(StandardCharsets.ISO_8859_1);
// 2. 将字符数组转换成字符串（字符数组解码）
String s=new String(bytes,StandardCharsets.UTF_8);
```

POST和GET分别的解决方法：

```java
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // 解决GET中文乱码
    String username=request.getParameter("username");
    String s=new String(username.getBytes(StandardCharsets.ISO_8859_1),StandardCharsets.UTF_8);
}

@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // 解决POST中文乱码
    // POST .getReader()
    request.setCharacterEncoding("UTF-8");//设置字符输入流的编码
    // 1.获取username
    String username=request.getParameter("username");
    System.out.println("username:"+username);
    this.doGet(request, response);
}
```

### Request请求转发

**请求转发（forward）**：一种在服务器内部的资源跳转

实现方式：req.getRequestDispatcher("资源B路径").forward(req,resp);

**请求转发资源共享数据：**

- void setAttribute(String name,Object o) ：存储数据到request领域中
- Object getAttribute(String name) ：根据key值，获取值
- void removeAttribute(String name)：根据key，删除键对值

**请求转发的特点**：

- 浏览器路径栏不发生变化
- 只能转发到当前服务器的内部资源
- 一次请求，可以在转发的资源间使用request共享数据

🌰请求转发

 RequestDemo4.java

```java
//请求转发 存储数据
@WebServlet("/requestdemo4")
public class RequestDemo4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("demo4...");
        // 存储数据
        request.setAttribute("msg","hello");
        // 请求转发
        request.getRequestDispatcher("/requestdemo5").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
```

RequestDemo5.java

```java
/// 请求转发 获取数据
@WebServlet("/requestdemo5")
public class RequestDemo5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("demo5...");
        // 获取数据
        Object msg=request.getAttribute("msg");
        System.out.println(msg);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
```

### Response响应数据功能介绍

响应数据三部分：

1. **响应行**

   `HTTP/1.1 200 OK`

   - void setStatus(int sc) ：设置响应状态码

2. **响应头**

   `Content-Type:text/html`

   - void setHeader(String name,String value)：设置响应键对值

3. **响应体**

   `<html><head></head><body></body></html>`

   - PrintWrite getWrite() ：获取字符输出流
   - ServletOutputStream getOutputStream() ：获取字节输出流

### Response重定向

**重定向（Redirect）：**一种资源跳转方式

**实现方式：**

- 方式一：

  ```java
  // 1. 设置响应状态码
  response.setStatus(302);
  // 2. 设置响应头 location 
  response.setHeader("location","虚拟路径2的名称");
  // response.setHeader("location","/FromZerotoExpert/responsedemo2");
  ```

- 方法二：

```java
response.sendRedirect(""虚拟路径2的名称"");
// response.sendRedirect("/FromZerotoExpert/responsedemo2");
// response.sendRedirect("https://www.baidu.com/");
```

**重定向的特点：**

- 浏览器地址栏路径发生变化
- 可以重定向到任意位置的资源（服务器内部，外部均可）
- 两次请求，不能在多个资源使用request共享数据

### 资源访问路径问题

**明确路径谁使用**

- 浏览器使用：需要加虚拟目录（项目访问路径）
- 服务器使用：不需要加虚拟目录

练习：

- `<a href="路径">`  加虚拟目录
- `<form action="路径">` 加虚拟目录
- `request.getRequestDispatcher("路径")` 不加虚拟目录 （请求转发）
- `response.getRedirect("路径")` 加虚拟目录 （重定向）

**动态获取虚拟目录完成重定向**

```java
// 动态获取虚拟目录完成重定向
String contextpath=request.getContextPath();
response.sendRedirect(contextpath+"/responsedemo2");
```

### Response响应字符&响应字节

**Response响应字符**：

**使用：**

1. 通过Response对象获取字符输出流

   ```java
   PrintWriter writer=response.getWriter();
   ```

2. 写数据

   ```java
   writer.write("你好");
   writer.write("<h1>你好</h1>");
   ```

**注意：**

- 该流不需要关闭，随着响应结束，response对象销毁，由服务器关闭

- 中文数据乱码：原因通过Response获取的字符输出流默认编码是ISO-8859-1

  ```java
  response.setContentType("text/html;charset=utf-8");
  ```

🌰

```java
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    System.out.println("ResponseDemo3...");
    // 由于默认以纯文本输出，设置后html标签可被解析,编码方式可让中文不乱吗
    response.setContentType("text/html;charset=utf-8");
    PrintWriter writer=response.getWriter();
    writer.write("你好");
    writer.write("<h1>你好</h1>");
}
```



**Response响应字节**：

**使用：**

1. 通过Response对象获取

```java
ServletOutputStream os =response.getOutputStream();
```

2. 写数据

   ```java
   outputStream.write(字节数据);
   ```

**IOUtils工具类使用**

1. 导入坐标

```xml
<dependency>
  <groupId>commons-io</groupId>
  <artifactId>commons-io</artifactId>
  <version>2.6</version>
</dependency>
```

2. 使用

   ```java
   IOUtils.copy(输入流,输出流)
   ```

🌰

```java
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // 1. 读取文件
    FileInputStream fis=new FileInputStream("D:\\program\\Java\\source\\pic.jpg");
    // 2. 获取response字节输出流
    ServletOutputStream os =response.getOutputStream();
    // 3. 完成流的copy
        /*  byte[] buff = new byte[1024];
        int len=0;
        while ((len=fis.read(buff))!=-1){
            os.write(buff,0,len);
        }*/
    IOUtils.copy(fis,os); // 用工具commons-io
    fis.close();
}
```

## IDEA模板创建Servlet

![image-20221028162643921](C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221028162643921.png)

修改IDEA里的模板

<img src="C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221028162938235.png" alt="image-20221028162938235" style="zoom:80%;" />

原始模板：

```java
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")

#if ($JAVAEE_TYPE == "jakarta")
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
#else
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
#end
import java.io.IOException;

@WebServlet(name = "${Entity_Name}", value = "/${Entity_Name}")
public class ${Class_Name} extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
```

修改后：

```java
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")

#if ($JAVAEE_TYPE == "jakarta")
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
#else
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
#end
import java.io.IOException;

@WebServlet("/${Entity_Name}")
public class ${Class_Name} extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
```

### 



# Problem

## 1、maven项目jsp页面输出中文乱码

- [x] 已解决

📝 [(170条消息) idea maven项目 jsp页面中文乱码问题_find_some_way的博客-CSDN博客_idea jsp页面中文乱码](https://blog.csdn.net/baidu_28647571/article/details/83024677)

**第一步，修改编码方式为UTF-8**

<img src="C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221025103829413.png" alt="image-20221025103829413" style="zoom: 67%;" />

**2、jsp页面中添加（重要）**

```jsp
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
```

<img src="C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221025104114682.png" alt="image-20221025104114682" style="zoom:80%;" />

## 2、无法解析jar包

📝 [(170条消息) dependency ‘mysql-connector-java‘not found_Dirty Boy的博客-CSDN博客](https://blog.csdn.net/weixin_43006208/article/details/107536374)

取消勾选

<img src="C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221025132043499.png" alt="image-20221025132043499" style="zoom: 50%;" />

<img src="C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221025132421049.png" alt="image-20221025132421049" style="zoom: 50%;" />

<img src="C:\Users\asus\AppData\Roaming\Typora\typora-user-images\image-20221025132540070.png" alt="image-20221025132540070" style="zoom:67%;" />
