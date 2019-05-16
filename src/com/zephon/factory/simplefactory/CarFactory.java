/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: CarFactory
 * Author:   zephon
 * Date:     19-5-11 上午11:38
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zephon.factory.simplefactory;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zephon
 * @create 19-5-11
 * @since 1.0.0
 */
public class CarFactory {
    public Car createCar(String type){
        if("奥迪".equals(type)){
            return new Audi();
        }else if("比亚迪".equals(type)){
            return new Byd();
        }else {
            return null;
        }
    }
}
