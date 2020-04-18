package com.len.service;

import com.len.base.BaseService;
import com.len.entity.ProWorInfoMan;

import java.util.List;

public interface ProWorInfoManService extends BaseService<ProWorInfoMan, String> {
        List<ProWorInfoMan> selectByUId(String u_id);

        List<ProWorInfoMan> selectByPId(String p_id);
}