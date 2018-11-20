package com.youdao.crop.dao;

import com.youdao.crop.entities.Data_tree_items;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by gaocheng on 2018/11/20.
 */
@Mapper
public interface Data_tree_itemsDao {
    public List<Data_tree_items> findAll();
}
