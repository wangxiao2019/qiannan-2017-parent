package House;
/**
 * List 实现房地产公司对, 出租的房屋信息的管理
 (房屋信息：房主名称,  价格, 描述)
 1 . 添加房屋
 2 . 列出房屋的所有信息
 3 . 根据 房主名称 修改房屋
 4 . 按房主名称查询房屋
 5 . 根据 房主名称  删除房屋
 */

import java.util.List;
public class Test {
    public static void main(String[] args) {
        //实例化房地产公司
        Company company=new Company("链家地产");
        //添加房屋
        company.add(new House("李强",1500,"单间"));
        company.add(new House("王浩",3000,"一室一厅"));
        company.add(new House("张涛",4000,"两室一厅"));

        //根据 房主名称 修改房屋
        company.updateByOwner(new House("张涛",4500,"两室一厅"));

        //按房主名称查询房屋
        House house=company.findByOwner("王浩");
        System.out.println("您查找的王浩房屋信息:"+house.getOwner()+","+house.getDescription()+","+house.getPrice());

        //根据 房主名称  删除房屋
        company.deleteByOwner("张涛");

        //列出房屋的所有信息
        List houseList=company.getHouseList();
        for(int i=0;i<houseList.size();i++)
        {
            House h=(House)houseList.get(i);
            System.out.println(h.getOwner()+","+h.getPrice()+","+h.getDescription());
        }

    }


}
