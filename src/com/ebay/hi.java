package com.ebay;


import com.ebay.services.client.ClientConfig;
import com.ebay.services.client.FindingServiceClientFactory;
import com.ebay.services.finding.FindItemsByKeywordsRequest;
import com.ebay.services.finding.FindItemsByKeywordsResponse;
import com.ebay.services.finding.FindingServicePortType;
import com.ebay.services.finding.PaginationInput;
import com.ebay.services.finding.SearchItem;
import java.util.List;



public class hi {
	
	public static void main(String[] args) throws Exception{
		
		try {
		ClientConfig config = new ClientConfig();
		config.setApplicationId("JesseFen-MyApp-PRD-67aae6145-dbf68883");
		config.setGlobalId("EBAY-US");
		config.setEndPointAddress("http://svcs.ebay.com/services/search/FindingService/v1");
		config.setSoapMessageLoggingEnabled(true);
        
		FindingServicePortType serviceClient = 
				FindingServiceClientFactory.getServiceClient(config);
		
        // Build request
        FindItemsByKeywordsRequest request = new FindItemsByKeywordsRequest();
        String keywords = ("Razer Naga");
        request.setKeywords(keywords);
        PaginationInput pi = new PaginationInput();
        pi.setPageNumber(1);
        pi.setEntriesPerPage(1);
        request.setPaginationInput(pi);
        
        
        FindItemsByKeywordsResponse response = 
        		serviceClient.findItemsByKeywords(request);
        
        System.out.println(response.getAck());
        System.out.println(response.getSearchResult());
		
		
		List<SearchItem> items = response.getSearchResult().getItem();
		
		for(SearchItem item : items) {
			System.out.println(item.getTitle());
		}
		}
		
		catch (Exception ex) {
        	// handle exception if any
            ex.printStackTrace();
        }
			
		
	}     
	
}



