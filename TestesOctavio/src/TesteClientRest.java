import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TesteClientRest {
	
	public static void main(String[] args) {
		try {

            URL url = new URL("https://cellolatam.cellologistics.com.br/sds-devs-evaluation/evaluation/currency"); //your url i.e fetch data from .
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
            
            conn.disconnect();

        } catch (Exception e) {
            System.out.println("Exception in NetClientGet:- " + e);
        }
	}
	
	private void convertJSONToCurrencyVO() {
		//UserIdentifier userIdentifier = gson.fromJson(jsonResponse.getJSONObject("userIdentifier").toString(), UserIdentifier.class);
		//JSONObject json = new JSONObject(sb.toString());
	}

}
