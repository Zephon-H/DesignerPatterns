/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: StarHandler
 * Author:   zephon
 * Date:     19-5-13 下午2:11
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zephon.factory.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zephon
 * @create 19-5-13
 * @since 1.0.0
 */
public class StarHandler implements InvocationHandler {
    Star realStar;

    public StarHandler(Star realStar){
        super();
        this.realStar = realStar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object = null ;
        if(method.getName().equals("sing"))
        {
            object = method.invoke(realStar,args);
        }

        return object;
    }
}
