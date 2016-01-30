package example.androiddatabindingtest.data;


import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;

import example.androiddatabindingtest.BR;

public class ObservableTest extends BaseObservable {
	private String firstName;
	private String lastName;

	public ObservableTest(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Bindable
	public String getFirstName() {
		return this.firstName;
	}

	@Bindable
	public String getLastName() {
		return this.lastName;
	}

	public void changeFirstName(View v) {
		if ("hoge".equals(firstName)) {
			this.firstName = "foo";
		} else {
			this.firstName = "hoge";
		}

		notifyPropertyChanged(BR.firstName);
	}

	public void changeLastName(View v) {
		if ("piyo".equals(lastName)) {
			this.lastName = "bar";
		} else {
			this.lastName = "piyo";
		}

		notifyPropertyChanged(BR.lastName);
	}
}
