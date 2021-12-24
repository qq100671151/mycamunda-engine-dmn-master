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
package org.camunda.bpm.dmn.engine.impl.el;

import javax.el.ELContext;
import javax.el.ELResolver;

import org.camunda.bpm.engine.variable.context.VariableContext;

import de.odysseus.el.util.SimpleContext;

/**
 * @author Daniel Meyer
 *
 */
public class JuelElContextFactory {

  protected final ELResolver resolver;

  public JuelElContextFactory(ELResolver resolver) {
    this.resolver = resolver;
  }

  public ELContext createElContext(VariableContext variableContext) {
    SimpleContext elContext = new SimpleContext(resolver);
    elContext.putContext(VariableContext.class, variableContext);
    return elContext;
  }

}
