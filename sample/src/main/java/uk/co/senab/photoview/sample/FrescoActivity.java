package uk.co.senab.photoview.sample;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;

import com.facebook.common.util.UriUtil;
import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by vturcan on 10/6/15.
 */
public class FrescoActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initFresco();
    }

    private void initFresco() {
        Fresco.initialize(this);
    }

    protected static Uri getImageUri(String imageUrl) {

        return Uri.parse(imageUrl);
    }

    protected static Uri getImageUri(int imageResourceId) {
        if (imageResourceId > 0) {
            Uri uri = new Uri.Builder()
                    .scheme(UriUtil.LOCAL_RESOURCE_SCHEME) // "res"
                    .path(String.valueOf(imageResourceId))
                    .build();
            return uri;
        }
        return null;
    }
}
