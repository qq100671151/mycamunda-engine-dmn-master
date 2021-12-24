/*
 * Copyright © 2015 - 2018 camunda services GmbH and various authors (info@camunda.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.bpm.dmn.engine.impl.spi.transform;

import org.camunda.bpm.model.dmn.instance.DmnModelElementInstance;

/**
 * Handler to transform a DMN model element.
 *
 * @param <Source> the type of the transformation input
 * @param <Target> the type of the transformation output
 */
public interface DmnElementTransformHandler<Source extends DmnModelElementInstance, Target> {

  /**
   * Transform a DMN model element
   *
   * @param context the transformation context
   * @param element the source element
   * @return the transformed element
   */
  Target handleElement(DmnElementTransformContext context, Source element);

}
