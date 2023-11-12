package com.fiserv.ffx.springmongodbtemplate.model.entity;

import com.fiserv.ffx.springmongodbtemplate.constants.*;
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
@Document(collection = "companyDetails")
public class CompanyDetails {
    @Id
    private String id;
    private String yearFounded;
    private Integer employeeRangeMin;
    private Integer employeeRangeMax;
    private Integer revenueRangeMin;
    private Integer revenueRangeMax;
    private InvestmentStage investmentStage;
    private List<Regions> serviceRegions;
    private List<ServiceIndustries> serviceIndustries;
    private List<BankingServices> bankingServiceSpecialties;
    private List<TargetAudience> targetAudience;
    private List<Compliance> complianceAreas;
    private String companyImageUrl;
}
