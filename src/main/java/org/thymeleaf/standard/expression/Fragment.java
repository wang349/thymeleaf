/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2014, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.thymeleaf.standard.expression;

import java.util.Collections;
import java.util.Map;

import org.thymeleaf.model.IModel;


/**
 * 
 * @author Daniel Fern&aacute;ndez
 * 
 * @since 3.0.0
 *
 */
public final class Fragment {

    private final IModel model;
    private final Map<String,Object> parameters;


    public Fragment(final IModel model, final Map<String, Object> parameters) {
        this.model = model;
        this.parameters = Collections.unmodifiableMap(parameters);
    }


    public IModel getModel() {
        return this.model;
    }

    public Map<String, Object> getParameters() {
        return this.parameters;
    }


}
