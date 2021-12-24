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
package org.camunda.bpm.dmn.engine.impl.spi.el;

import javax.script.ScriptEngine;

/**
 * Resolver for available script engines.
 */
public interface DmnScriptEngineResolver {

  /**
   * Get a script engine by script engine language.
   *
   * @param language the language of the script engine
   * @return the script engine or null if no script engine for this language exists
   */
  ScriptEngine getScriptEngineForLanguage(String language);

}

