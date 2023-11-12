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
@Document(collection = "team")
public class Team {
    @Id
    private String id;
    private String name;
    private List<String> companyRole;
    private String socialMediaAddress;
    private String expertise;
    private Integer yearsOfExperience;
    private Boolean haveComplianceSpecialist;
    private Boolean areYouAdmin;
    private Boolean inHouseCounsel;
}
