/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Client
 * Author:   zephon
 * Date:     19-5-14 下午1:30
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zephon.factory.composite;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zephon
 * @create 19-5-14
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        AbstractFile f2,f3,f4,f5;
        Folder f1,f11;
        f1 = new Folder();
        f2 = new ImageFile();
        f3 = new TextFile();

        f4 = new TextFile();
        f5 = new TextFile();
        f11 = new Folder();
        f11.add(f4);
        f11.add(f5);
        f1.add(f11);

        f1.add(f2);
        f1.add(f3);

        f1.killVirus();
    }
}
