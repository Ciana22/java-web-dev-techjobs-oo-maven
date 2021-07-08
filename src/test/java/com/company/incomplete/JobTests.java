package com.company.incomplete;

import com.company.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class JobTests {
    // you can rename the tests, or delete them and rewrite them from scratch, but I went ahead and provided you the names of tests I created -- I followed the writeup pretty honestly

    @Test
    public void testSettingJobId() {
        Job job_test1 = new Job();
        Job job_test2 = new Job();
        /*
        System.out.println(job_test1.getId());
        System.out.println(job_test2.getId());
        */

        Assertions.assertEquals(1, job_test1.getId(), .001);
        Assertions.assertEquals(2, job_test2.getId(), .001);

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job_test3 = new Job("Product tester", new Employer("Acme"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        //System.out.println(job_test3.getName());

        Assertions.assertEquals("Product tester", job_test3.getName());
        Assertions.assertEquals("Acme", job_test3.getEmployer().getValue());
        Assertions.assertEquals("Desert", job_test3.getLocation().getValue());
        Assertions.assertEquals("Quality control", job_test3.getPositionType().getValue());
        Assertions.assertEquals("Persistence", job_test3.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job job_test1 = new Job();
        Job job_test2 = new Job();

        assertNotEquals(job_test1, job_test2);
    }

    // I found the instructions around the three toString() tests a little confusing, so I created three tests following the three bullet points:
    // you can follow TDD if you want, or you can write the implementation first and then get the tests to pass, either is a fine approach
    @Test
    public void testToStringIsFormattedProperly() {
        Job job_test4 = new Job("Product tester", new Employer("Acme"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        String expectedToStringOutput =
                "ID: 1\n" +
                "Name: Product tester\n" +
                "Employer: Acme\n" +
                "Location: Desert\n" +
                "Position Type: Quality Control\n" +
                "Core Competency: Persistence\n";

        //System.out.println(expectedToStringOutput);
        //String toString = job_test4.toString();
        System.out.println(job_test4);
        Assertions.assertEquals(expectedToStringOutput, job_test4.toString());
    }

    @Test
    public void testToStringDataNotAvailable() {
        Job testJob = new Job("Software Eng. 1", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String expectedToStringOutput =
                "ID: 1\n" +
                "Name: Software Eng. 1\n" +
                "Employer: Data Not Available\n" +
                "Location: Data Not Available\n" +
                "Position Type: Data Not Available\n" +
                "Core Competency: Data Not Available\n";
        Assertions.assertEquals(expectedToStringOutput, testJob.toString());
    }
}