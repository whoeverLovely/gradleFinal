package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.ExecutionException;

public class MainActivityTest {

    @Test
    public void asyncTaskRetrunNonEmpty() {


        Context appContext = InstrumentationRegistry.getTargetContext();

        String jokeRetrieved = null;
        try {
            jokeRetrieved = new MainActivity.EndpointsAsyncTask(appContext).execute().get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        Assert.assertNotEquals( "", jokeRetrieved );
    }
}
