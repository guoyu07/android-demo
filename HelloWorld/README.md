# Learn Android Step By  Step

## 一级目录结构以及相关文件说明
- .gradle与.idea 放置的都是Android Studio自动生成的文件，无需关心
- app 项目中的代码以及资源都是放置在这个目录中的
- build 包含了一些在编译时自动生成的文件，无需关心
- gradle 里面是gradle wrapper的配置文件
- build.gradle 全局的gradle构建脚本，通常这个文件的内容是不需要修改的
- build.properties 全局的gradle配置文件
- gradlew和gradlew.bat 用于在命令行界面中执行gradle命令，前者在Linux或Mac中执行，后者在Windows中执行
- iml 用于标识这是一个IntelliJ IDEA 项目
- local.properties 用于指定本机中的Android SDK路径，一般来说，也是不用修改的
- setting.gradle 用于指定项目中所有引入的模块

## app目录重点说明
- build 和外层的build目录类似，主要是包含一些编译时自动生成的文件，一样无需关心
- libs 如果项目中使用到了第三方jar包，则要放置到此目录，会在构建时被自动加载
- androidTest 用于编写 Android Test 测试用例
- java 放置所有java代码的地方
- res 存放所有的资源文件
- AndroidManifest.xml 整个安卓项目的配置文件
- test 用于编写Unit Test测试用例
- app.iml Intellij项目自动生成的文件，无需关心
- build.gradle app模块的gradle构建脚本
- proguard-rules.pro 用于混淆代码，增加破解者的阅读理解难度


