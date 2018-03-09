/*
 * File created on Sep 9, 2014 
 *
 * Copyright (c) Carl Harris, Jr.
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
 *
 */
package org.soulwing.cas.server.protocol;

import org.soulwing.cas.server.ProtocolError;
import org.soulwing.cas.server.ProxyFailureResponseBuilder;

/**
 * A simple {@link ProxyFailureResponseBuilder}.
 *
 * @author Carl Harris
 */
class SimpleProxyFailureResponseBuilder
    extends AbstractServiceResponseBuilder
    implements ProxyFailureResponseBuilder {

  private final ProxyFailure result = new ProxyFailure();
  
  /**
   * {@inheritDoc}
   */
  @Override
  public ProxyFailureResponseBuilder code(ProtocolError code) {
    result.code = code;
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public ProxyFailureResponseBuilder message(String message) {
    result.message = message;
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected ServiceResult getResult() {
    return result;
  }

}
