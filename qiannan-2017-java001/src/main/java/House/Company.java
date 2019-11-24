package House;
import java.util.ArrayList;
import java.util.List;
public class Company {
    private String name;
    // company 1 对 多 house
    private List houseList;

    public Company(String name) {
        this.name = name;
        this.houseList=new ArrayList();
    }

    //1 . 添加房屋
    public void add(House h)
    {
        houseList.add(h);
    }
    //2 . 列出房屋的所有信息
    public List getHouseList() {
        return houseList;
    }

    //3 . 根据 房主名称 修改房屋
    public boolean updateByOwner(House h)
    {
        for(int i=0;i<houseList.size();i++)
        {
            House house=(House)houseList.get(i);
            if(house.getOwner().equals(h.getOwner()))
            {
                //修改
                houseList.set(i, h);
                return true;
            }
        }
        return false;
    }
    //4 . 按房主名称查询房屋
    public House findByOwner(String owner)
    {
        for(int i=0;i<houseList.size();i++)
        {
            House h=(House)houseList.get(i);
            if(h.getOwner().equals(owner))
            {
                return h;
            }
        }
        return null;
    }
    //5 . 根据 房主名称  删除房屋
    public boolean deleteByOwner(String owner)
    {
        for(int i=0;i<houseList.size();i++)
        {
            House h=(House)houseList.get(i);
            if(h.getOwner().equals(owner))
            {
                houseList.remove(i);
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setHouseList(List houseList) {
        this.houseList = houseList;
    }

}



