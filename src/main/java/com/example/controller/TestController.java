package com.example.controller;

import com.example.entity.SaleGoods;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author gaosong
 * @Date 2021/1/11 12:24
 * @Version 1.0
 */
@Controller
public class TestController {
    @ResponseBody
    @RequestMapping(value = "/get/httpmassageconverter",method = RequestMethod.GET)
    public SaleGoods httpMessageConverterTest(){
        SaleGoods saleGoods = new SaleGoods();
        saleGoods.setGoodsName("华为手机");
        saleGoods.setId(1);
        saleGoods.setOnSale(true);
        saleGoods.setType(1);
        saleGoods.setWeight(300);
        return saleGoods;
    }

    @RequestMapping(value = "/test/httpmessageconverter",method = RequestMethod.POST)
    @ResponseBody
    public SaleGoods httpMessageConverterTest2(@RequestBody SaleGoods saleGoods){
        System.out.println(saleGoods.toString());
        saleGoods.setType(saleGoods.getType()+1);
        saleGoods.setGoodsName("商品名："+saleGoods.getGoodsName());
        return saleGoods;
    }

}
