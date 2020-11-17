....

public interface WebRequester() {
	public int request(Object request)
}

....

public class WebAdapter implements WebRequester{
	
	private WebService service;
	
	public void connect(WebService currentService) {
		this.service = currentService;
		// Connect to the web service
	}
	
	public int request(Object request) {
		Json result = this.toJson(request);
		Json response = service.request(result);
		
		if(response != null)
			return 200; // OK status code
		return 500; // Server error status code
	}
	
	private Json toJson(Object input) { ... }
}

....

public class WebClient {
	
	private WebRequester webRequester;
	
	public WebClient(WebRequester webRequester) { 
		this.webRequester = webRequester;
	}
	
	private Object makeObject(){ ... }  // make an object
	
	
	public void doWork() {
		Object object = makeObject();
		int status = webRequester.request(object);
		
		if(status == 200)
			System.out.println("OK");
		else
			System.out.println("Not OK");
		return;
	}
}

....

public class Program {
	
	public static void main(String args[]) {
		
		String webHost = "Host: https://google.com\n\r";
		WebService service = new WebService(webHost);
		WebAdapter adapter = new WebAdapter();
		adapter.connect(service);
		WebClient client = new WebClient(adapter);
		client.doWork();
		
	}
}

....

