package com.ztravel.demo.gen.dao;

import com.ztravel.demo.gen.po.Menu;
import com.ztravel.demo.gen.po.MenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MenuMapper {
    int countByExample(MenuExample example);

    int deleteByExample(MenuExample example);

    int deleteByPrimaryKey(Integer menuId);

    int insert(Menu record);

    int insertSelective(Menu record);

    List<Menu> selectByExampleWithRowbounds(MenuExample example, RowBounds rowBounds);

    List<Menu> selectByExample(MenuExample example);

    Menu selectByPrimaryKey(Integer menuId);

    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}