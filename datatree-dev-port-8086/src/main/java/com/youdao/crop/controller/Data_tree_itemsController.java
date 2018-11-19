package com.youdao.crop.controller;
import com.youdao.crop.entities.Data_tree_items;
import com.youdao.crop.service.Data_tree_itemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * Created by gaocheng on 2018/11/19.
 */
@RestController
public class Data_tree_itemsController {
    @Autowired
    Data_tree_itemsService service;
    @RequestMapping(value="/list",method = RequestMethod.GET)
    public List<Data_tree_items> getList(){
        return service.queryList();
    }
}
