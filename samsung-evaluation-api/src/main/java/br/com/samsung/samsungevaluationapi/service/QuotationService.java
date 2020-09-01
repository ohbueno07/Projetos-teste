package br.com.samsung.samsungevaluationapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.samsung.samsungevaluationapi.repository.QuotationRepository;
import br.com.samsung.samsungevaluationapi.vo.QuotationVO;

@Service
public class QuotationService {
	
	@Autowired
	QuotationRepository respository;
	
	public List<QuotationVO> getQuotation() {
		return respository.getQuotation();
	}

}
