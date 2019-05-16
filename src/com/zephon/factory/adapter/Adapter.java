/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Adapter
 * Author:   zephon
 * Date:     19-5-13 下午1:21
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
//适配器
//public class Adapter extends Adaptee implements Target {
//
//    @Override
//    public void handleReq() {
//        super.request();
//    }
//}
public class Adapter implements Target{
    private Adaptee adaptee;

    @Override
    public void handleReq() {
        adaptee.request();
    }

    public Adapter(Adaptee adaptee){
        super();
        this.adaptee = adaptee;
    }
}