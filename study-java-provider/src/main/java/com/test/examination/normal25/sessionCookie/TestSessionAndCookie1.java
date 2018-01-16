package com.test.examination.normal25.sessionCookie;

/**
 * 1、cookie和session都是用来保存用户状态信息的一种手段
 * 2、cookie是保存在客户端的，session是保存在服务器上的
 * 3、cookie安全性能较差，session安全性能相对较高
 * 4、cookie保存的时间可以非常的长，session根据服务器设置一般只保存30分钟
 * 5、session是通过cookie机制来实现的
 * 客户端禁用cookie后，session还能否工作？
 *   能（少数网站可以支持） URL重写机制
 *   不能（大部分网站不可以支持）
 * 能否用cookie实现购物车功能?
 *   能
 * URL的重大缺陷：只能对动态界面有效，例如JSP，对于html无效
 */
public class TestSessionAndCookie1 {
	
}
