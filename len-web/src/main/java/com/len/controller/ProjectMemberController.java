package com.len.controller;

import com.alibaba.fastjson.JSON;
import com.len.core.annotation.Log;
import com.len.core.shiro.Principal;
import com.len.entity.ProReUsr;
import com.len.entity.ProjectInfo;
import com.len.entity.RskInfo;
import com.len.entity.SysUser;
import com.len.qo.ProjectMemberDetail;
import com.len.service.*;
import com.len.util.ReType;
import io.swagger.annotations.ApiOperation;
import org.activiti.engine.*;
import org.activiti.spring.ProcessEngineFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/proMember")
public class ProjectMemberController {

    @Autowired
    private ProjectInfoService projectInfoService;
    @Autowired
    private SysUserService userService;

    @Autowired
    private ProReUsrService proReUsrService;

    @Autowired
    private RiskInfoService riskInfoService;


    @ApiOperation(value = "项目成员",httpMethod = "GET")
    @Log(desc = "获取项目成员等信息")
    @GetMapping("showProjectList")
    @ResponseBody
    public ReType ProjectList() {
        List<ProjectMemberDetail> lists=new ArrayList<>();
        List<ProReUsr> proReUsrList=proReUsrService.selectByUId(Principal.getPrincipal().getId());

        for(ProReUsr proReUsr: proReUsrList){
            System.out.println("yilun:");
            System.out.println(proReUsr.getpId());
            ProjectInfo projectInfo = projectInfoService.selectByPrimaryKey(proReUsr.getpId());
            System.out.println(projectInfo.getId());
            List<ProReUsr> proReUsrs = proReUsrService.selectByPId(projectInfo.getId());
            ProjectMemberDetail projectMemberDetail=new ProjectMemberDetail(
                    projectInfo.getId(),projectInfo.getPmId(),projectInfo.getPmName(),projectInfo.getProjCustomer(),
                    projectInfo.getProjName(),projectInfo.getProjNo(),projectInfo.getProjState(),proReUsrs
                    );
            lists.add(projectMemberDetail);
        }

        return new ReType(lists.size(), lists);
    }

    @ApiOperation(value = "指定项目成员",httpMethod = "GET")
    @Log(desc = "指定项目成员等信息")
    @GetMapping("showMemberList")
    @ResponseBody
    public ReType MemberList(String riskId) {
        RskInfo rskInfo=riskInfoService.selectByPrimaryKey(riskId);
        System.out.println(JSON.toJSONString(rskInfo));
        List<ProReUsr> lists = proReUsrService.selectByPId(rskInfo.getpId());

        return new ReType(lists.size(), lists);
    }

}