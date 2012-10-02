
package com.esiea.qrcode;

import android.graphics.Bitmap;

public interface IQRCodeModel {

    public Bitmap generateBitmap();

    public void setData(String string);

    public void setHiddenData(String hiddenData);

    public Bitmap getBitmap();
}
