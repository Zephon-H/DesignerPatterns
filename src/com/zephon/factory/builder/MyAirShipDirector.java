/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: MyAirShipDirector
 * Author:   zephon
 * Date:     19-5-12 下午1:08
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
public class MyAirShipDirector implements AirShipDirector{
    private AirShipBuilder builder;

    public MyAirShipDirector(AirShipBuilder builder){
        this.builder = builder;
    }

    @Override
    public AirShip directAirShip() {
        Engine engine = builder.builderEngine();
        EscapeTower escapeTower = builder.builderEscapeTower();
        OrbitalModule orbitalModule = builder.builderOrbitalModule();
        //装配成飞船对象
        AirShip ship = new AirShip();
        ship.setEngine(engine);
        ship.setOrbitalModule(orbitalModule);
        ship.setEscapeTower(escapeTower);
        return ship;
    }
}
