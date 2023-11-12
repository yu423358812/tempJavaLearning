package com.fiserv.ffx.springmongodbtemplate.repository;

import com.fiserv.ffx.springmongodbtemplate.model.entity.KycVerification;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface KycVerificationRepository extends MongoRepository<KycVerification, String> {
    KycVerification save(KycVerification kycVerification);
}
