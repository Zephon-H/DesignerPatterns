/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ICar
 * Author:   zephon
 * Date:     19-5-15 上午10:29
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
//抽象组件
public interface ICar {
    void move();
}

//真实对象
class Car implements ICar{

    @Override
    public void move() {
        System.out.println("地上跑");
    }
}
//装饰器
class SuperCar implements ICar{
    protected ICar icar;
    public SuperCar(ICar icar){
        super();
        this.icar = icar;
    }
    @Override
    public void move() {
        icar.move();
    }
}
//具体装饰角色
class FlyCar extends SuperCar{
    public FlyCar(ICar iCar){
        super(iCar);
    }

    public void fly(){
        System.out.println("天上飞");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}
class AICar extends SuperCar{
    public AICar(ICar iCar){
        super(iCar);
    }
    public void autoMove(){
        System.out.println("自动驾驶");
    }

    @Override
    public void move() {
        super.move();
        autoMove();
    }
}