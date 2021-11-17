package guru.springframework.jokapplication.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class JokesServiceTest {

    private JokesService jokesService;


    @BeforeEach
    void setUp() {
        this.jokesService = new JokesServiceImpl();
    }

    @Test
    void getRandomQuotesTest(){
        String joke = jokesService.getRandomQuotes();
        Assertions.assertNotNull(joke);
    }
}