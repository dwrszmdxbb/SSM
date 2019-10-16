package com.cn.dwr.service.impl;

import com.cn.dwr.mapper.ProductMapper;
import com.cn.dwr.pojo.product;
import com.cn.dwr.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductMapper productMapper;
    @Override
    public List<product> productList(Integer currentPageNo, Integer pageSize) throws Exception {
        List<product> proList= productMapper.productList((currentPageNo-1)*pageSize,pageSize);
        return proList;
    }
    @Override
    public int productCount() throws Exception {
        int count=productMapper.productCount();
        return count;
    }

    @Override
    public int delProduct(Integer id) throws Exception {
        int count=productMapper.delProduct(id);
        return count;
    }

    @Override
    public int addProduct(product pro) throws Exception {
       int count= productMapper.addProduct(pro);
        return count;
    }
}
