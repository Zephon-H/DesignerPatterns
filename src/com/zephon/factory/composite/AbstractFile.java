/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: AbstractFile
 * Author:   zephon
 * Date:     19-5-14 下午1:24
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zephon.factory.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zephon
 * @create 19-5-14
 * @since 1.0.0
 */
//模拟杀毒软件
public interface AbstractFile {
    void killVirus();//杀毒

}

class ImageFile implements AbstractFile{
    @Override
    public void killVirus() {
        System.out.println("查杀图片文件");
    }
}
class TextFile implements AbstractFile{
    @Override
    public void killVirus() {
        System.out.println("查杀文本文件");
    }
}
class Folder implements AbstractFile{
    //定义容器，用来存放本容器构建的子节点
    private List<AbstractFile> list = new ArrayList<>();


    public void add(AbstractFile file){
        list.add(file);
    }
    public void remove(AbstractFile file){
        list.remove(file);
    }
    public AbstractFile getChild(int index){
        return list.get(index);
    }
    @Override
    public void killVirus() {
        System.out.println("查杀文件夹");
        for(AbstractFile file:list){
            file.killVirus();
        }
    }
}