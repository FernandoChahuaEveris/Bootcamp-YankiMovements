package com.everis.yankitransaction.model;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document
public class YankiMovement {
	@Id
	private UUID id;
	
	private String cellphoneNumber;
	private Double amount;
	private String typeMovement;
	private LocalDateTime movementDate;
}
