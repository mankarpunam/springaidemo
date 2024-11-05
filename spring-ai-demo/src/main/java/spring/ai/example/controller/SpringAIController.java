package spring.ai.example.controller;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SpringAIController {

    @Value("spring.ai.openai.api-key")
    String apiKey;

    private final OpenAiChatModel chatModel;
    public static final String WRITE_ME_HAIKU_ABOUT_CAT = """
            Write me Haiku about cat,
            haiku should start with the word cat obligatory""";

    public SpringAIController(OpenAiChatModel chatModel) {
        this.chatModel = chatModel;
    }

    @GetMapping("/demo")
    public String askQuestios() {
        String call = chatModel.call(WRITE_ME_HAIKU_ABOUT_CAT);
        return call;
    }

    @GetMapping("/getMessage")
    public ResponseEntity<String> getMessage(){
        String call = chatModel.call(WRITE_ME_HAIKU_ABOUT_CAT);
        return ResponseEntity.ok(call);
    }
    @GetMapping("/test")
    public String testEndpoint() {
        return "Test is working!";
    }
}
