/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Component
 * Author:   zephon
 * Date:     19-5-14 下午1:20
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
//抽象组件
public interface Component {
    void operation();
}
//叶子组件
interface Leaf extends Component{

}
//容器组件
interface Composite extends Component{
    void add(Component c);
    void remove(Component c);
    Component getChild(int index);
}
