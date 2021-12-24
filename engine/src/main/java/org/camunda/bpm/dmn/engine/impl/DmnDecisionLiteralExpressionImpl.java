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
package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.engine.DmnDecisionLogic;

public class DmnDecisionLiteralExpressionImpl implements DmnDecisionLogic {

  protected DmnVariableImpl variable;
  protected DmnExpressionImpl expression;

  public DmnVariableImpl getVariable() {
    return variable;
  }
  public void setVariable(DmnVariableImpl variable) {
    this.variable = variable;
  }
  public DmnExpressionImpl getExpression() {
    return expression;
  }
  public void setExpression(DmnExpressionImpl expression) {
    this.expression = expression;
  }

  @Override
  public String toString() {
    return "DmnDecisionLiteralExpressionImpl [variable=" + variable + ", expression=" + expression + "]";
  }

}
