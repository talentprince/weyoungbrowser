/*
 * Weyoung Browser for Android
 * 
 * Copyright (C) 2013 J. Devauchelle and contributors.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * version 3 as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

package org.weyoung.ui.activities;

import org.weyoung.utils.ApplicationUtils;
import org.weyoung.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

/**
 * ������־ҳ�� ��ʽΪDialog
 */
public class ChangelogActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Window w = getWindow();
        w.requestFeature(Window.FEATURE_LEFT_ICON);

        setContentView(R.layout.changelog_activity);

        w.setFeatureDrawableResource(Window.FEATURE_LEFT_ICON,
                android.R.drawable.ic_dialog_info);

        TextView changelogText = (TextView) findViewById(R.id.ChangelogContent);
        changelogText.setText(ApplicationUtils.getChangelogString(this));

        Button closeBtn = (Button) this
                .findViewById(R.id.ChangelogActivity_CloseBtn);
        closeBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                finish();
            }

        });
    }

}
