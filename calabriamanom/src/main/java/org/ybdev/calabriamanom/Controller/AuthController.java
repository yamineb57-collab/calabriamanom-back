package org.ybdev.calabriamanom.Controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * La connexion (POST /api/auth/login) et la déconnexion (POST /api/auth/logout)
 * sont gérées par Spring Security. Ce contrôleur expose seulement l'utilisateur courant :
 * 401 si personne n'est connecté, sinon son identifiant et ses rôles.
 */
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    public record CurrentUserResponse(String username, List<String> roles) {
    }

    @GetMapping("/me")
    public CurrentUserResponse me(Authentication authentication) {
        List<String> roles = authentication.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .toList();
        return new CurrentUserResponse(authentication.getName(), roles);
    }
}
