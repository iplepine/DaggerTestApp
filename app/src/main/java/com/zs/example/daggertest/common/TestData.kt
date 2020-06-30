package com.zs.example.daggertest.common

import javax.inject.Inject
import javax.inject.Named

class TestData @Inject constructor(@Named("A") val textA: String, @Named("B") val textB: String) {
}