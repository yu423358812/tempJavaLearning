package com.fiserv.ffx.springmongodbtemplate.model.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users")
public class User {

	@Id
	private String id;
	private Long registryNo;
	private String firstName;
	private String lastName;
	private String email;
	private String encryptedPassword;
	private Department department;
	private Boolean isApprover;
}