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
package org.soulwing.cas.server.domain;

import javax.enterprise.context.ApplicationScoped;

import org.soulwing.cas.server.Credential;
import org.soulwing.cas.server.CredentialFactory;

/**
 * A {@link CredentialFactory} that produces {@link CredentialBean} objects.
 *
 * @author Carl Harris
 */
@ApplicationScoped
public class CredentialBeanFactory implements CredentialFactory {

  /**
   * {@inheritDoc}
   */
  @Override
  public Credential newCredential() {
    return new CredentialBean();
  }

}
