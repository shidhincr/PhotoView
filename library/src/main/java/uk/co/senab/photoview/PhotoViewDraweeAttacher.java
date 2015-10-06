package uk.co.senab.photoview;

import android.graphics.RectF;

import com.facebook.drawee.view.SimpleDraweeView;

import uk.co.senab.photoview.PhotoViewAttacher;

/**
 * Created by vturcan on 8/24/15.
 */
public class PhotoViewDraweeAttacher extends PhotoViewAttacher<SimpleDraweeView> {
    private RectF displayRect;

    public PhotoViewDraweeAttacher(SimpleDraweeView imageView) {
        super(imageView);
    }

    public RectF getActualImageBounds() {
        try {
            if(displayRect==null) {
                displayRect = new RectF();
            }
            getImageView().getHierarchy().getActualImageBounds(displayRect);
        } catch (Exception e) {
        }
        return displayRect;
    }

    @Override
    protected int getImageViewWidth(SimpleDraweeView imageView) {
        displayRect = getActualImageBounds();
        if (!displayRect.isEmpty()) {
            return ((int) displayRect.width());
        }
        return super.getImageViewWidth(imageView);
    }

    @Override
    protected int getImageViewHeight(SimpleDraweeView imageView) {
        displayRect = getActualImageBounds();
        if (!displayRect.isEmpty()) {
            return ((int) displayRect.height());
        }
        return super.getImageViewHeight(imageView);
    }

    @Override
    protected int getIntrinsicWidth(SimpleDraweeView imageView) {
        displayRect = getActualImageBounds();
        if (!displayRect.isEmpty()) {
            return ((int) displayRect.width());
        }
        return super.getIntrinsicWidth(imageView);
    }

    @Override
    protected int getIntrinsicHeight(SimpleDraweeView imageView) {
        displayRect = getActualImageBounds();
        if (!displayRect.isEmpty()) {
            return ((int) displayRect.height());
        }
        return super.getIntrinsicHeight(imageView);
    }
}
