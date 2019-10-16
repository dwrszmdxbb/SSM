package com.cn.dwr.service.impl;

import com.cn.dwr.mapper.CatagoryMapper;
import com.cn.dwr.pojo.catagory;
import com.cn.dwr.service.CatagoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CatagoryServiceImpl implements CatagoryService {
    @Resource
    private CatagoryMapper catagoryMapper;
    @Override
    public List<catagory> cataList() throws Exception {
        List<catagory>  catagoryList= catagoryMapper.cataList();
        if (catagoryList!=null){
            return catagoryList;
        }
        return null;
    }
}
