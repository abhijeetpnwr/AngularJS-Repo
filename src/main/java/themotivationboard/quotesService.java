package themotivationboard;

import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;



@Path("/quotesservice")
public class quotesService {
 
	  @GET
	  @Produces("application/json")
	  public Response convertFtoC() throws JSONException {
 
		JSONObject jsonObject = new JSONObject();
		
		JSONArray Jsarray = new JSONArray();
		
		
		List<String> quoteslist = new ArrayList<String>();
		BufferedReader br;
		
		try {
			
					ClassLoader classLoader = getClass().getClassLoader();
				    File file = new File(classLoader.getResource("motivational.txt").getFile());
			
					Scanner sc = new Scanner(file);
		
						
		String sCurrentLine;
			
			while (sc.hasNextLine()) 
			{		
				String linecontent = sc.nextLine();
				
				if(linecontent.trim().length()>0)
				{
					Jsarray.put(linecontent);
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String result = "Output: \n\n Quotes Fetched : \n\n" + Jsarray;
		return Response.status(200).entity(result).build();
	  }
 
}