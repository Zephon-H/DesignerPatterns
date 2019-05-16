/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Client
 * Author:   zephon
 * Date:     19-5-15 上午10:34
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zephon.factory.decorator;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zephon
 * @create 19-5-15
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();

        System.out.println("-----------增加新功能-------------");
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();

        System.out.println("----------增加新功能-----------");
        AICar aiCar = new AICar(car);
        aiCar.move();

        System.out.println("-------增加两个新功能-------");
        AICar aiCar1 = new AICar(flyCar);
        aiCar1.move();
    }

}
