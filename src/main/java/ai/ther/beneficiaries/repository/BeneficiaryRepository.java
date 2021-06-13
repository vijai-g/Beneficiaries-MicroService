/**
 * 
 */
package ai.ther.beneficiaries.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.stereotype.Repository;

import ai.ther.beneficiaries.entity.DbbmPayeeMtb;

/**
 * @author Vijai
 *
 */
@Repository
public interface BeneficiaryRepository extends JpaRepository<DbbmPayeeMtb, Long>  {

	
}
