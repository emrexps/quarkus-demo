package com.student.demo;

import io.quarkus.test.junit.SubstrateTest;

@SubstrateTest
public class NativeStudentResourceIT extends StudentResourceTest {

    // Execute the same tests but in native mode.
}