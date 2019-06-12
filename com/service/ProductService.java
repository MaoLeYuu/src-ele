package com.service;

import com.pojo.Product;
import com.utils.PageResult;
import com.utils.PageUtil;


public interface ProductService {
   PageResult getProductPage(PageUtil pageUtil);
   PageResult getSortMarkPage(PageUtil pageUtil);
   PageResult getSortPricePage(PageUtil pageUtil);
   PageResult getSortOrderPage(PageUtil pageUtil);
}
