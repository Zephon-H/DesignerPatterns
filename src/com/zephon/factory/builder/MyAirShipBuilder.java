/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: MyAirShipBuilder
 * Author:   zephon
 * Date:     19-5-12 下午1:05
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zephon.factory.builder;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zephon
 * @create 19-5-12
 * @since 1.0.0
 */
public class MyAirShipBuilder implements AirShipBuilder{


    @Override
    public Engine builderEngine() {
        System.out.println("构建发动机");
        return new Engine("发动机");//可以再于工厂模式结合
    }

    @Override
    public OrbitalModule builderOrbitalModule() {
        System.out.println("构建轨道舱");
        return new OrbitalModule("轨道舱");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("构建逃逸塔");
        return new EscapeTower("逃逸塔");
    }
}
