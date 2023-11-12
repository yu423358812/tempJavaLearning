package com.fiserv.ffx.springmongodbtemplate.model.entity;

import com.fiserv.ffx.springmongodbtemplate.constants.CompanyRole;
import com.fiserv.ffx.springmongodbtemplate.constants.CompanyType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Company_User")
public class CompanyUser {
    @Id
    private String id;
    private String companyId;
    private CompanyType companyType;
    private String userId;
    private CompanyRole role;

}
