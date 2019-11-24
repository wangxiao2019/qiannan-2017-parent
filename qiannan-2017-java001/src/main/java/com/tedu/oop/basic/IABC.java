package com.tedu.oop.basic;

/**
 * 封装农业银行标准功能的接口
 */
public interface IABC extends IUnionPay {
    //继承了银联的标准接口，自动继承了银联标准中的所有抽象方法
    //子接口中，仅需要定义扩展功能即可

    /**
     * 农行标准中新增的充话费方法
     * @param tel  电话号码
     * @param money  充值金额
     * @return  是否充值成功
     */
    boolean payTellBill(String tel,double money);


}
