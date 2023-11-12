package com.fiserv.ffx.springmongodbtemplate.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "companyDescription")
public class CompanyDescription {
    @Id
    private String id;
    private String aboutCompany;
    private String missionStatement;
    private String valuePropositions;
    private Boolean anySpecialAchievements;
    private String achievements;
}
