/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Client
 * Author:   zephon
 * Date:     19-5-14 下午1:07
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zephon.factory.bridge;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zephon
 * @create 19-5-14
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        //销售Lenovo笔记本
        Computer computer = new Laptop(new Lenovo());
        computer.sale();
    }
}
