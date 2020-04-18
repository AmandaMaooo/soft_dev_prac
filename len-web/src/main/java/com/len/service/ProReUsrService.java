package com.len.service;

import com.len.base.BaseService;
import com.len.entity.ProReUsr;

import java.util.List;

public interface ProReUsrService extends BaseService<ProReUsr, String> {
    List<ProReUsr> selectByUId(String u_id);

    List<ProReUsr> selectByPId(String p_id);
}
