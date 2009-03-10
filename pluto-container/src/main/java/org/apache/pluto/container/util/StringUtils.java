/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.pluto.container.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Static class hosting a couple of utility methods around strings.
 */
public class StringUtils {

	// Private Constructor -----------------------------------------------------

	/**
	 * Private constructor that prevents external instantiation.
	 */
	private StringUtils() {
		// Do nothing.
	}


	// Static Utility Methods --------------------------------------------------

    /**
     * Deep-clones a parameter map. The key is the parameter name as a String
     * instance, while the value is a String array (String[]) instance.
     * @param parameters  the parameter map to deep-clone.
     * @return the deep-cloned parameter map.
     */
    public static Map<String, String[]> copyParameters(Map<String, String[]> parameters) {
        final Map<String, String[]> result = new HashMap<String, String[]>(parameters);
        for( final Map.Entry<String, String[]> entry : result.entrySet()) {
            entry.setValue(entry.getValue().clone());
        }
        return result;
    }

    /**
     * Strips the specified mime type by removing the character encoding
     * specified at the end of the mime type (all characters after the ';').
     * The stripped mime type is trimmed string which contains no white
     * spaces at the beginning and the end.
     * @param mimeType  the mime type to strip.
     * @return the stripped mime type.
     */
    public static String getMimeTypeWithoutEncoding(String mimeType) {
        int index = mimeType.indexOf(';');
        String strippedType = null;
        if (index == -1) {
            strippedType = mimeType;
        } else {
            strippedType = mimeType.substring(0, index);
        }
        return strippedType.trim();
    }
}