/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Brand
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
//品牌维度
public interface Brand {
    void sale();
}

class Lenovo implements Brand{
    @Override
    public void sale() {
        System.out.println("销售Lenovo");
    }
}

class Dell implements Brand{
    @Override
    public void sale() {
        System.out.println("销售Dell");
    }
}