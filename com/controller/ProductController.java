package com.controller;

import com.controller.beans.ShopBean;
import com.dao.OrderItemDao;
import com.dao.OrdersDao;
import com.dao.ProductDao;
import com.pojo.OrderItem;
import com.pojo.Orders;
import com.pojo.Product;
import com.pojo.User;
import com.service.ProductService;
import com.utils.CommonsUtils;
import com.utils.PageResult;
import com.utils.PageUtil;
import com.vo.Cart;
import com.vo.CartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.util.*;

@RestController
@RequestMapping("/product")
public class ProductController {

   @Resource(name = "productService")
    private ProductService productService;
    @Autowired
   private OrdersDao ordersDao;

    @Autowired
   private OrderItemDao orderItemDao;

    @Autowired
    private ProductDao productDao;
   @RequestMapping("/get")
   public int get(){
       return 1;
   }

    @RequestMapping("/list")
    public List<Map<String, Object>> list(@RequestParam int storeId, HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin","*");

        return productService.getProductPage(storeId);
    }
    @RequestMapping("/mark")
    public  List<Map<String, Object>> mark(@RequestParam int storeId,HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin","*");

        return productService.getSortMarkPage(storeId);
    }
    @RequestMapping("/price")
    public  List<Map<String, Object>> price(@RequestParam int storeId,HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin","*");

        return productService.getSortPricePage(storeId);
    }
    @RequestMapping("/order")
    public  List<Map<String, Object>> order(@RequestParam int storeId,HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin","*");

        return productService.getSortOrderPage(storeId);
    }
    /*public void spilt(String str,List<Integer>){

    }*/
    @RequestMapping(value = "/addProductToCart")
    public String addProductToCartA(@RequestParam("str") String str,@RequestParam("address") String address,
                                    @RequestParam("uid") String uid, HttpServletResponse response) {
        response.addHeader("Access-Control-Allow-Origin","*");
        //获取商品的pid和需要购买的数量
//       int pid =Integer.parseInt(request.getParameter("pid"));
//        int buyNum=Integer.parseInt(request.getParameter("byNum"));
        //封装订单
        //根据ID查询商品
        int userId = Integer.parseInt(uid);
        try {
            address = new String(address.getBytes("ISO8859-1"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        int storeId = 0;
        List<Integer> productIds = new ArrayList<>();
        List<Integer> counts = new ArrayList<>();

        String[] strings = str.split("_");
        storeId = Integer.parseInt(strings[0]);
        for (int i = 1;i <strings.length; i++ ){
            System.out.println(i);
            if(i % 2==0){
                counts.add(Integer.parseInt(strings[i]));
            }else
                productIds.add(Integer.parseInt(strings[i]));
        }
        Orders orders = new Orders();
        orders.setOrders_date(new Date());
        orders.setUser_id(userId);
        orders.setStore_id(storeId);
        orders.setUserAddress(address);
        ordersDao.insert(orders);
        Integer ordersId = orders.getOrders_id();
        for (int h=0; h < productIds.size();h++){
            Integer productId = productIds.get(h);
            int count = counts.get(h);
            Product product = productDao.getProductById(productId);
            double productPrice = product.getProduct_price();
            double subTotal = count * productPrice;
            OrderItem orderItem = new OrderItem();
            orderItem.setOrders_id(ordersId);
            orderItem.setProduct_id(productId);
            orderItem.setCount(count);
            orderItem.setSubTotal(subTotal);
            orderItemDao.insert(orderItem);
        }
        return "success";
      /*  int pid=0;
        int buyNum=0;
        int storeId= shopBean.getStoreId();
        for (Map map:shopBean.getMao()) {
             pid=(int)map.get("pid");
             buyNum=(int)map.get("buyNum");
        }

      *//*  System.out.println(pid+" "+buyNum);*//*
        Product product=productService.findProductByid(pid);
        //计算小记
        double subTotal=product.getProduct_price()*buyNum;
        //封装订单
        CartItem item=new CartItem();
        item.setProduct(product);
        item.setBuyNum(buyNum);
        item.setSubTotal((int) subTotal);
        //获取购物车，首先判断session里是否有购物车
        Cart cart= (Cart) session.getAttribute("cart");
        if(cart==null){
            cart=new Cart();
        }

        //将购物项放到车中，pid是key
        //先判断购物车中是否有该项，判断key是否存在
        //如果存在就在商品的数量上进行操作
        Map<String,CartItem> cartItems=cart.getCartItems();
        double newSubTotal=0.0;
        if (cartItems.containsKey(pid)){
            //取出购买数量，将新加的数量添加到原来的数量中
            int oldByNum=cartItems.get(pid).getBuyNum();
            oldByNum=oldByNum+buyNum;
            cartItems.get(pid).setBuyNum(oldByNum);
            //再次修改小记
            newSubTotal=oldByNum*cartItems.get(pid).getProduct().getProduct_price();
            cartItems.get(pid).setSubTotal((int) (oldByNum+newSubTotal));
        }else {
            //cart中没有该商品
            cart.getCartItems().put(String.valueOf(pid),item);
            newSubTotal=product.getProduct_price()*buyNum+newSubTotal;
        }
        //计算总价
        double total=cart.getTotal()+newSubTotal;
        cart.setTotal(total);
        session.setAttribute("total",total);
        return "redirect:/cart.jsp";*/
    }

    //从购物车删除某个商品订单
    @RequestMapping(value = "deleteProductFromCart")
    public String deleteProductFromCart(HttpServletRequest request,HttpSession session,HttpServletResponse response){
        //获取要删除商品的id
        response.addHeader("Access-Control-Allow-Origin","*");
        String pid=request.getParameter("pid");
        //获取session中的购物车
        Cart cart= (Cart) session.getAttribute("cart");
        if(cart!=null){
            Map<String,CartItem> cartItems=new HashMap<String, CartItem>();
            //改变购物车的总价
            double total=cart.getTotal()-cart.getCartItems().get(pid).getSubTotal();
            cart.setTotal(total);
            //删除cartItems中的指定商品pid的商品
            cartItems.remove(pid);
            cart.setCartItems(cartItems);
        }
        session.setAttribute("cart",cart);
        return "redirect:"+request.getContextPath()+"cart.jsp";
    }

    //清空购物车
    @RequestMapping(value = "clearCart")
    public String clearCart(HttpSession session,HttpServletRequest request){
        session.removeAttribute("cart");
        return "redirect:"+request.getContextPath()+"cart.jsp";
    }

    //提交订单
    @RequestMapping(value = "/submitOrder/{address}")
    public String submitOrder(HttpServletRequest request,HttpSession session,@PathVariable String address){
        //判断用户是否登陆，没有登陆不能提交订单
        User user= (User) session.getAttribute("user");
        if (user==null)
            return "redirect:/login.jsp";
        //封装一个OrderItem对象传给Service层
        Orders order=new Orders();
        //订单号
        order.setOrders_id(CommonsUtils.getUUID());
        //订单的下单时间
        order.setOrders_date(new Date());
        //订单总金额
        Cart cart= (Cart) session.getAttribute("cart");
        order.setTotal(cart.getTotal());
        //是否付款，1：已付款 0：未付款
        order.setStatus(0);
        //收货地址
        order.setUserAddress(address);
        //收货人姓名
        order.setOrderName(user.getUserName());
        //订单是哪个用户的订单
        order.setUser(user);
        //订单的订单项
        Map<String,CartItem> cartItems=cart.getCartItems();
        for (Map.Entry<String,CartItem> entry:cartItems.entrySet()){
            //取出购物项
            CartItem cartItem=entry.getValue();
            //创建订单项
            OrderItem orderItem=new OrderItem();
            orderItem.setOrderItem_id(CommonsUtils.getUUID());
            orderItem.setCount(cartItem.getBuyNum());
            orderItem.setSubTotal(cartItem.getSubTotal());
            orderItem.setProduct_id(cartItem.getProduct().getProduct_id());
            orderItem.setOrders_id(order.getOrders_id());

            //将订单添加到订单的订单项集合中
            order.getOrderItems().add(orderItem);
        }
        //order对象分装完毕
        //传递数据到service层
        productService.submitOrder(order);
        session.setAttribute("order",order);
        return "redirect:"+request.getContextPath()+"/order_info.jsp";

    }

    @RequestMapping(value = "select/{id}")
    public Product findProductBuId(@PathVariable Integer id){
        return productService.findProductByid(id);
    }

    @RequestMapping(value = "/add")
    public void submit(@RequestBody Orders orders){
        productService.submitOrder(orders);
    }

    //查询所有订单
    @RequestMapping(value = "selectAllOrderItem")
    public List<OrderItem> getAllOrderItem(){
        return productService.findAllOrderItem();
    }
}
