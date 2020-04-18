package com.len.service.impl;

import com.len.base.BaseMapper;
import com.len.base.impl.BaseServiceImpl;
import com.len.entity.ProWorInfoMan;
import com.len.mapper.ProWorInfoManMapper;
import com.len.service.ProWorInfoManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProWorInfoManServiceImpl extends BaseServiceImpl<ProWorInfoMan, String> implements ProWorInfoManService {

    @Autowired
    private ProWorInfoManMapper proWorInfoManMapper;

    @Override
    public BaseMapper<ProWorInfoMan, String> getMappser() {
        return proWorInfoManMapper;
    }

    @Override
    public List<ProWorInfoMan> selectByUId(String u_id) {
        return proWorInfoManMapper.selectByUId(u_id);
    }

    @Override
    public List<ProWorInfoMan> selectByPId(String p_id) {
        return proWorInfoManMapper.selectByPId(p_id);
    }
}