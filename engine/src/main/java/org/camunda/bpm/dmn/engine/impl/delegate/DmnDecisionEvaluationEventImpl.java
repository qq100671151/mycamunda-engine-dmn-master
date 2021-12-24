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
package org.camunda.bpm.dmn.engine.impl.delegate;

import java.util.ArrayList;
import java.util.Collection;

import org.camunda.bpm.dmn.engine.DmnDecision;
import org.camunda.bpm.dmn.engine.delegate.DmnDecisionEvaluationEvent;
import org.camunda.bpm.dmn.engine.delegate.DmnDecisionLogicEvaluationEvent;

public class DmnDecisionEvaluationEventImpl implements DmnDecisionEvaluationEvent {

  protected DmnDecisionLogicEvaluationEvent decisionResult;
  protected Collection<DmnDecisionLogicEvaluationEvent> requiredDecisionResults = new ArrayList<DmnDecisionLogicEvaluationEvent>();
  protected long executedDecisionElements;

  public DmnDecisionLogicEvaluationEvent getDecisionResult() {
    return decisionResult;
  }

  public void setDecisionResult(DmnDecisionLogicEvaluationEvent decisionResult) {
    this.decisionResult = decisionResult;
  }

  public Collection<DmnDecisionLogicEvaluationEvent> getRequiredDecisionResults() {
    return requiredDecisionResults;
  }

  public void setRequiredDecisionResults(Collection<DmnDecisionLogicEvaluationEvent> requiredDecisionResults) {
    this.requiredDecisionResults = requiredDecisionResults;
  }

  public long getExecutedDecisionElements() {
    return executedDecisionElements;
  }

  public void setExecutedDecisionElements(long executedDecisionElements) {
    this.executedDecisionElements = executedDecisionElements;
  }

  @Override
  public String toString() {
    DmnDecision dmnDecision = decisionResult.getDecision();
    return "DmnDecisionEvaluationEventImpl{" +
      " key="+ dmnDecision.getKey() +
      ", name="+ dmnDecision.getName() +
      ", decisionLogic=" + dmnDecision.getDecisionLogic() +
      ", requiredDecisionResults=" + requiredDecisionResults +
      ", executedDecisionElements=" + executedDecisionElements +
      '}';
  }

}
