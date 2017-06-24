// Install the Java helper library from twilio.com/docs/java/install
package application;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import java.net.URISyntaxException;

public class Main {

    // Find your Account Sid and Auth Token at twilio.com/console
    public static final String ACCOUNT_SID = "AC3f9efed4855df55dcef3cbc0df6fdc9e";
    public static final String AUTH_TOKEN = "ee7d49757d2f183abede84ef567e2262";

    public static void main(String[] args) throws URISyntaxException {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
                .creator(new PhoneNumber("+12676907417"),  // to
                         new PhoneNumber("+19172688696"),  // from
                         "Message content goes here")
                .create();
    }
}