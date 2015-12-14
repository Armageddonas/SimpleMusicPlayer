package com.zeuss_works.armageddonas.simplemusicplayer;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
        assertNotNull(EmailValidator.isValidEmail("name@email.com"), is(true));
    }

    @Test
    public void load_music_from_raw_works() {
        ClassUnderTest myObjectUnderTest = new ClassUnderTest(CustomAdapter);
        MusicFile songs[] = myObjectUnderTest.getObjectUnderTest.loadDataset();

        assertNotNull(songs[0].title);
    }
}