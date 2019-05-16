/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Computer
 * Author:   zephon
 * Date:     19-5-14 下午1:02
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
//电脑类型维度
public class Computer {
    protected Brand brand;
    public Computer(Brand brand){
        this.brand = brand;
    }

    public void sale(){
        brand.sale();
    }
}

class Desktop extends Computer{

    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售台式机");
    }
}

class Laptop extends Computer{

    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售笔记本");
    }
}