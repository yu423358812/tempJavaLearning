    package com.fiserv.ffx.springmongodbtemplate.model.entity;

    import lombok.AllArgsConstructor;
    import lombok.Builder;
    import lombok.Data;
    import lombok.NoArgsConstructor;
    import org.springframework.data.annotation.Id;
    import org.springframework.data.mongodb.core.mapping.DBRef;
    import org.springframework.data.mongodb.core.mapping.Document;

    import java.util.List;

    @Builder
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Document(collection = "fintech")
    public class Fintech {
        @Id
        private String id;
        private String companyName;
        private Boolean companyPurchasePlans;
        private Boolean isLookingForSponsor;
        private Boolean isSellingProducts;
        private String companyWebsite;
        @DBRef
        private DunsInfo dunsInfo;
        @DBRef
        private CompanyAddress companyAddress;
        @DBRef
        private List<KycVerification> kycVerification;
        @DBRef
        private List<Team> team;
        @DBRef
        private List<AboutCompany> aboutCompany;
        @DBRef
        private CompanyDetails companyDetails;
        @DBRef
        private CompanyDescription companyDescription;
    }
