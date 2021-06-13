package ai.ther.beneficiaries.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DbbmPayeeMtb implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long payeeUuid;
	
	private String payeeName;
	private String status;
	private String payeeType;
}
