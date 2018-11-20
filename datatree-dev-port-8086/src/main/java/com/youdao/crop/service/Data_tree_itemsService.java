package com.youdao.crop.service;
import com.youdao.crop.entities.Data_tree_items;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gaocheng on 2018/11/19.
 */
@Service
public interface Data_tree_itemsService {
    List<Data_tree_items> queryList();
}
