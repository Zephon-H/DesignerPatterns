/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: RealStar
 * Author:   zephon
 * Date:     19-5-13 下午2:00
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zephon.factory.proxy.dynamicProxy;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zephon
 * @create 19-5-13
 * @since 1.0.0
 */
public class RealStar implements Star {

    @Override
    public void sing() {
        System.out.println("RealStar.sing");
    }

    @Override
    public void signContract() {
        System.out.println("RealStar.sign");

    }
}
