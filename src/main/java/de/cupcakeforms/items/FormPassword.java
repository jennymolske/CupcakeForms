package de.cupcakeforms.items;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import de.cupcakeforms.R;

/**
 * Created by jennifermolske on 06.01.17.
 */

public class FormPassword extends FormText {

    /**
     * Label for the edit text
     */
    private String mLabel;

    /**
     * Hint to fill the edittext with
     */
    private String mHint;


    public FormPassword() {}

    @Override
    public View getView(Context context, ViewGroup parent) {
        return LayoutInflater.from(context)
                .inflate(R.layout.form_password_view, parent, false);
    }

}
