package com.zs.example;

import android.util.Pair;

import org.junit.Test;

import io.reactivex.Observable;

public class ExampleJavaTest {

    @Test
    public void seotyTest() {

        Pair<String, Integer>[] arrs = new Pair[4];
        arrs[0] = new Pair("A", 2);
        arrs[1] = new Pair("B", 3);
        arrs[2] = new Pair("A", 1);
        arrs[3] = new Pair("C", 4);

        Observable.fromArray(arrs)
                .groupBy(it -> it.first)
                .subscribe(result -> {
                    int k = 0;
                });
    }
}
