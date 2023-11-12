package com.fiserv.ffx.springmongodbtemplate.repository;

import com.fiserv.ffx.springmongodbtemplate.model.entity.AboutCompany;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AboutCompanyRepository extends MongoRepository<AboutCompany, String> {
    AboutCompany save(AboutCompany aboutCompany);
}
