package com.len.entity;

import javax.persistence.*;

@Table(name = "pro_re_usr")
public class ProReUsr {
    /**
     * 项目-项目成员关系id
     */
    @Id
    private Integer id;

    /**
     * 项目id
     */
    @Column(name = "P_ID")
    private String pId;

    /**
     * 成员id
     */
    @Column(name = "U_ID")
    private String uId;

    /**
     * 成员名字
     */
    @Column(name = "U_Name")
    private String uName;

    /**
     * 获取项目-项目成员关系id
     *
     * @return id - 项目-项目成员关系id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置项目-项目成员关系id
     *
     * @param id 项目-项目成员关系id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取项目id
     *
     * @return P_ID - 项目id
     */
    public String getpId() {
        return pId;
    }

    /**
     * 设置项目id
     *
     * @param pId 项目id
     */
    public void setpId(String pId) {
        this.pId = pId == null ? null : pId.trim();
    }

    /**
     * 获取成员id
     *
     * @return U_ID - 成员id
     */
    public String getuId() {
        return uId;
    }

    /**
     * 设置成员id
     *
     * @param uId 成员id
     */
    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    /**
     * 获取成员名字
     *
     * @return U_Name - 成员名字
     */
    public String getuName() {
        return uName;
    }

    /**
     * 设置成员名字
     *
     * @param uName 成员名字
     */
    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }
}