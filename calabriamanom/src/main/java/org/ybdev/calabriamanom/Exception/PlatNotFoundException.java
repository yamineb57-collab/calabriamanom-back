package org.ybdev.calabriamanom.Exception;

public class PlatNotFoundException extends RuntimeException {

    public PlatNotFoundException(Long id) {
        super("Plat introuvable : " + id);
    }
}
