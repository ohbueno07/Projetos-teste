package br.com.samsung.samsungevaluationapi.repository;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.samsung.samsungevaluationapi.vo.DocumentsVO;

@Repository
public class DocumentsRepository {
	
	public List<DocumentsVO> getDocuments() {
		List<DocumentsVO> listDocuments = null;
		
		try {

            URL url = new URL("https://cellolatam.cellologistics.com.br/sds-devs-evaluation/evaluation/docs"); 
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP Error code : " + conn.getResponseCode());
            }
            
            InputStreamReader in = new InputStreamReader(conn.getInputStream());
            BufferedReader br = new BufferedReader(in);
            StringBuilder sb = new StringBuilder();
            String output;
            
            while ((output = br.readLine()) != null) {
            	System.out.println(output);
                sb.append(output);
            }
            
            listDocuments = new ObjectMapper().readValue(sb.toString(), new TypeReference<List<DocumentsVO>>() {});
            conn.disconnect();

        } catch (Exception e) {
            System.out.println("Exception in getCurrency: " + e);
        }
		
		return listDocuments;
	}



}