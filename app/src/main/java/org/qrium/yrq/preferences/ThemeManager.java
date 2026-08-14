/*
 * Code Scanner. An android app to scan and create codes(barcodes, QR codes, etc)
 * Copyright (C) 2022 czlucius
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package org.qrium.yrq.preferences;

import android.app.Activity;
import android.content.Context;

import org.qrium.yrq.R;

/**
 * Resolves the user's appearance choice to an application theme.
 */
public final class ThemeManager {
    public static final String SYSTEM = "system";
    public static final String MATERIAL3 = "material3";
    public static final String AMOLED = "amoled";
    public static final String CYBER = "cyber";

    private ThemeManager() {
    }

    public static void apply(Activity activity) {
        activity.setTheme(getThemeResId(activity));
    }

    public static int getThemeResId(Context context) {
        String theme = Settings.getInstance(context).getTheme();
        switch (theme) {
            case MATERIAL3:
                return R.style.Theme_App_Material3;
            case AMOLED:
                return R.style.Theme_App_Amoled;
            case CYBER:
                return R.style.Theme_App_Cyber;
            case SYSTEM:
            default:
                return R.style.Theme_App;
        }
    }
}
