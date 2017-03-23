/*
 * Copyright 2015-2017 Hewlett Packard Enterprise Development LP.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.miguel;

import com.hpe.caf.worker.testing.ContentFileTestExpectation;

/**
 * asdTestExpectation forms a component of the test item, and contains the expected asdResult, used to compare
 * with the actual worker result.
 */
public class asdTestExpectation  extends ContentFileTestExpectation {

    /**
     * asdResult read in from the yaml test case, used to validate the result of the worker is as expected.
     */
    private asdResult result;

    public asdTestExpectation() {
    }

    public asdResult getResult() {
        return result;
    }

    public void setResult(asdResult result) {
        this.result = result;
    }
}
