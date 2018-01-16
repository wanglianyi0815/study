package com.test.examination.normal17.web;

/**
 * 1、get与post有什么区别？
 * 答：
 *     表单的method属性如果是get，那么所有的参数信息都会显示在浏览器的地址栏里面，当我们使用浏览器地址栏输入网址的
 * 方式来发送请求是，那么该请求一定是get方式
 *     对于get方式，底层是将所有参数附加在轻轻资源的后面一起传递的
 *     对于post方式，底层是将所有参数附加在请求参数的最后一行的下一行的下一行
 *     对于get方式，servlet采用doGet来进行处理，对于post方式，servlet采用doPost方法来进行处理
 */
public class HttpRequestTest1 {
    
}
