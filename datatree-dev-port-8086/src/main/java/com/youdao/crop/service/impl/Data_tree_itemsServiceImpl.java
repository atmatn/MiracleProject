package com.youdao.crop.service.impl;
import com.youdao.crop.entities.Data_tree_items;
import com.youdao.crop.mapper.Data_tree_itemsMapper;
import com.youdao.crop.service.Data_tree_itemsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by gaocheng on 2018/11/19.
 */
public class Data_tree_itemsServiceImpl implements Data_tree_itemsService {
    @Autowired
    Data_tree_itemsMapper mapper;

    @Override
    public List<Data_tree_items> queryList() {

        return mapper.selectAll();
    }
}
