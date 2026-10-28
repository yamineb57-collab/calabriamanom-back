package org.ybdev.calabriamanom.Security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.ybdev.calabriamanom.Entities.UserEntity;
import org.ybdev.calabriamanom.Repositories.UserRepository;
import org.ybdev.calabriamanom.Utils.Role;

/**
 * Crée le premier compte administrateur au démarrage, uniquement s'il n'existe aucun admin.
 * Les identifiants viennent de variables d'environnement (APP_ADMIN_USERNAME, APP_ADMIN_PASSWORD).
 */
@Component
public class AdminInitializer implements ApplicationRunner {

    private static final Logger log = LoggerFactory.getLogger(AdminInitializer.class);
    private static final int MIN_PASSWORD_LENGTH = 12;

    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final String username;
    private final String password;

    public AdminInitializer(UserRepository repository,
                            PasswordEncoder passwordEncoder,
                            @Value("${app.admin.username:}") String username,
                            @Value("${app.admin.password:}") String password) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
        this.username = username;
        this.password = password;
    }

    @Override
    public void run(ApplicationArguments args) {
        if (repository.existsByRole(Role.ADMIN)) {
            return;
        }

        if (username.isBlank() || password.isBlank()) {
            log.warn("Aucun administrateur en base et app.admin.username / app.admin.password "
                    + "non définis : aucun compte admin créé.");
            return;
        }

        if (password.length() < MIN_PASSWORD_LENGTH) {
            throw new IllegalStateException(
                    "Le mot de passe admin initial doit contenir au moins "
                            + MIN_PASSWORD_LENGTH + " caractères.");
        }

        String cleanUsername = username.trim();
        repository.save(new UserEntity(cleanUsername, passwordEncoder.encode(password), Role.ADMIN));
        log.info("Compte administrateur '{}' créé.", cleanUsername);
    }
}
