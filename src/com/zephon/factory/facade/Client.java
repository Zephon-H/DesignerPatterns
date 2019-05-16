package com.zephon.factory.facade;

/**
 * @author Zephon
 * @version V1.0
 * @Package com.zephon.factory.facade
 * @date 19-5-16 下午12:57
 * @Copyright ©
 */
public class Client {
    //不使用外观模式
    public static void main(String[] args) {
//        Step1 s1 = new Step1();
//        Step2 s2 = new Step2();
//        s1.firstStep();
//        s2.secondStep();

        //使用外观模式
        RegisterFacade r = new RegisterFacade();
        r.register();
    }
}
