package de.cupcakeforms.items;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import de.cupcakeforms.R;

/**
 * Created by jennifermolske on 06.01.17.
 */

public class FormText extends FormItem {

    /**
     * Text for the edit text
     */
    private String mText;

    /**
     * Hint to fill the edittext with
     */
    private String mHint;

    public FormText() {}

    /**
     * Sets the text for this view. Replaces any previously text for this view
     * @param text
     * @return
     */
    public FormText addText(String text) {
        mText = text;

        return this;
    }

    /**
     * Sets the hint for this view. Replaces any previously hint for this view
     * @param hint
     * @return
     */
    public FormText addHint(String hint) {
        mHint = hint;

        return this;
    }

    public String getText() {
        return mText;
    }

    public String getHint() {
        return mHint;
    }

    @Override
    public View getView(Context context, ViewGroup parent) {
        return LayoutInflater.from(context)
                            .inflate(R.layout.form_text_view, parent, false);
    }
}
