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
@Document(collection = "dunsInfo")
public class DunsInfo {
    @Id
    private String id;
    private String dunsNumber;
    private String validationStatus;
}
