/*  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

/*
 * This source code implements specifications defined by the Java
 * Community Process. In order to remain compliant with the specification
 * DO NOT add / change / or delete method signatures!
 */
package javax.portlet.annotations;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;


/**
 * <div class='changed_added_3_0'>
 * This annotation is used within composite portlet configuration annotations to
 * represent a single security role reference.
 * It cannot be used as a stand-alone portlet annotation.
 * </div>
 */
@Retention(RUNTIME) @Target({ANNOTATION_TYPE})
public @interface SecurityRoleRef {
   
   /**
    * <div class='container-change'>
    * The role name.
    * </div>
    * 
    * @return  The role name
    */
   String      roleName();
   
   /**
    * <div class='container-change'>
    * The application role that the role name is mapped to. 
    * </div>
    * 
    * @return  The role link
    */
   String      roleLink() default "";
   
   /**
    * <div class='container-change'>
    * The security role ref description.
    * It provides locale-specific text describing the security role ref for use by the portal application or by tools.
    * </div>
    * 
    * @return  The security role reference description
    */
   LocaleString[]   description() default {};
}
