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
    @Document(collection = "companyAddress")
    public class CompanyAddress {
        @Id
        private String id;
        private String country;
        private String addressLine1;
        private String addressLine2;
        private String city;
        private String stateProvince;
        private String postalCode;
    }
