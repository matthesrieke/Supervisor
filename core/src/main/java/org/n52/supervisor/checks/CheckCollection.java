/**
 * ﻿Copyright (C) 2013 52°North Initiative for Geospatial Open Source Software GmbH
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

package org.n52.supervisor.checks;

import javax.xml.bind.annotation.XmlRootElement;

import org.n52.supervisor.api.Check;

/**
 * 
 * @author Daniel
 * 
 */
@XmlRootElement
public class CheckCollection extends Check {

    protected String type = "CheckCollection";

    public CheckCollection() {
        super();
    }

    public CheckCollection(String identifier) {
        super(identifier);
    }

}
