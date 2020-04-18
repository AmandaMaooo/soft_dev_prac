package com.len.mapper;

import com.len.base.BaseMapper;
import com.len.entity.RskInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


public interface RskInfoMapper extends BaseMapper<RskInfo,String> {

    List<RskInfo> selectByPmId(String pm_id);
}