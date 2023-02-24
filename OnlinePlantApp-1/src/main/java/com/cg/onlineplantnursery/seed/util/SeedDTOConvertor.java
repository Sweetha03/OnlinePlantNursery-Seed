package com.cg.onlineplantnursery.seed.util;

import org.springframework.stereotype.Component;

import com.cg.onlineplantnursery.seed.entity.Seed;
import com.cg.plantnursery.seed.DTO.SeedAdminResponseDTO;
import com.cg.plantnursery.seed.DTO.SeedDTO;

@Component
public class SeedDTOConvertor {

	public SeedAdminResponseDTO getSeedAdminResponseDTO(Seed seed) {

		SeedAdminResponseDTO dto = new SeedAdminResponseDTO();
		dto.setId(seed.getId());
		dto.setSeedName(seed.getSeedName());
		dto.setBloomSeason(seed.getBloomSeason());
		dto.setTypesOfSeeds(seed.getTypesOfSeeds());
		dto.setSeedsStock(seed.getSeedsStock());
		dto.setPrice(seed.getPrice());
		dto.setSeedsPerPacket(seed.getSeedsPerPacket());
		dto.setImage(seed.getImage());
		dto.setAbout(seed.getAbout());
		dto.setDiscount(seed.getDiscount());
		dto.setStarRating(seed.getStarRating());
		
		dto.setMsg("Seed saved");
		return dto;
	}

	public SeedDTO getSeedDTO(Seed s) {

		SeedDTO obj = new SeedDTO(s.getId(), s.getSeedName(), s.getBloomSeason(), s.getTypesOfSeeds(),
				s.getSeedsStock(), s.getPrice(), s.getSeedsPerPacket(),s.getImage(),s.getAbout(),s.getDiscount(),s.getStarRating());
		return obj;
	}

}
