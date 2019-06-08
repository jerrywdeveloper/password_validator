package com.example.password_validator;

import android.content.Context;

import androidx.test.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);


    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.password_validator", appContext.getPackageName());
    }


    final String str_NS = "Not Strong!";
    final String str_AG = "All Good!";

    @Test
    public void Validation_NS_0() {
        String expectedText = str_NS;
        onView(withId(R.id.editText)).perform(typeText(""),closeSoftKeyboard());
        onView(withId(R.id.textView2)).check(matches(withText(expectedText)));
        onView(withId(R.id.textView3)).check(matches(withText("Password should be more than 8 characters")));
    }

    @Test
    public void Validation_NS_1() {
        String expectedText = str_NS;
        onView(withId(R.id.editText)).perform(typeText("bar"),closeSoftKeyboard());
        onView(withId(R.id.textView2)).check(matches(withText(expectedText)));
        onView(withId(R.id.textView3)).check(matches(withText("Password should be more than 8 characters")));
    }

    @Test
    public void Validation_AG() {
        String expectedText = str_AG;
        onView(withId(R.id.editText)).perform(typeText("&Bja9bsjakla"),closeSoftKeyboard());
        onView(withId(R.id.textView2)).check(matches(withText(expectedText)));
        onView(withId(R.id.textView3)).check(matches(withText("\u263A")));
    }

    @Test
    public void Validation_NS_2() {
        String expectedText = str_AG;
        onView(withId(R.id.editText)).perform(typeText("yowhatisup09"),closeSoftKeyboard());
        onView(withId(R.id.textView2)).check(matches(withText(expectedText)));
        onView(withId(R.id.textView3)).check(matches(withText("Password should contain special characters")));
    }

    @Test
    public void Validation_NS_3() {
        String expectedText = str_NS;
        onView(withId(R.id.editText)).perform(typeText("HELLOWORLD"),closeSoftKeyboard());
        onView(withId(R.id.textView2)).check(matches(withText(expectedText)));
        onView(withId(R.id.textView3)).check(matches(withText("Password should contain special characters")));
    }

    @Test
    public void Validation_NS_4() {
        String expectedText = str_NS;
        onView(withId(R.id.editText)).perform(typeText("bestfriends*"),closeSoftKeyboard());
        onView(withId(R.id.textView2)).check(matches(withText(expectedText)));
        onView(withId(R.id.textView3)).check(matches(withText("Password should have upper and lower cases")));
    }

    @Test
    public void Validation_NS_5() {
        String expectedText = str_NS;
        onView(withId(R.id.editText)).perform(typeText("KIKIdoyouloveme?"),closeSoftKeyboard());
        onView(withId(R.id.textView2)).check(matches(withText(expectedText)));
        onView(withId(R.id.textView3)).check(matches(withText("Password should contain at least one number")));
    }

    @Test
    public void Validation_NS_6() {
        String expectedText = str_NS;
        onView(withId(R.id.editText)).perform(typeText("password"),closeSoftKeyboard());
        onView(withId(R.id.textView2)).check(matches(withText(expectedText)));
        onView(withId(R.id.textView3)).check(matches(withText("\'password\' is not a strong password")));
    }

}
