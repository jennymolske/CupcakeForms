package de.cupcakeforms.views;

import android.content.Context;
import android.support.design.widget.TextInputLayout;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.LinearLayout;

import de.cupcakeforms.R;
import de.cupcakeforms.exceptions.WrongTypeException;
import de.cupcakeforms.items.FormItem;
import de.cupcakeforms.items.FormPassword;
import de.cupcakeforms.items.FormText;

/**
 * Created by jennifermolske on 08.01.17.
 */

public class FormPasswordView extends LinearLayout implements FormItemView {

    public FormPasswordView(Context context) {
        super(context);
    }

    public FormPasswordView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FormPasswordView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void update(FormItem formItem) {

        if(formItem instanceof FormPassword) {

            FormText formPassword = (FormPassword) formItem;

            TextInputLayout inputLayout = (TextInputLayout) findViewById(R.id.input_password_layout);
            EditText editText = (EditText) findViewById(R.id.input_password);

            if(inputLayout != null && editText != null) {

                if(formPassword.getHint() != null && !formPassword.getHint().isEmpty()) {
                    inputLayout.setHint(formPassword.getHint());
                }

                if(formPassword.getText() != null && !formPassword.getText().isEmpty()) {
                    editText.setText(formPassword.getText());
                }
            }
        }
        else {
            throw new WrongTypeException(FormPassword.class, formItem.getClass());
        }
    }
}
