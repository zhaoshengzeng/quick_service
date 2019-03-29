package com.huayu.quick.mapper;

import com.huayu.quick.pojo.Ideas;
import com.huayu.quick.pojo.IdeasExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IdeasMapper {
    long countByExample(IdeasExample example);

    int deleteByExample(IdeasExample example);

    int deleteByPrimaryKey(String id);

    int insert(Ideas record);

    int insertSelective(Ideas record);

    List<Ideas> selectByExample(IdeasExample example);

    Ideas selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Ideas record, @Param("example") IdeasExample example);

    int updateByExample(@Param("record") Ideas record, @Param("example") IdeasExample example);

    int updateByPrimaryKeySelective(Ideas record);

    int updateByPrimaryKey(Ideas record);
}