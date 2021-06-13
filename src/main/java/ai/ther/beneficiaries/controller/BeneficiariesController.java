package ai.ther.beneficiaries.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ai.ther.beneficiaries.entity.DbbmPayeeMtb;
import ai.ther.beneficiaries.service.BeneficariesService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/beneficiary")
@Slf4j
public class BeneficiariesController {

	@Autowired
	private BeneficariesService  beneficariesService;
	
	@PostMapping("/add")
	public DbbmPayeeMtb addBeneficiary(@RequestBody DbbmPayeeMtb entity) {
		log.info("Save Beneficiary - in Controller");
		beneficariesService.addBeneficiary(entity);
		return entity;
		
	}
	
	@GetMapping("/payee/{uuid}")
	public DbbmPayeeMtb getBeneficiary(@PathVariable("uuid") Long uuid) {
		return beneficariesService.getPayee(uuid);
	}
	
}
