package de.cupcakeforms;

import android.content.Context;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import de.cupcakeforms.exceptions.MissingFormContainerException;
import de.cupcakeforms.exceptions.NullNotSupportedException;
import de.cupcakeforms.items.FormItem;
import de.cupcakeforms.views.FormItemView;

/**
 * Created by jennifermolske on 06.01.17.
 */

public class FormBuilder {

    private FormContainer mFormContainer;

    /**
     * Stores all {@link FormItem} that are added to this {@link FormBuilder} with
     * {@link #addFormItem(FormItem)} method
     */
    private List<FormItem> mFormItemList = new ArrayList<>();

    /**
     * Float value for representing the vertical space between the single
     * form items
     */
    private float mItemSpacing;

    /**
     * Simple constructor
     */
    public FormBuilder() {}

    /**
     * Stores the {@link FormContainer} which should be linked to this {@link FormBuilder}
     * and should display the form items
     * @param formContainer
     */
    public void initWith(FormContainer formContainer) {
        mFormContainer = formContainer;
    }

    /**
     * Adds the given {@link FormItem} to the {@link #mFormItemList}
     * @param formItem The {@link FormItem} that should be added to the list
     */
    public void addFormItem(FormItem formItem) {

        if(formItem != null) {
            mFormItemList.add(formItem);
        }
        else {
            throw new NullNotSupportedException(FormItem.class);
        }
    }

    /**
     * Sets a value for the item spacing. If no value specified, the {@link FormBuilder}
     * uses a default value of 4dp
     * @param itemSpacing The spacing between the {@link FormItem}
     */
    public void setItemSpacing(float itemSpacing) {
        mItemSpacing = itemSpacing;
    }

    /**
     * Adds all form items within the {@link #mFormItemList} to the
     * {@link #mFormContainer} layout.
     */
    public void build() {

        if(mFormContainer == null) {
            throw new MissingFormContainerException();
        }

        Context context = mFormContainer.getContext();

        //Check if an itemSpacing is set
        if(mItemSpacing < 0) {
            mItemSpacing = context.getResources().getDimension(R.dimen.spacing_form_items);
        }


        for(FormItem item : mFormItemList) {


            View view = item.getView(context, mFormContainer);
            view.setPadding(0, 0, 0, (int) mItemSpacing);

            ((FormItemView) view).update(item);
            mFormContainer.addView(view);
        }
    }
}
