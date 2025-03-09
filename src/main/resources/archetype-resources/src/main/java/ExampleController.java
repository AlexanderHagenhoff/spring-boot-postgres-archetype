package $package;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/")
public class ExampleController {

    private static final String EXAMPLE_RESPONSE = "Hello from Spring Boot!";

    @GetMapping
    public ResponseEntity<String> sayHello() {
        return new ResponseEntity<>(EXAMPLE_RESPONSE, OK);
    }
}
