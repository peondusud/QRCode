
package com.esiea.qrcode;

import android.graphics.Bitmap;

public interface IQRCodeController {

    public Bitmap updateQRCode(String data, String Hiddendata);

    public void savePicture();

    public void analyseImage(Bitmap yourSelectedImage);

    public void askForUpdate();

    public void setActiveView(QRCodeView qrcvodeView);

    public void destroyController();
}
