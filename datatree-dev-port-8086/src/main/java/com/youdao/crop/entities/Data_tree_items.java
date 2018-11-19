package com.youdao.crop.entities;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by gaocheng on 2018/11/19.
 */
@SuppressWarnings("serial")
@NoArgsConstructor
@Data
@Accessors(chain = true)
@Table(name = "data_tree_items")
public class Data_tree_items {
    @Id
    private long id;
    private String type;
    private String tilte;
    private String visible_perms;//(json array) (for type = 'product')
    private String executable_perms;//(json array) (for type = 'folder', 'direct-link', 'args-script')
    private long parent;
    private String linkUrl;//(for type = 'direct-link')
    private String scriptId;//(for type = 'args-script')
    private String script_params;//(json object, for type = 'args-script')
}
/* 建表语句
Create Table

    CREATE TABLE `data_tree_items` (
        `id` bigint(100) NOT NULL AUTO_INCREMENT,
        `type` varchar(100) DEFAULT NULL,
        `title` varchar(100) DEFAULT NULL,
        `visible_perms` varchar(100) DEFAULT NULL,
        `executable_perms` varchar(100) DEFAULT NULL,
        `parent` bigint(100) DEFAULT NULL,
        `linkUrl` varchar(1000) DEFAULT NULL,
        `scriptId` varchar(100) DEFAULT NULL,
        `script_params` varchar(1000) DEFAULT NULL,
        PRIMARY KEY (`id`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8
*/