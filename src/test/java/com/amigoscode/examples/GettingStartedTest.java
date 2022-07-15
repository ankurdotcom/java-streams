package com.amigoscode.examples;

import com.amigoscode.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;


public class GettingStartedTest {

    @Test
    public void imperativeApproach() {
        // 1. Find people aged less or equal 18
        // 2. Then change implementation to find first 10 people
    }

    @Test
    public void declarativeApproachUsingStreams() throws Exception {
        //print 10 minor boys
        Instant start = Instant.now();
        MockData.getPeople().parallelStream()
                .filter(person -> person.getAge() < 10)
                .filter(person1 -> !person1.getGender().equals("Female"))
                .limit(10)
                .forEach(System.out::println);
        Instant stop = Instant.now();

        System.out.println(Duration.between(start, stop).getNano());

        start = Instant.now();
        //print 10 minor boys
        MockData.getPeople().parallelStream()
                .filter(person -> person.getAge() < 10)
                .filter(person1 -> !person1.getGender().equals("Female"))
                .limit(10)
                .forEach(System.out::println);

        stop = Instant.now();

        System.out.println(Duration.between(start, stop).getNano());
        //MockData.getCars()
    }
}
