package com.hannt.core.module.sample.service;

public interface SampleService {
    String getString();
    default String getTest(){ return "test"; }
}
