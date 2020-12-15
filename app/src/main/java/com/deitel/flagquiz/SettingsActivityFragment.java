package com.deitel.flagquiz;

import android.preference.PreferenceFragment;
import android.os.Bundle;

public class SettingsActivityFragment extends PreferenceFragment {
    //Creates preferences GUI from preferences.xml file in res/xml

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);  //load form xml
    }
}
