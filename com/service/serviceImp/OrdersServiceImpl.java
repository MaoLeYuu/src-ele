package com.service.serviceImp;

import com.controller.beans.OrderBean;
import com.dao.OrdersDao;
import com.pojo.Orders;
import com.service.OrdersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service("ordersService")
public class OrdersServiceImpl implements OrdersService {
    @Resource(name = "ordersDao")
    private OrdersDao ordersDao;

    @Override
    public Integer insert(Orders orders) {
        return ordersDao.insert(orders);
    }

    @Override
    public List<Orders> getOrdersByUserId(int userId) {
        return ordersDao.getOrdersByUserId(userId);
    }

    @Override
    public List<OrderBean> getLateOrder(int userId) {
        Map<String,Object> map=null;
        List<Map<String,Object>> mapList=new ArrayList<>();
        List<OrderBean> list=new ArrayList<>();
        OrderBean orderBean=new OrderBean();
        long pnum=0;
        double total=0;
        List<Map<String,Object>> listmap= ordersDao.getMonthsThree(userId);
        int id=(int)listmap.get(0).get("ordersId");
        for (int i = 0; i < listmap.size(); i++) {
            if(id==(int)listmap.get(i).get("ordersId")){
                map=new HashMap<>();
                map.put("Pname",listmap.get(i).get("Pname"));
                map.put("count",listmap.get(i).get("count"));
                mapList.add(map);
                orderBean.setList(mapList);
            }
            pnum=pnum + (long) listmap.get(i).get("Pnum");
            orderBean.setPnum(pnum);
            orderBean.setOrdersId(id);
            orderBean.setSrc((String)listmap.get(i).get("src"));
            orderBean.setStoreName((String) listmap.get(i).get("storeName"));
            total=total + (double) listmap.get(i).get("subTotal");
            orderBean.setSubTotal(total);
            orderBean.setDate((Date) listmap.get(i).get("OrderDate"));
            orderBean.setStatus((int) listmap.get(i).get("status"));
            if (i==listmap.size()-1){
                list.add(orderBean);
            }
            else if(id!=(int)listmap.get(i).get("ordersId")){
                id = (int) listmap.get(i).get("ordersId");
                i--;
                list.add(orderBean);
                orderBean=new OrderBean();
            }

        }
        return list;
    }

    @Override
    public List<OrderBean> getOrder(int userId,int orderId) {
        Map<String,Object> map=null;
        List<Map<String,Object>> mapList=new ArrayList<>();
        List<OrderBean> list=new ArrayList<>();
        OrderBean orderBean=new OrderBean();
        double total=0;
        List<Map<String,Object>> listmap1= ordersDao.getOrders(userId,orderId);
        System.out.println(listmap1);
        int id=(int)listmap1.get(0).get("ordersId");
        for (int i = 0; i < listmap1.size(); i++) {
            if(id==(int)listmap1.get(i).get("ordersId")){
                map=new HashMap<>();
                map.put("Pname",listmap1.get(i).get("Pname"));
                map.put("count",listmap1.get(i).get("count"));
                map.put("subTotal",listmap1.get(i).get("subTotal"));
                map.put("Pnum",listmap1.get(i).get("Pnum"));
                mapList.add(map);
                orderBean.setList(mapList);
            }
            orderBean.setOrdersId(id);
            orderBean.setSrc((String)listmap1.get(i).get("src"));
            orderBean.setStoreName((String) listmap1.get(i).get("storeName"));
            total=total + (double) listmap1.get(i).get("subTotal");
            orderBean.setSubTotal(total);
            orderBean.setAddress((String)listmap1.get(i).get("address"));
            orderBean.setOrderPhone((String)listmap1.get(i).get("orderPhone"));
            orderBean.setStorePhone((String)listmap1.get(i).get("storePhone"));
            orderBean.setOrdersName((String)listmap1.get(i).get("ordersName"));
            orderBean.setDate((Date) listmap1.get(i).get("OrderDate"));
            orderBean.setStatus((int) listmap1.get(i).get("status"));
            if (i==listmap1.size()-1){
                list.add(orderBean);
            }
            else if(id!=(int)listmap1.get(i).get("ordersId")){
                id = (int) listmap1.get(i).get("ordersId");
                i--;
                list.add(orderBean);
                orderBean=new OrderBean();
            }

        }
        return list;
    }
}
