package example.androiddatabindingtest;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import example.androiddatabindingtest.databinding.ActivityMethodAdapterBinding;

public class MethodAdapterActivity extends AppCompatActivity {

	private ActivityMethodAdapterBinding _binder;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_method_adapter);
		_binder = DataBindingUtil.setContentView(this, R.layout.activity_method_adapter);

		final String imageUrl = "https://assets-cdn.github.com/images/modules/logos_page/GitHub-Mark.png";

		_binder.setUrl(imageUrl);
	}
}
