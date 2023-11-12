package com.fiserv.ffx.springmongodbtemplate.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "kycVerification")
public class KycVerification {
    @Id
    private String id;
    private String validationStatus;
    private String description;
    private Date requestedDate;
    private Date approvedUntil;
    private Date responseDate;
    private Object lexisNexisAttributes;
}
