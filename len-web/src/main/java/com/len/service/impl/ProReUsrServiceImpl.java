package com.len.service.impl;

import com.len.base.BaseMapper;
import com.len.base.impl.BaseServiceImpl;
import com.len.entity.ProReUsr;
import com.len.mapper.ProReUsrMapper;
import com.len.service.ProReUsrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProReUsrServiceImpl extends BaseServiceImpl<ProReUsr, String> implements ProReUsrService {

    @Autowired
    private ProReUsrMapper proReUsrMapper;

    @Override
    public BaseMapper<ProReUsr, String> getMappser() {
        return proReUsrMapper;
    }

    @Override
    public List<ProReUsr> selectByUId(String u_id) {
        return proReUsrMapper.selectByUId(u_id);
    }

    @Override
    public List<ProReUsr> selectByPId(String p_id) {
        return proReUsrMapper.selectByPId(p_id);
    }
}
