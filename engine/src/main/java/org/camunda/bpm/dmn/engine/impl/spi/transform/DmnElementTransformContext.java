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

import org.camunda.bpm.dmn.engine.DmnDecision;
import org.camunda.bpm.dmn.engine.impl.spi.hitpolicy.DmnHitPolicyHandlerRegistry;
import org.camunda.bpm.dmn.engine.impl.spi.type.DmnDataTypeTransformerRegistry;
import org.camunda.bpm.model.dmn.DmnModelInstance;

/**
 * Context available during the DMN transformation
 */
public interface DmnElementTransformContext {

  /**
   * @return the transformed DMN model instance
   */
  DmnModelInstance getModelInstance();

  /**
   * @return the already transformed parent of the current transformed element
   */
  Object getParent();

  /**
   * @return the already transformed decision to which the current transformed element belongs
   */
  DmnDecision getDecision();

  /**
   * @return the {@link DmnDataTypeTransformerRegistry} to use
   */
  DmnDataTypeTransformerRegistry getDataTypeTransformerRegistry();

  /**
   * @return the {@link DmnHitPolicyHandlerRegistry} to use
   */
  DmnHitPolicyHandlerRegistry getHitPolicyHandlerRegistry();

}
