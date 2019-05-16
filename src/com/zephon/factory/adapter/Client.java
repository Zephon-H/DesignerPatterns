/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Client
 * Author:   zephon
 * Date:     19-5-13 下午1:22
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zephon.factory.adapter;


/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zephon
 * @create 19-5-13
 * @since 1.0.0
 */
//客户端类
public class Client {
    public void test1(Target t){
        t.handleReq();
    }

    public static void main(String[] args) {
        Client client = new Client();
        Adaptee a = new Adaptee();
        Target t = new Adapter(a);
        client.test1(t);
    }
}
