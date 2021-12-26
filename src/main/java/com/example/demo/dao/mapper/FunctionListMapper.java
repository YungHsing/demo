package com.example.demo.dao.mapper;

import com.example.demo.dao.entities.FunctionList;
import com.example.demo.dao.entities.FunctionListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FunctionListMapper {
    long countByExample(FunctionListExample example);

    int deleteByExample(FunctionListExample example);

    int insert(FunctionList record);

    int insertSelective(FunctionList record);

    List<FunctionList> selectByExample(FunctionListExample example);

    int updateByExampleSelective(@Param("record") FunctionList record, @Param("example") FunctionListExample example);

    int updateByExample(@Param("record") FunctionList record, @Param("example") FunctionListExample example);
}