/*
 * -\-\-
 * Spotify Styx Common
 * --
 * Copyright (C) 2016 Spotify AB
 * --
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
 * -/-/-
 */
package com.spotify.styx.publisher;

import com.spotify.styx.model.ExecutionDescription;
import com.spotify.styx.model.WorkflowInstance;

import java.io.IOException;

class NoopPublisher implements Publisher {

  @Override
  public void deploying(
      WorkflowInstance workflowInstance, ExecutionDescription executionDescription)
      throws IOException {
  }

  @Override
  public void deployed(
      WorkflowInstance workflowInstance, ExecutionDescription executionDescription)
      throws IOException {
  }
}
