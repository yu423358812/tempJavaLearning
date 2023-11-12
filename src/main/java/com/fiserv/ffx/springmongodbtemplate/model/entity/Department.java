package com.fiserv.ffx.springmongodbtemplate.model.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "departments")
public class Department {

	@Id
	private String id;

	private String name;
}
