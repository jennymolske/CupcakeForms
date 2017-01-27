package de.cupcakeforms.rules;

/**
 * Created by jennifermolske on 06.01.17.
 */

public class RuleMaxLength extends BaseRule {

    private int mMaxLength;

    public RuleMaxLength(int maxLength) {
        mMaxLength = maxLength;
    }

    /**
     * Checks if the given content param has at most {@link RuleMaxLength#mMaxLength}
     * chars.
     * @param content The content string to check
     * @return True if the given content has at most {@link RuleMaxLength#mMaxLength} chars,
     *          false otherwise
     */
    @Override
    public boolean validate(String content) {

        if(content != null && content.length() <= mMaxLength) {
            return true;
        }

        return false;
    }
}
