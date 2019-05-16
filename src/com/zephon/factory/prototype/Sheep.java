/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Sheep
 * Author:   zephon
 * Date:     19-5-12 下午1:29
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zephon.factory.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zephon
 * @create 19-5-12
 * @since 1.0.0
 */
public class Sheep implements Cloneable, Serializable {
    private String name;
    private Date birthday;

    public Sheep(String a, Date date){
        this.name = a;
        this.birthday = date;
    }



    //clone()是Object中的，而非Cloneable中的
    //深拷贝
    @Override
    public Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
//        Sheep s = (Sheep) obj;
//        s.birthday = (Date) this.birthday.clone();//将属性也拷贝
        return obj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
