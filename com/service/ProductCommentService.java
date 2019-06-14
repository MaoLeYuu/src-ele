package com.service;

import com.controller.result.productCommentBean;
import com.utils.PageResult;
import com.utils.PageUtil;

import java.util.List;
import java.util.Map;

public interface ProductCommentService {
    PageResult getComments(PageUtil pageUtil);

    PageResult getSreachPage(PageUtil pageUtil);

    PageResult getHighCommentPage(PageUtil pageUtil);
    PageResult getLowCommentPage(PageUtil pageUtil);
    List<Map<String,Object>> comment(int storeId);
}
