package com.pauselabs.pause.view.tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;
import android.widget.RelativeLayout;

import com.pauselabs.R;

import butterknife.InjectView;
import butterknife.Views;

/**
 * Created by Admin on 3/8/15.
 */
public class PrivacyView extends RelativeLayout {

    @InjectView(R.id.privacy_contacts_grid)
    public GridView contactsGrid;

    public PrivacyView(Context context) {
        super(context);
    }

    public PrivacyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PrivacyView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        Views.inject(this);
    }

}
