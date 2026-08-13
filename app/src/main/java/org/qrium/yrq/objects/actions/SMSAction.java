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

package org.qrium.yrq.objects.actions;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

import org.qrium.yrq.App;
import org.qrium.yrq.R;
import org.qrium.yrq.Utils;
import org.qrium.yrq.objects.data.Data;
import org.qrium.yrq.objects.data.SMS;

public class SMSAction extends Action {
    private static Action INSTANCE;
    public SMSAction() {
        super(App.getStringGlobal(R.string.start_sms, "Start message"), R.drawable.ic_baseline_sms_24);
    }


    public static Action getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SMSAction();
        }
        return INSTANCE;
    }

    @Override
    public void performAction(Context context, Data data) {
        SMS sms = (SMS) data;

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("smsto:" + sms.getRecipient()));
        intent.putExtra("sms_body", sms.getContents());
        if (!Utils.launchIntentCheckAvailable(intent, context)) {
            Toast.makeText(context, R.string.no_msg_app_found, Toast.LENGTH_SHORT).show();
        }
    }


}
