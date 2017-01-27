package de.cupcakeforms.rules;

/**
 * Created by jennifermolske on 06.01.17.
 */

public class RuleMinLength extends BaseRule {

    private int mMinLength;

    public RuleMinLength(int minLength) {
        mMinLength = minLength;
    }

    /**
     * Checks if the given content param has at least {@link RuleMinLength#mMinLength}
     * chars.
     * @param content The content string to check
     * @return True if the given content has at least {@link RuleMinLength#mMinLength} chars,
     *          false otherwise
     */
    @Override
    public boolean validate(String content) {

        if(content != null && content.length() >= mMinLength) {
            return true;
        }

        return false;
    }
}
