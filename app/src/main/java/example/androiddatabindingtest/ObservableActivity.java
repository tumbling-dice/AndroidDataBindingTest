package example.androiddatabindingtest;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import example.androiddatabindingtest.data.ObservableTest;
import example.androiddatabindingtest.databinding.ActivityObservableBinding;

public class ObservableActivity extends AppCompatActivity {

	private ActivityObservableBinding _binder;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		_binder = DataBindingUtil.setContentView(this, R.layout.activity_observable);

		final ObservableTest testData = new ObservableTest("hoge", "piyo");
		_binder.setData(testData);
	}

}
