package com.fiserv.ffx.springmongodbtemplate.model.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "banks")
public class Bank{

	@Id
	private String id;
	private String name;
	private String zip;
	private List<String> bankSettings;
    private List<String> customerSegments;
	private List<String> bankingFeatures;
    private List<String> areasOfExpansion;

}