package mockito.src.main;
import java.lang.*;

public class Myservice {
    private ExternalApi api;

    // Constructor injection
    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }
    
}
