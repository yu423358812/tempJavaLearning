package com.fiserv.ffx.springmongodbtemplate.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "aboutCompany")
public class AboutCompany {
    @Id
    private String id;
    private List<String> companyRole;
    private List<String> socialMediaAddress;
    private String expertise;
    private Boolean hasBankExperience;
    private Integer yearsOfExperience;
    private Boolean hasComplianceSkill;
}
