package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

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

    @Test
    public void testJobConstructorSetsAllFields() {
       test_job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
       assertTrue(test_job1.getName() == "Product tester");
       assertTrue(test_job1.getEmployer() instanceof Employer && test_job1.getEmployer().getValue() == "ACME");
       assertTrue(test_job1.getLocation() instanceof Location && test_job1.getLocation().getValue() == "Desert");
       assertTrue(test_job1.getPositionType() instanceof PositionType && test_job1.getPositionType().getValue() == "Quality control");
       assertTrue(test_job1.getCoreCompetency() instanceof CoreCompetency && test_job1.getCoreCompetency().getValue() == "Persistence");

    }

    @Test
    public void testJobsForEquality() {
        test_job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(test_job1.equals(test_job2.getId()));

    }


}
