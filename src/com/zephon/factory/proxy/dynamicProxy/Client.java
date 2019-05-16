/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Client
 * Author:   zephon
 * Date:     19-5-13 下午2:12
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zephon.factory.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zephon
 * @create 19-5-13
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        Star realStar = new RealStar();
        StarHandler handler = new StarHandler(realStar);

        Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Star.class},handler);
        proxy.signContract();
        proxy.sing();
    }

}
