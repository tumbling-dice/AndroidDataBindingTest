package example.androiddatabindingtest.extension;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public final class ImageViewExtensions {
	@BindingAdapter({"bind:imageUrl"})
	public static void loadImage(ImageView v, String imageUrl) {
		Glide.with(v.getContext()).load(imageUrl).into(v);
	}

	@BindingAdapter({"bind:imageUrl", "bind:error"})
	public static void loadImage(ImageView v, String imageUrl, Drawable error) {
		Glide.with(v.getContext()).load(imageUrl).error(error).into(v);
	}
}