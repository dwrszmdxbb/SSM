package com.cn.dwr.service;

import com.cn.dwr.pojo.product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductService {
    //查询所有产品信息
    public List<product> productList(@Param("currentPageNo") Integer currentPageNo, @Param("pageSize") Integer pageSize) throws Exception;
    //查询所有产品数量
    public int productCount()throws Exception;
    //删除产品信息
    public  int delProduct(Integer id)throws Exception;
    //新增产品信息
    public  int addProduct(product pro)throws Exception;
}
