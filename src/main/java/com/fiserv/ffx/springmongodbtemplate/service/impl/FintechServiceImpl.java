package com.fiserv.ffx.springmongodbtemplate.service.impl;

import com.fiserv.ffx.springmongodbtemplate.model.entity.Fintech;
import com.fiserv.ffx.springmongodbtemplate.repository.*;
import com.fiserv.ffx.springmongodbtemplate.service.FintechService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FintechServiceImpl implements FintechService {
   private FintechRepository fintechRepository;
   private CompanyAddressRepository addressRepository;
   private DunsInfoRepository dunsInfoRepository;
   private AboutCompanyRepository aboutCompanyRepository;
   private CompanyDetailsRepository companyDetailsRepository;
   private KycVerificationRepository kycVerificationRepository;
   private  TeamRepository teamRepository;
   private CompanyDescriptionRepository companyDescriptionRepository;

    @Override
    public Fintech save(Fintech fintech) {

          List<Fintech> fintechList = findByName(fintech.getCompanyName());

          if(fintechList != null && !fintechList.isEmpty()){
              fintech.setId(fintechList.get(0).getId());
          }

          if (fintech.getCompanyAddress() != null) {
                addressRepository.save(fintech.getCompanyAddress());
          }
          if(fintech.getDunsInfo() != null){
                dunsInfoRepository.save(fintech.getDunsInfo());
          }
          if(fintech.getAboutCompany() != null){
              fintech.getAboutCompany().stream().forEach(AboutCompany -> aboutCompanyRepository.save(AboutCompany));
          }
          if(fintech.getKycVerification() != null){
              fintech.getKycVerification().stream().forEach(KycVerification -> kycVerificationRepository.save(KycVerification));
          }
          if(fintech.getTeam() != null){
              fintech.getTeam().stream().forEach(Team -> teamRepository.save(Team));
          }
          if(fintech.getCompanyDetails() != null){
              companyDetailsRepository.save(fintech.getCompanyDetails());
          }
          if(fintech.getCompanyDescription() != null){
              companyDescriptionRepository.save(fintech.getCompanyDescription());
          }
          return fintechRepository.save(fintech);
        }
    @Override
    public List<Fintech> findByName(String name) {
        return fintechRepository.findByCompanyNameInIgnoreCase(name);
    }

    @Override
    public Fintech findById(String id) {
        return fintechRepository.findById(id).orElse(null);
    }

    @Override
    public Fintech update(Fintech fintech) {
        return save(fintech);
    }

}
