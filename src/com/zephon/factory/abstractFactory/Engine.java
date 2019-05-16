/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Engine
 * Author:   zephon
 * Date:     19-5-11 下午12:03
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
public interface Engine {
    void run();
    void start();

}
//高端型
class LuxuryEngine implements Engine{

    @Override
    public void run() {
        System.out.println("跑的快");
    }

    @Override
    public void start() {
        System.out.println("启动快");
    }
}

//低端型
class LowEngine implements Engine{

    @Override
    public void run() {
        System.out.println("跑得慢");
    }

    @Override
    public void start() {
        System.out.println("启动慢");
    }
}