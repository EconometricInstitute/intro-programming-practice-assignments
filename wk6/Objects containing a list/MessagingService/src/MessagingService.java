import java.util.ArrayList;
import java.util.List;

public class MessagingService {
    private List<Message> messages;

    public MessagingService() {
        messages = new ArrayList<>();
    }
    
    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            messages.add(message);
        }
    }

    public List<Message> getMessages() {
        return messages;
    }
}
