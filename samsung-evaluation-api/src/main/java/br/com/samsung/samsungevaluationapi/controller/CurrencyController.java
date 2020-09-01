package br.com.samsung.samsungevaluationapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samsung.samsungevaluationapi.service.CurrencyService;
import br.com.samsung.samsungevaluationapi.vo.CurrencyVO;

@RestController
@RequestMapping("/currency")
public class CurrencyController {
	
	@Autowired
	private CurrencyService currencyService;
	
	@GetMapping
	public List<CurrencyVO> getCurrency() {
		return currencyService.getCurrency();
	}
	
	

}
