package com.cg.plantnursery.seed.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeedAdminResponseDTO {
	
	private int id;
	private String seedName;
	private String bloomSeason;
	private String typesOfSeeds;
	private int seedsStock;
	private double price;
	private int seedsPerPacket;
	private String image;
	private String about;
	private String discount;
	private int starRating;
	
	private String msg;

	
		
	}


