package ETicaretDemo.core.entities;

import ETicaretDemo.Google.GoogleManager;
import ETicaretDemo.core.abstracts.LoggerService;

public class GoogleManagerAdaptor implements LoggerService{

	@Override
	public void logToSystem(String message) {
		GoogleManager manager = new GoogleManager();
        manager.register(message);
	}

}
