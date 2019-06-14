package com.controller;


import com.controller.result.ShoppingBean;
import com.controller.result.ShoppingCart;
import com.dao.ProductDao;
import com.dao.StoreDao;
import com.pojo.Product;
import com.pojo.Store;
import com.service.OrderItemService;
import com.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/shopping")
public class Shopping {
    @Autowired
    private OrderItemService orderItemService;
    @Autowired
    private OrdersService ordersService;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private StoreDao storeDao;
    private List<ShoppingCart> shoppingCarts = new ArrayList<>();
    private List<ShoppingBean> shoppingBeans = new ArrayList<>();
    @RequestMapping("add")
    public List<ShoppingCart> add(HttpServletRequest request, HttpServletResponse response,
           @RequestParam("storeId") int storeId,@RequestParam("productId") int productId,@RequestParam("userId") int userId){
        response.addHeader("Access-Control-Allow-Origin","*");
        request.getSession().setAttribute("shoppingCarts",shoppingCarts);
        Product product = productDao.getProductById(productId);
        String productName = product.getProduct_name();
        double productPrice = product.getProduct_price();
        for (ShoppingCart shoppingCart:shoppingCarts
        ) {
            for (ShoppingBean shoppingBean:shoppingCart.getShoppingBeans()
            ) {
                if(shoppingBean.getProductName().equals(productName)){
                    shoppingBean.setCount(shoppingBean.getCount()+1);
                }else{
                    ShoppingBean bean = new ShoppingBean();
                    bean.setProductName(productName);
                    bean.setCount(shoppingBean.getCount()+1);
                    bean.setTotal((shoppingBean.getCount() * productPrice));
                    shoppingBeans.add(bean);
                }
            }
        }
        ShoppingCart shoppingCart = new ShoppingCart();
        Store store = storeDao.getStoreById(storeId);
        String storeName = store.getstoreName();
        shoppingCart.setStoreName(storeName);
        shoppingCart.setShoppingBeans(shoppingBeans);

        shoppingCarts.add(shoppingCart);
        request.getSession().setAttribute("shoppingCarts",shoppingCarts);
        return shoppingCarts;
    }

    public List<ShoppingCart> delete(HttpServletRequest request,HttpServletResponse response,
                                     @RequestParam("storeId") int storeId,@RequestParam("productId") int productId,@RequestParam("userId") int userId){
        response.addHeader("Access-Control-Allow-Origin","*");
        List<ShoppingCart> shoppingCarts = (List<ShoppingCart>) request.getSession().getAttribute("shoppingCarts");
        for (ShoppingCart shoppingCart:shoppingCarts
             ) {
            for (ShoppingBean shoppingBean:shoppingCart.getShoppingBeans()
                 ) {

            }
        }
        return null;
    }
}
