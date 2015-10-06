package uk.co.senab.photoview.sample;

import android.os.Bundle;

import com.facebook.drawee.drawable.ScalingUtils;

import uk.co.senab.photoview.PhotoDraweeView;

public class AUILSampleActivity extends FrescoActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);

        PhotoDraweeView photoView = (PhotoDraweeView) findViewById(R.id.iv_photo);

        photoView.setImageURI(getImageUri("http://pbs.twimg.com/media/Bist9mvIYAAeAyQ.jpg"));
    }
}
