package helloworld.com.helloworld;

import android.support.test.internal.util.AndroidRunnerParams;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;


import com.robotium.solo.Solo;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.model.InitializationError;

/**
 * Created by mukesh on 10/17/2016.
 */


@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    private Solo solo;

    private static final String MAIN_ACTIVITY = MainActivity.class.getSimpleName();

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);


    public MainActivityTest() {
        super();
    }

    @Before
    public void setUp() throws Exception {
        solo = new Solo(mActivityRule.getInstrumentation(), mActivityRule.getActivity());
    }

    @Test
    public void checkIfMainActivityIsProperlyDisplayed() throws InterruptedException {
        solo.waitForActivity("MainActivity", 2000);


        System.out.println("The text " + solo.getText("edittext"));

    }
}