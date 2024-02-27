package hungnk.sse.messagingsse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hungnk1
 */
@SpringBootApplication
public class MessagingSseApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessagingSseApplication.class, args);
        System.out.print("Server started");
    }

}
