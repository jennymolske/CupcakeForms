package de.cupcakeforms.exceptions;

/**
 * Created by jennifermolske on 06.01.17.
 */

public class MissingFormContainerException extends RuntimeException {

    public MissingFormContainerException() {
        super("You need to call initWith(FormContainer) before " +
                "you build the form.");
    }
}
