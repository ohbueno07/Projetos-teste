package br.com.samsung.samsungevaluationapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.samsung.samsungevaluationapi.repository.CurrencyRepository;
import br.com.samsung.samsungevaluationapi.vo.CurrencyVO;

@Service
public class CurrencyService {
	
	@Autowired
	CurrencyRepository respository;
	
	public List<CurrencyVO> getCurrency() {
		return respository.getCurrency();
	}

}
