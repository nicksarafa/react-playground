package com.pauselabs.pause.view.tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.pauselabs.R;
import com.pauselabs.pause.view.SettingsButton;

import butterknife.InjectView;
import butterknife.Views;


public class SettingsView extends LinearLayout {

    private static final String TAG = SettingsView.class.getSimpleName();

    @InjectView(R.id.nameBtn)
    public SettingsButton nameBtn;
    @InjectView(R.id.missedCallsBtn)
    public SettingsButton missedCallsBtn;
    @InjectView(R.id.receivedSMSBtn)
    public SettingsButton receivedSmsBtn;
//    @InjectView(R.id.privacylistBtn)
//    public SettingsButton blacklistBtn;
    @InjectView(R.id.rateBtn)
    public SettingsButton rateBtn;
    @InjectView(R.id.contactBtn)
    public SettingsButton contactBtn;
    @InjectView(R.id.genderBtn)
    public SettingsButton genderBtn;
    @InjectView(R.id.volumeBtn)
    public SettingsButton volumeBtn;
    @InjectView(R.id.voiceBtn)
    public SettingsButton voiceBtn;
    @InjectView(R.id.toastsBtn)
    public SettingsButton toastBtn;
    @InjectView(R.id.supportBtn)
    public SettingsButton supportBtn;
    @InjectView(R.id.privacyBtn)
    public SettingsButton privacyBtn;
    @InjectView(R.id.termsBtn)
    public SettingsButton termsBtn;

    public SettingsView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SettingsView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public SettingsView(Context context) {
        super(context);

    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        Views.inject(this);

    }

}
