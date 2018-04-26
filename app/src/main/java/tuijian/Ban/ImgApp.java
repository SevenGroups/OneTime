package tuijian.Ban;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.youth.banner.loader.ImageLoader;

/**
 * Created by Lenovo on 2018/4/26.
 */

public class ImgApp extends ImageLoader {
    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
      //  Glide.with(context).load(path).into(imageView);
        Picasso.with(context).load((String) path).into(imageView);

    }
}