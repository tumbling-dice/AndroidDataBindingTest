package example.androiddatabindingtest.data;


import android.databinding.ObservableField;
import android.view.View;

public class ObservableTest {
	private final ObservableField<String> firstName = new ObservableField<String>();
	private final ObservableField<String> lastName = new ObservableField<String>();

	public ObservableTest(String firstName, String lastName) {
		this.firstName.set(firstName);
		this.lastName.set(lastName);
	}

	public ObservableField<String> getFirstName() {
		return this.firstName;
	}

	public ObservableField<String> getLastName() {
		return this.lastName;
	}

	public void changeFirstName(View v) {
		final String firstName = this.firstName.get();

		if ("hoge".equals(firstName)) {
			this.firstName.set("foo");
		} else {
			this.firstName.set("hoge");
		}
	}

	public void changeLastName(View v) {
		final String lastName = this.lastName.get();

		if ("piyo".equals(lastName)) {
			this.lastName.set("bar");
		} else {
			this.lastName.set("piyo");
		}
	}
}
