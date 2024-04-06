package app.mygroupsbusiness.database_tests;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.assertj.core.api.Assertions.assertThat;

// ce test vérifie la connexion à la DB

@DataJpaTest
public class DatabaseTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testDatabaseConnection() {
        assertThat(jdbcTemplate).isNotNull();
        jdbcTemplate.execute("SELECT 1"); // Execute une requête de test
        // Aucune exception ne doit être lancée si la connexion à la base de données est réussie
    }
}
