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

import androidx.arch.core.util.Function;

import org.qrium.yrq.App;
import org.qrium.yrq.R;
import org.qrium.yrq.Utils;
import org.qrium.yrq.objects.data.Data;
import org.qrium.yrq.objects.data.Phone;

public class CopyPhoneAction extends PhoneAction{
    public CopyPhoneAction(Function<Data, Phone> phoneRetrievalMethod) {
        this(phoneRetrievalMethod, App.getStringGlobal(R.string.copy_phone_number, " Copy phone number"));
    }

    public CopyPhoneAction(Function<Data, Phone> phoneRetrievalMethod, String chipText) {
        super(chipText, null, phoneRetrievalMethod);
    }

    @Override
    public void performAction(Context context, Data data) {
        Phone phone = getPhone(data);
        Utils.copyToClipboard(context, phone.getStringRepresentation());
    }
}
