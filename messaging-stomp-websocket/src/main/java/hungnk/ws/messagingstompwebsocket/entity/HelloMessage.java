package hungnk.ws.messagingstompwebsocket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author hungnk1
 * @Package hungnk.ws.messagingstompwebsocket.entity
 * @date 2/26/2024 9:50 AM
 */
@Getter
@Setter
public class HelloMessage {
    private String name;

    public HelloMessage() {
    }

    public HelloMessage(String name) {
        this.name = name;
    }
}
