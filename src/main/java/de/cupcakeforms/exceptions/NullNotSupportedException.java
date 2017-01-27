package de.cupcakeforms.exceptions;

/**
 * Created by jennifermolske on 06.01.17.
 */

public class NullNotSupportedException extends RuntimeException {

    public NullNotSupportedException(Class excpectedType) {
        super("Null is not a supported " + excpectedType.getSimpleName());
    }
}
