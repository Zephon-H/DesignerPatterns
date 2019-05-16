/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: AirShipBuilder
 * Author:   zephon
 * Date:     19-5-12 下午1:04
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
public interface AirShipBuilder {
    Engine builderEngine();
    OrbitalModule builderOrbitalModule();
    EscapeTower builderEscapeTower();
}
