package com.huayu.quick.mapper;

import com.huayu.quick.pojo.Master;
import com.huayu.quick.pojo.MasterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MasterMapper {
    long countByExample(MasterExample example);

    int deleteByExample(MasterExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(Master record);

    int insertSelective(Master record);

    List<Master> selectByExample(MasterExample example);

    Master selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") Master record, @Param("example") MasterExample example);

    int updateByExample(@Param("record") Master record, @Param("example") MasterExample example);

    int updateByPrimaryKeySelective(Master record);

    int updateByPrimaryKey(Master record);
}