package de.cupcakeforms.views;

import android.content.Context;
import android.support.design.widget.TextInputLayout;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.LinearLayout;

import jennymolske.de.formawesome.R;
import jennymolske.de.formawesome.exceptions.WrongTypeException;
import jennymolske.de.formawesome.items.FormItem;
import jennymolske.de.formawesome.items.FormText;

/**
 * Created by jennifermolske on 08.01.17.
 */

public class FormTextView extends LinearLayout implements FormItemView {

    public FormTextView(Context context) {
        super(context);
    }

    public FormTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FormTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    @Override
    public void update(FormItem formItem) {

        if(formItem instanceof FormText) {

            FormText formText = (FormText) formItem;

            TextInputLayout inputLayout = (TextInputLayout) findViewById(R.id.input_text_layout);
            EditText editText = (EditText) findViewById(R.id.input_text);
            if(inputLayout != null && editText != null) {

                if(formText.getHint() != null && !formText.getHint().isEmpty()) {
                    inputLayout.setHint(formText.getHint());
                }

                if(formText.getText() != null && !formText.getText().isEmpty()) {
                    editText.setText(formText.getText());
                }
            }
        }
        else {
            throw new WrongTypeException(FormText.class, formItem.getClass());
        }
    }
}
