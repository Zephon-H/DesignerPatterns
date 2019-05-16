package com.zephon.factory.facade;

/**
 * @author Zephon
 * @version V1.0
 * @Package com.zephon.factory.facade
 * @date 19-5-16 下午12:52
 * @Copyright ©
 */
public class RegisterFacade {
    public void register(){
        Step1 s1 = new Step1();
        Step2 s2 = new Step2();
        s1.firstStep();
        s2.secondStep();
    }
}
