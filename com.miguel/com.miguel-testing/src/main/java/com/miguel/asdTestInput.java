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

import com.hpe.caf.worker.testing.FileTestInputData;

/**
 * asdTestInput is a component of test item, and contains a worker task used to provide test work to a worker.
 */
public class asdTestInput extends FileTestInputData {

    /**
     * asdTask read in from the yaml test case and used as an input of test work to the worker.
     */
    private asdTask task;

    public asdTestInput() {
    }

    public asdTask getTask() {
        return task;
    }

    public void setTask(asdTask task) {
        this.task = task;
    }
}
