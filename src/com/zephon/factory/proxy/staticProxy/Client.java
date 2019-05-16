/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Client
 * Author:   zephon
 * Date:     19-5-13 下午2:02
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zephon.factory.proxy.staticProxy;

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
        Star real = new RealStar();
        Star proxy = new ProxyStar(real);

        proxy.sing();
        proxy.signContract();

    }

}
