package com.cn.dwr.controller;

import com.cn.dwr.pojo.catagory;
import com.cn.dwr.pojo.product;
import com.cn.dwr.service.CatagoryService;
import com.cn.dwr.service.ProductService;
import com.cn.dwr.tools.PageSupport;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ProductController {
      @Resource
      private ProductService productService;
      @Resource
      private CatagoryService catagoryService;
    //跳转到展示页面
    @RequestMapping("proInList")
    public String proInList(Model model, @RequestParam(value="pageIndex",required=false) String pageIndex){
        //查询分页帖子所有信息
        List<product> productList = null;
        //设置页面容量
        int pageSize =5;
        //当前页码
        int currentPageNo = 1;
        if(pageIndex != null){
            try{
                currentPageNo = Integer.valueOf(pageIndex);
            }catch(NumberFormatException e){
                e.printStackTrace();
            }
        }
        //总数量（表）
        int totalCount=0;
        try {
            totalCount =productService.productCount();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //总页数
        PageSupport pages=new PageSupport();
        pages.setCurrentPageNo(currentPageNo);
        pages.setPageSize(pageSize);
        pages.setTotalCount(totalCount);
        int totalPageCount = pages.getTotalPageCount();
        //控制首页和尾页
        if(currentPageNo < 1){
            currentPageNo = 1;
        }else if(currentPageNo > totalPageCount){
            currentPageNo = totalPageCount;
        }
        try {
            productList = productService.productList(currentPageNo,pageSize);
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("productList", productList);
        model.addAttribute("pages", pages);
        model.addAttribute("currentPageNo",currentPageNo);
        model.addAttribute("totalPageCount",totalPageCount);
        return "product/productList";
    }
    @RequestMapping("delProduct")
    public String delProduct(@RequestParam String id){
        int count=0;
        try {
            count=productService.delProduct(Integer.parseInt(id));
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (count>0){
            return "redirect:proInList";
        }
        return "redirect:proInList";
    }
    //跳转到新增页面
    @RequestMapping("addProduct")
    public String addProduct(product pro, Model model) throws Exception {
        List<catagory> infoList=catagoryService.cataList();
        model.addAttribute("infoList",infoList);
        return "product/addProduct";
    }
    //新增保存
    @RequestMapping("addSave")
    public  String addSave(product pro) throws Exception {
       int count=productService.addProduct(pro);
       if (count>0){
           return "redirect:proInList";
       }
       return "redirect:addProduct";
    }

    /*gdfjklsfvgdjkh*/
}
