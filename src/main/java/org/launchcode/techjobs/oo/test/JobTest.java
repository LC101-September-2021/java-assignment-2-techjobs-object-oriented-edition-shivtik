package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.Job;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    Job test_job1, test_job2;

    @Before
    @Test
    public void testSettingJobID() {
        test_job1 = new Job();
        test_job2 = new Job();

        assertTrue(test_job1.getId() != test_job2.getId());
    }


}
