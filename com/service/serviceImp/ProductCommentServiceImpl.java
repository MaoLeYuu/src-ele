package com.service.serviceImp;

import com.controller.result.ProductOne;
import com.controller.result.productCommentBean;
import com.dao.ProductCommentDao;
import com.service.ProductCommentService;
import com.utils.PageResult;
import com.utils.PageUtil;

import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.*;

@Service("productCommentService")
public class ProductCommentServiceImpl implements ProductCommentService {
    @Resource(name = "productCommentDao")
    private ProductCommentDao productCommentDao;

    public PageResult getComments(PageUtil pageUtil) {
        List<Map<String,Object>> comments=productCommentDao.getComment(pageUtil);
        int total=productCommentDao.getCommentCount(pageUtil);
        return new PageResult(comments,total,pageUtil.getLimit(),pageUtil.getPage());
    }

    public PageResult getSreachPage(PageUtil pageUtil){
        List<Map<String,Object>> search=productCommentDao.search(pageUtil);
        int total=productCommentDao.getTotalSearch(pageUtil);
        return new PageResult(search,total,pageUtil.getLimit(),pageUtil.getPage());
    }

    public PageResult getHighCommentPage(PageUtil pageUtil) {
        List<Map<String,Object>> search=productCommentDao.getHighComment(pageUtil);
        int total=productCommentDao.getHighCommentCount(pageUtil);
        return new PageResult(search,total,pageUtil.getLimit(),pageUtil.getPage());
    }
    public PageResult getLowCommentPage(PageUtil pageUtil) {
        List<Map<String,Object>> search=productCommentDao.getLowComment(pageUtil);
        int total=productCommentDao.getLowCommentCount(pageUtil);
        return new PageResult(search,total,pageUtil.getLimit(),pageUtil.getPage());
    }

    @Override
    public List<Map<String,Object>> comment(int storeId) {

        List<Map<String,Object>> mapList=productCommentDao.getCommentOne(storeId);
        System.out.println(mapList);
        return mapList;
    }


}
