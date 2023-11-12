package com.fiserv.ffx.springmongodbtemplate.repository;

import com.fiserv.ffx.springmongodbtemplate.model.entity.CompanyDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompanyDetailsRepository extends MongoRepository<CompanyDetails, String> {
    CompanyDetails save(CompanyDetails companyDetails);
}
