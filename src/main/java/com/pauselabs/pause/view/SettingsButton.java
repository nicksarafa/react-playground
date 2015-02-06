package com.pauselabs.pause.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.pauselabs.R;

public class SettingsButton extends LinearLayout {

    private TextView btnContent;

    public SettingsButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.SettingsButton, 0, 0);
        String mLabel = "";
        String mContent = "";
        Drawable mFrontnail;
        Drawable mEndnail;
        try {
            mLabel = a.getString(R.styleable.SettingsButton_label);
            mContent = a.getString(R.styleable.SettingsButton_content);
            mFrontnail = a.getDrawable(R.styleable.SettingsButton_frontnail);
            mEndnail = a.getDrawable(R.styleable.SettingsButton_endnail);
        } finally {
            a.recycle();
        }

        int minPadding = (int) getResources().getDimension(R.dimen.min_padding);
        setPadding(minPadding, minPadding, minPadding, minPadding);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.settings_button_view, this, true);

        if(!TextUtils.isEmpty(mLabel)) {
            ((TextView)findViewById(R.id.label)).setText(mLabel);
        }

        if(!TextUtils.isEmpty(mContent)) {
            ((TextView)findViewById(R.id.content)).setText(mContent);
        }

        if(null != mFrontnail) {
            ((ImageView)findViewById(R.id.frontnail)).setImageDrawable(mFrontnail);
        }

        if(null != mFrontnail) {
            ((ImageView)findViewById(R.id.endnail)).setImageDrawable(mEndnail);
        }

            btnContent = (TextView) findViewById(R.id.content);
            btnContent.setText(mContent);
    }

    public void setContent(String content) {
        btnContent.setText(content);
        invalidate();
        requestLayout();
    }

}
