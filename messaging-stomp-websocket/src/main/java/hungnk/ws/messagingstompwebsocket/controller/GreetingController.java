package hungnk.ws.messagingstompwebsocket.controller;

import hungnk.ws.messagingstompwebsocket.entity.Greeting;
import hungnk.ws.messagingstompwebsocket.entity.HelloMessage;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import java.util.Map;

/**
 * @author hungnk1
 * @Package hungnk.ws.messagingstompwebsocket.controller
 * @date 2/26/2024 9:57 AM
 */
@Controller
public class GreetingController {

    @MessageMapping("/hello")
    @SendToUser("/topic/greetings")
    public Greeting greeting(@Headers Map<String, Object> headers, HelloMessage message) throws Exception {
        Thread.sleep(1000);
        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }
}

