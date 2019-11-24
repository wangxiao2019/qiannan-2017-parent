package packaging_group;

public class Summation {
    public static void main(String[] args) {
        String str[]={"23","56","58","78","33"};
        int sum=0;
        for (int i=0;i<str.length;i++){
            int myint=Integer.parseInt(str[i]);
            sum=sum+myint;
        }
        System.out.println("数组中个元素之和："+sum);
    }
}
