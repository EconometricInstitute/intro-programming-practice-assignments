import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class MessagingServiceTest {
    @Test
    public void testConstructor() {
        MessagingService service = new MessagingService();

        Assert.assertEquals(List.of(), service.getMessages());
    }

    @Test
    public void testAdd() {
        MessagingService service = new MessagingService();

        Message firstMessage = new Message("John", "Hello");
        Message secondMessage = new Message("Jane", "Hello again");

        service.add(firstMessage);
        service.add(secondMessage);

        Assert.assertEquals(List.of(firstMessage, secondMessage), service.getMessages());
    }

    @Test
    public void testLongMessageRejection() {
        MessagingService service = new MessagingService();
        
        Message message = new Message("John", "This is a message with a very long story that should be rejected. The " +
                "message is so long because many additional words are used that do not have any direct meaning. " +
                "However, these are just added to reach the required number of characters. Otherwise, the message " +
                "would still be so short to be accepted.");
        service.add(message);

        Assert.assertEquals(0, service.getMessages().size());
    }
}
