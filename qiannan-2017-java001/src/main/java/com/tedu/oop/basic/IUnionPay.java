package com.tedu.oop.basic;

/**
 * 封装银联标准定义的接口
 */
public interface IUnionPay {
    /*定义常量备选项
    * 完整的写法：public static final String CBC="CBC";
    * public static final可省略，编译器会自动添加。
    * 常量：必须在声明时在初始化
    * */
    String CBC="CBC";
    String ABC="ABC";
    /**
     * 验证密码的方法定义
     * @param input 用户输入的密码
     * @return 验证是否成功
     */
   // public abstract boolean checkPwd(String input);
    boolean checkPwd(String input);

    /**
     * 取款方法的标准定义
     * @param money 取款金额
     * @return 是否取款成功
     */
    boolean drawMoney(double money);

    /**
     * 查询余额的标准方法定义
     */
    double getBalance();
    /**
     * c插卡方法得标准定义
     * @param card  银行卡类型得对象
     */
    void setCard(Card card);

    /**
     *
     */
    void takepic();
}
