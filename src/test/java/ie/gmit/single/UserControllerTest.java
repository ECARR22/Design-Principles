package ie.gmit.single;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserControllerTest {

    private static final String VALID_USER_JSON = "{\"name\": \"Paul\", \"email\": \"paul@gmit.ie\", \"address\":\"Coole Park Gort\"}";

    private static final String INVALID_USER_JSON = "{\"name\": \"Sam\", \"email\": \"sam@email\", \"address\":\"111 Sugar lane\"}";

    @Test
    public void testCreateUserSuccess() throws IOException {
        UserController controller = new UserController();

        assertEquals("SUCCESS", controller.createUser(VALID_USER_JSON));
    }

    @Test
    public void testCreateUserFail() throws IOException {
        UserController controller = new UserController();

        assertEquals("ERROR", controller.createUser(INVALID_USER_JSON));
    }

}
