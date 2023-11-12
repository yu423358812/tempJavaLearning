package com.fiserv.ffx.springmongodbtemplate.service.impl;

import com.fiserv.ffx.springmongodbtemplate.model.entity.*;
import com.fiserv.ffx.springmongodbtemplate.repository.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FintechServiceImplTest {

    @InjectMocks
    FintechServiceImpl fintechService;

    @Mock
    private FintechRepository fintechRepository;
    @Mock
    private CompanyAddressRepository addressRepository;
    @Mock
    private DunsInfoRepository dunsInfoRepository;
    @Mock
    private AboutCompanyRepository aboutCompanyRepository;
    @Mock
    private CompanyDetailsRepository companyDetailsRepository;
    @Mock
    private KycVerificationRepository kycVerificationRepository;
    @Mock
    private TeamRepository teamRepository;
    @Mock
    private CompanyDescriptionRepository companyDescriptionRepository;

    @BeforeEach
    public void init(){
        MockitoAnnotations.openMocks(this);
    }
    @Test
    void test_saveFintech(){
        Mockito.when(fintechRepository.save(Mockito.any(Fintech.class))).thenReturn(fintechMockObj());
        Fintech fintech =  fintechService.save(fintechMockObj());
        Assertions.assertNotNull(fintech);
    }

    @Test
    void test_update(){
        Fintech fintech = fintechMockObj();
        fintech.setId("12345");
        Mockito.when(fintechRepository.save(Mockito.any(Fintech.class))).thenReturn(fintech);
        Fintech result =  fintechService.update(fintechMockObj());
        Assertions.assertNotNull(result);
    }

    @Test
    void test_findFintech(){
        List<Fintech> fintechList = new ArrayList<>();
        fintechList.add(fintechMockObj());
        Mockito.when(fintechRepository.findByCompanyNameInIgnoreCase(Mockito.anyString())).thenReturn(fintechList);
        List<Fintech> result = fintechService.findByName("Fintech");
        Assertions.assertEquals(1, result.size());
    }

    @Test
    void test_findFintechById(){
        Mockito.when(fintechRepository.findById(Mockito.anyString()))
                .thenReturn(Optional.of(fintechMockObj()));
        Fintech result = fintechService.findById("1234");
        Assertions.assertNotNull(result);
    }


    private Fintech fintechMockObj(){
        return Fintech.builder().companyName("Fintech")
                .companyWebsite("org.fiserv.com").companyPurchasePlans(true).isLookingForSponsor(true)
                .isSellingProducts(true).companyAddress(companyAddress()).companyDescription(companyDescription())
                .dunsInfo(dunsInfo()).companyDetails(companyDetails()).aboutCompany(aboutCompany())
                .kycVerification(kycVerification()).team(team()).build();

    }

    private CompanyAddress companyAddress(){
        return CompanyAddress.builder().build();
    }
    private CompanyDescription companyDescription(){
        return CompanyDescription.builder().build();
    }
    private DunsInfo dunsInfo(){
        return DunsInfo.builder().build();
    }
    private CompanyDetails companyDetails(){
        return CompanyDetails.builder().build();
    }
    private List<AboutCompany> aboutCompany(){
        List<AboutCompany> aboutCompanyList = new ArrayList<>();
        aboutCompanyList.add(AboutCompany.builder().build());
        return aboutCompanyList;
    }
    private List<KycVerification> kycVerification(){
        List<KycVerification> kycVerificationList = new ArrayList<>();
        kycVerificationList.add(KycVerification.builder().build());
        return kycVerificationList;
    }
    private List<Team> team(){
        List<Team> teamList = new ArrayList<>();
        teamList.add(Team.builder().build());
        return teamList;
    }
}
