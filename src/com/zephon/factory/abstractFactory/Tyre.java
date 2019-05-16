/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Tyre
 * Author:   zephon
 * Date:     19-5-11 下午12:06
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zephon.factory.abstractFactory;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zephon
 * @create 19-5-11
 * @since 1.0.0
 */
public interface Tyre {
    void revolve();
}

class LuxuryTyre implements Tyre{

    @Override
    public void revolve() {
        System.out.println("快");
    }
}

class LowTyre implements Tyre{

    @Override
    public void revolve() {
        System.out.println("慢");
    }
}
