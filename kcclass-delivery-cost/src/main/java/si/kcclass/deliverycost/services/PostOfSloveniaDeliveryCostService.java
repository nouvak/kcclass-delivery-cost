package si.kcclass.deliverycost.services;

import org.springframework.stereotype.Service;

import si.kcclass.deliverycost.domain.DeliveryCostRequest;

@Service
public class PostOfSloveniaDeliveryCostService implements DeliveryCostService {
	
	@Override
	public Double getDeliveryCost(DeliveryCostRequest request) {
		try {
			if (!request.getShipper().getCountry().getCode().equals("SI")) {
				throw new Exception("The Post of Slovenia supports only shipping from Slovenia (SI).");
			}
			if (request.getRecipient().getCountry().getCode().equals("SI")) {
				return domesticRates(request.getWeight());
			}
			else if (isEuropeanUnion(request.getRecipient().getCountry().getCode())) {
				return europeanUnionRates(request.getWeight());
			}
			else if (isOtherEuropeanCountry(request.getRecipient().getCountry().getCode())) {
				return otherEuropeanCountriesRates(request.getWeight());
			}
			else {
				return otherCountriesRates(request.getWeight());
			}
		}
		catch (Exception e) {
			return null;
		}
	}
	
	private boolean isEuropeanUnion(String countryCode) {
		return countryCode.equals("BE") ||
				countryCode.equals("BG") ||
				countryCode.equals("CZ") ||
				countryCode.equals("DK") ||
				countryCode.equals("DE") ||
				countryCode.equals("EE") ||
				countryCode.equals("IE") ||
				countryCode.equals("EL") ||
				countryCode.equals("ES") ||
				countryCode.equals("FR") ||
				countryCode.equals("IT") ||
				countryCode.equals("CY") ||
				countryCode.equals("LV") ||
				countryCode.equals("LT") ||
				countryCode.equals("LU") ||
				countryCode.equals("HU") ||
				countryCode.equals("MT") ||
				countryCode.equals("NL") ||
				countryCode.equals("AT") ||
				countryCode.equals("PL") ||
				countryCode.equals("PT") ||
				countryCode.equals("RO") ||
				countryCode.equals("SI") ||
				countryCode.equals("SK") ||
				countryCode.equals("FI") ||
				countryCode.equals("SE") ||
				countryCode.equals("UK");
	}
	
	private boolean isOtherEuropeanCountry(String countryCode) {
		return countryCode.equals("AL") ||
				countryCode.equals("AD") ||
				countryCode.equals("AM") ||
				countryCode.equals("AZ") ||
				countryCode.equals("BY") ||
				countryCode.equals("BA") ||
				countryCode.equals("HR") ||
				countryCode.equals("GE") ||
				countryCode.equals("KZ") ||
				countryCode.equals("MK") ||
				countryCode.equals("MD") ||
				countryCode.equals("MC") ||
				countryCode.equals("ME") ||
				countryCode.equals("NO") ||
				countryCode.equals("RU") ||
				countryCode.equals("SM") ||
				countryCode.equals("RS") ||
				countryCode.equals("CH") ||
				countryCode.equals("TR") ||
				countryCode.equals("UA") ||
				countryCode.equals("VA");
	}
	
	private Double domesticRates(Double weightKilos) throws Exception {
		if (weightKilos <= 2) {
			return 3.73;
		}
		else if (weightKilos > 2 && weightKilos <= 5) {
			return 4.45;
		}
		else if (weightKilos > 5 && weightKilos <= 10) {
			return 6.54;
		}
		else if (weightKilos > 10 && weightKilos <= 15) {
			return 6.8833;
		}
		else if (weightKilos > 15 && weightKilos <= 20) {
			return 7.925;
		}
		else if (weightKilos > 20 && weightKilos <= 25) {
			return 9.3333;
		}
		else if (weightKilos > 25 && weightKilos <= 30) {
			return 11.0583;
		}
		else {
			throw new Exception("Weight out of bounds.");
		}
	}
	
	private Double europeanUnionRates(Double weightKilos) throws Exception {
		if (weightKilos <= 2) {
			return 13.67;
		}
		else if (weightKilos > 2 && weightKilos <= 5) {
			return 20.48;
		}
		else if (weightKilos > 5 && weightKilos <= 10) {
			return 25.0;
		}
		else if (weightKilos > 10 && weightKilos <= 15) {
			return 29.5917;
		}
		else if (weightKilos > 15 && weightKilos <= 20) {
			return 34.15;
		}
		else if (weightKilos > 20 && weightKilos <= 25) {
			return 40.975;
		}
		else if (weightKilos > 25 && weightKilos <= 30) {
			return 50.075;
		}
		else {
			throw new Exception("Weight out of bounds.");
		}
	}

	private Double otherEuropeanCountriesRates(Double weightKilos) throws Exception {
		if (weightKilos <= 2) {
			return 16.4;
		}
		else if (weightKilos > 2 && weightKilos <= 5) {
			return 24.58;
		}
		else if (weightKilos > 5 && weightKilos <= 10) {
			return 30.0;
		}
		else if (weightKilos > 10 && weightKilos <= 15) {
			return 35.51;
		}
		else if (weightKilos > 15 && weightKilos <= 20) {
			return 40.98;
		}
		else if (weightKilos > 20 && weightKilos <= 25) {
			return 49.17;
		}
		else if (weightKilos > 25 && weightKilos <= 30) {
			return 60.09;
		}
		else {
			throw new Exception("Weight out of bounds.");
		}
	}
	
	private Double otherCountriesRates(Double weightKilos) throws Exception {
		if (weightKilos <= 2) {
			return 38.27;
		}
		else if (weightKilos > 2 && weightKilos <= 5) {
			return 46.44;
		}
		else if (weightKilos > 5 && weightKilos <= 10) {
			return 51.87;
		}
		else if (weightKilos > 10 && weightKilos <= 15) {
			return 57.38;
		}
		else if (weightKilos > 15 && weightKilos <= 20) {
			return 62.84;
		}
		else if (weightKilos > 20 && weightKilos <= 25) {
			return 71.02;
		}
		else if (weightKilos > 25 && weightKilos <= 30) {
			return 81.96;
		}
		else {
			throw new Exception("Weight out of bounds.");
		}
	}
}
