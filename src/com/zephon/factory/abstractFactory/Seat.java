/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Seat
 * Author:   zephon
 * Date:     19-5-11 下午12:05
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
public interface Seat {
    void massage();
}

class LuxurySeat implements Seat{

    @Override
    public void massage() {
        System.out.println("可以按摩");
    }
}

class LowSeat implements Seat{

    @Override
    public void massage() {
        System.out.println("不能");
    }
}
