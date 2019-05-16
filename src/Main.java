/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Main
 * Author:   zephon
 * Date:     19-5-10 下午8:02
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import com.zephon.factory.builder.AirShip;
import com.zephon.factory.builder.AirShipDirector;
import com.zephon.factory.builder.MyAirShipBuilder;
import com.zephon.factory.builder.MyAirShipDirector;
import prototype.Sheep;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;


/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zephon
 * @create 19-5-10
 * @since 1.0.0
 */
//测试反射和反序列化破解单例模式
public class Main {//调用者
    public static void main(String[] args) throws Exception {
        Date date = new Date(12312341256L);
        Sheep sheep = new Sheep("aaa",date);
        System.out.println(sheep+"---"+sheep.getName()+"---"+sheep.getBirthday());


        //使用序列化和反序列化实现深拷贝
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(sheep);
        byte[] bytes = bos.toByteArray();
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Sheep s2 = (Sheep) ois.readObject();
        System.out.println(s2+"---"+s2.getName()+"---"+s2.getBirthday());

        s2.setName("bbb");
        date.setTime(3333333333L);
        System.out.println(sheep+"---"+sheep.getName()+"---"+sheep.getBirthday());
        System.out.println(s2+"---"+s2.getName()+"---"+s2.getBirthday());
    }
}
