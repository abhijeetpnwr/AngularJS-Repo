package themotivationboard;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuotesReader 
{
	public List<String> getmessages() 
	{
		// TODO Auto-generated method stub
		
		List<String> quoteslist = new ArrayList<String>();
		BufferedReader br;
		
		try {
			
					ClassLoader classLoader = getClass().getClassLoader();
				    File file = new File(classLoader.getResource("motivational.txt").getFile());
			
					Scanner sc = new Scanner(file);
		
						
		String sCurrentLine;
			
			while (sc.hasNextLine()) 
			{		
				quoteslist.add(sc.nextLine());				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	    return quoteslist;
	}
}
