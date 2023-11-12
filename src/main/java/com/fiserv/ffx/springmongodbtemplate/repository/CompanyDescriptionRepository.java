package com.fiserv.ffx.springmongodbtemplate.repository;

import com.fiserv.ffx.springmongodbtemplate.model.entity.CompanyDescription;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompanyDescriptionRepository extends MongoRepository<CompanyDescription, String> {
    CompanyDescription save(CompanyDescription companyDescription);
}
