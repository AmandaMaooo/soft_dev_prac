package com.len.mapper;

import com.len.base.BaseMapper;
import com.len.entity.ProReUsr;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ProReUsrMapper extends BaseMapper<ProReUsr,String> {
    List<ProReUsr> selectByUId(String u_id);
    List<ProReUsr> selectByPId(String p_id);
}