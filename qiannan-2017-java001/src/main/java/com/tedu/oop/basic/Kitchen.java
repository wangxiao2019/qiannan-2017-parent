package com.tedu.oop.basic;

/**
 * 封装厨房成员和方法的类
 */
public class Kitchen {
    private String name;//餐厅的名字
    private Garnish garnish;
    private Cook cook;
    public class Garnish{
        private String name;//配菜工的名字

        /**
         * 配菜工带参数的构造方法
         * @param name 配菜工的姓名
         */

        public Garnish(String name) {
            super();
            this.name = name;
        }

        /**
         * 配菜工切菜的方法
         */
        public void cutting(){
            System.out.println("配菜工:"+name+"切菜...");
        }
    }
    /**
     * 封装厨房子属性和功能的内部类
     */
    public class Cook{
        private String name;//定义厨子的名字
        /**
         * 带参的构造方法
         */
        public Cook(String name) {
            super();
            this.name = name;
        }

        /**
         * 厨子做饭的方法
         */
        public void cooking(){
        //那家餐厅的哪位主厨为客人服务
            System.out.println(Kitchen.this.name+"餐厅，主厨"+name+"正在炒菜");
        }
    }

    /**
     * 餐厅外部类的带参构造方法
     * @param name  餐厅的名字
     * @param garnish
     * @param cook
     */
    public Kitchen(String name, String garnish, String cook) {
        super();
        /**
         * 内部类的实例化最好仅在外部类的内部进行
         * 内部类的对象，一般仅供外部类内使用
         */
        this.name = name;
        this.garnish = new  Garnish(garnish);
        this.cook = new  Cook(cook);
    }

    /**
     * 客户点菜的方法
     * @param menu 菜名
     * @return 做好的菜
     */
    public String order(String menu){
        //配菜工配菜
        garnish.cutting();
        //请厨子做菜
        cook.cooking();
        return "您的"+menu+" 来了.....";
    }
}
