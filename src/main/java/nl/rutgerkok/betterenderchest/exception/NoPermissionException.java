package nl.rutgerkok.betterenderchest.exception;

import nl.rutgerkok.betterenderchest.Translations;

import org.apache.commons.lang.Validate;

/**
 * Indicates that a chest could not be opened, because the player had no
 * permission to do so.
 *
 */
public class NoPermissionException extends Exception {
    private final String permission;

    /**
     * Constructs a new PermissionException.
     * 
     * @param requiredPermission
     *            The permission node that was missing.
     * @throws IllegalArgumentExcepiont
     *             If requiredPermission is null.
     */
    public NoPermissionException(String requiredPermission) {
        super("Missing permission " + requiredPermission);
        Validate.notNull(requiredPermission, "permission cannot be null");
        this.permission = requiredPermission;
    }

    @Override
    public String getLocalizedMessage() {
        return Translations.NO_PERMISSION.toString();
    }

    /**
     * Gets the permission node that the player was missing.
     * 
     * @return The permission node.
     */
    public String getMissingPermission() {
        return permission;
    }
}
