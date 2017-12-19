
springboot + springmvc + mybatis(注解) + mysql + dubbo(注解)

https://github.com/alibaba/dubbo

使用jsp作为页面 , 打包成 war的方式，进去项目根目录，命令：mvn clean package

启动命令：nohup java -jar springboot.war > nohup.out &

注意配置日志文件（logback.xml）

mybatis自动生成实体类，mapper ，配置文件： generatorConfig.xml
进入项目根目录 ， 命令 : mvn mybatis-generator:generate
