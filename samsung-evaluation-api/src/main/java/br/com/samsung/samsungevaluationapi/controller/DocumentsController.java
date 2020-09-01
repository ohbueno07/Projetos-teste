package br.com.samsung.samsungevaluationapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samsung.samsungevaluationapi.service.DocumentsService;
import br.com.samsung.samsungevaluationapi.vo.DocumentsVO;

@RestController
@RequestMapping("/documents")
public class DocumentsController {
	
	@Autowired
	private DocumentsService documentsService;
	
	@GetMapping
	public List<DocumentsVO> getDocuments() {
		return documentsService.getDocuments();
	}

}
