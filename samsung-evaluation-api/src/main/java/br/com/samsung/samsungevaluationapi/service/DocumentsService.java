package br.com.samsung.samsungevaluationapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.samsung.samsungevaluationapi.repository.DocumentsRepository;
import br.com.samsung.samsungevaluationapi.vo.DocumentsVO;

@Service
public class DocumentsService {
	
	@Autowired
	DocumentsRepository respository;
	
	public List<DocumentsVO> getDocuments() {
		return respository.getDocuments();
	}

}
