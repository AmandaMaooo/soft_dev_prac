package com.len.qo;

import com.len.entity.ProReUsr;
import com.len.entity.ProWorInfoMan;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class ProjectMemberDetail {
    protected String id;

    private String pmId;

    private String pmName;

    private String projCustomer;

    private String projName;

    private String projNo;

    private String projState;

    private List<ProWorInfoMan> projMember;

}
