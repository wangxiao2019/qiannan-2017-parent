package packaging_group;

public class GetCon {
    public static void main(String[] args) {
        int maxint=Integer.MAX_VALUE;//获取Integer类的常量值
        int minint=Integer.MIN_VALUE;
        int intsize=Integer.SIZE;
        System.out.println("int类型可取的最大值是："+maxint);//将常量输出
        System.out.println("int类型可取的最小值是："+minint);
        System.out.println("int类型的二进制位数是："+intsize);
    }
}
