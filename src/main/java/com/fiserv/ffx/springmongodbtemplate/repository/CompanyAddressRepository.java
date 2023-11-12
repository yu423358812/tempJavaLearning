package com.fiserv.ffx.springmongodbtemplate.repository;

import com.fiserv.ffx.springmongodbtemplate.model.entity.CompanyAddress;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompanyAddressRepository extends MongoRepository<CompanyAddress, String> {

    CompanyAddress save(CompanyAddress companyAddress);
}
