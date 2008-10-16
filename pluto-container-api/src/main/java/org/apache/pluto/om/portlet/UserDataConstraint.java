/*
 * Copyright 2008 The Apache Software Foundation
 *
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
 */
package org.apache.pluto.om.portlet;

import java.util.Locale;

import org.apache.pluto.om.ElementFactoryList;

public interface UserDataConstraint {

	String NONE = "NONE";
	String INTEGRAL = "INTEGRAL";
	String CONFIDENTIAL = "CONFIDENTIAL";

	Description getDescription(Locale locale);
	ElementFactoryList<Description> getDescriptions();

	String getTransportGuarantee();
	void setTransportGuarantee(String transportGuarantee);
}