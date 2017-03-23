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

import com.hpe.caf.worker.testing.*;
import com.hpe.caf.worker.testing.execution.AbstractTestControllerProvider;

/**
 * Class providing task factory, validation processor, save result processor, result preparation provider for running integration
 * tests.
 */
public class asdTestControllerProvider extends AbstractTestControllerProvider<asdConfiguration,
        asdTask, asdResult, asdTestInput, asdTestExpectation> {

    public asdTestControllerProvider() {
        super(asdConstants.WORKER_NAME, asdConfiguration::getOutputQueue, asdConfiguration.class, asdTask.class, asdResult.class, asdTestInput.class, asdTestExpectation.class);
    }

    /**
     * Return a task factory for creating tasks.
     * @param configuration
     * @return asdTaskFactory
     * @throws Exception
     */
    @Override
    protected WorkerTaskFactory<asdTask, asdTestInput, asdTestExpectation> getTaskFactory(TestConfiguration<asdTask, asdResult, asdTestInput, asdTestExpectation> configuration) throws Exception {
        return new asdTaskFactory(configuration);
    }

    /**
     * Return a result validation processor for validating the worker result is the same as the expected result in the test item.
     * @param configuration
     * @param workerServices
     * @return asdResultValidationProcessor
     */
    @Override
    protected ResultProcessor getTestResultProcessor(TestConfiguration<asdTask, asdResult, asdTestInput, asdTestExpectation> configuration, WorkerServices workerServices) {
        return new asdResultValidationProcessor(workerServices);
    }

    /**
     * Return a result preparation provider for preparing test items from YAML files.
     * @param configuration
     * @return asdResultPreparationProvider
     */
    @Override
    protected TestItemProvider getDataPreparationItemProvider(TestConfiguration<asdTask, asdResult, asdTestInput, asdTestExpectation> configuration) {
        return new asdResultPreparationProvider(configuration);
    }

    /**
     * Return a save result processor for generating .testcase and result.content files found in test-data > input folder.
     * @param configuration
     * @param workerServices
     * @return asdSaveResultProcessor
     */
    @Override
    protected ResultProcessor getDataPreparationResultProcessor(TestConfiguration<asdTask, asdResult, asdTestInput, asdTestExpectation> configuration, WorkerServices workerServices) {
        return new asdSaveResultProcessor(configuration, workerServices);
    }

}
