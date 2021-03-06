package br.com.samsung.samsungevaluationapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samsung.samsungevaluationapi.service.QuotationService;
import br.com.samsung.samsungevaluationapi.vo.QuotationVO;

@RestController
@RequestMapping("/quotation")
public class QuotationController {
	
	@Autowired
	private QuotationService currencyService;
	
	@GetMapping
	public List<QuotationVO> getQuotation() {
		return currencyService.getQuotation();
	}
	
	

}
