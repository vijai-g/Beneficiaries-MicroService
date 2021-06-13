package ai.ther.beneficiaries.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ai.ther.beneficiaries.entity.DbbmPayeeMtb;
import ai.ther.beneficiaries.repository.BeneficiaryRepository;

@Service
public class BeneficariesService {

	@Autowired
	private BeneficiaryRepository beneficiaryRepository;

	public DbbmPayeeMtb addBeneficiary(DbbmPayeeMtb entity) {
		return beneficiaryRepository.save(entity);
		
	}

	public DbbmPayeeMtb getPayee(Long uuid) {
		
		return beneficiaryRepository.getById(uuid);
	}
}
