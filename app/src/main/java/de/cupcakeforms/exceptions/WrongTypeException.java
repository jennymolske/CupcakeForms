package de.cupcakeforms.exceptions;

/**
 * Created by jennifermolske on 08.01.17.
 */

public class WrongTypeException extends RuntimeException {

    public WrongTypeException(Class requiredClass, Class foundClass) {
        super("Found " + foundClass.getSimpleName() + ", requires " + requiredClass.getSimpleName());
    }
}
