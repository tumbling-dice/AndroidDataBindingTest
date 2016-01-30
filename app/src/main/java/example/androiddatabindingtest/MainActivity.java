package example.androiddatabindingtest;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import example.androiddatabindingtest.data.TestData;
import example.androiddatabindingtest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

	private ActivityMainBinding _binder;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		_binder = DataBindingUtil.setContentView(this, R.layout.activity_main);

		final TestData testData = new TestData(1, "test1");

		_binder.setData(testData);
	}
}
