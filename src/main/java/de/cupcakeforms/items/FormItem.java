package de.cupcakeforms.items;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import de.cupcakeforms.exceptions.NullNotSupportedException;
import de.cupcakeforms.rules.BaseRule;

/**
 * Created by jennifermolske on 06.01.17.
 */

public abstract class FormItem {

    /**
     * Indicates if the {@link FormItem} is required
     */
    protected boolean mRequired = false;

    /**
     * List with {@link BaseRule} to validate if the submit button is clicked
     */
    protected ArrayList<BaseRule> mRules = new ArrayList<>();

    public FormItem addRule(BaseRule rule) {

        if(rule != null) {
            mRules.add(rule);
        }
        else {
            throw new NullNotSupportedException(BaseRule.class);
        }

        return this;
    }

    /**
     * Marks this {@link FormItem} as required. Default is false
     */
    public FormItem required() {
        mRequired = true;
        return this;
    }

    public abstract View getView(Context context, ViewGroup parent);
}
