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
package org.apache.pluto.container.driver;

import javax.portlet.PortalContext;

import org.apache.pluto.container.CCPPProfileService;
import org.apache.pluto.container.ContainerInvocationService;
import org.apache.pluto.container.ContainerServices;
import org.apache.pluto.container.EventCoordinationService;
import org.apache.pluto.container.NamespaceMapper;
import org.apache.pluto.container.PortalCallbackService;
import org.apache.pluto.container.PortletEnvironmentService;
import org.apache.pluto.container.PortletInfoService;
import org.apache.pluto.container.PortletInvokerService;
import org.apache.pluto.container.PortletPreferencesService;
import org.apache.pluto.container.PortletRequestContextService;
import org.apache.pluto.container.UserInfoService;


public class PlutoServices implements ContainerServices
{
    private ContainerServices provider;
    
    private static PlutoServices singleton;

    public static PlutoServices getServices()
    {
        return singleton;
    }
    
    public PlutoServices(ContainerServices provider)
    {
        singleton = this;
        this.provider = provider;
    }
    public CCPPProfileService getCCPPProfileService()
    {
        return provider.getCCPPProfileService();
    }

    public ContainerInvocationService getContainerInvocationService()
    {
        return provider.getContainerInvocationService();
    }

    public PortalCallbackService getPortalCallbackService()
    {
        return provider.getPortalCallbackService();
    }

    public PortalContext getPortalContext()
    {
        return provider.getPortalContext();
    }

    public NamespaceMapper getNamespaceMapper()
    {
        return provider.getNamespaceMapper();
    }

    public PortalAdministrationService getPortalAdministrationService()
    {
        return provider.getPortalAdministrationService();
    }

    public PortletEnvironmentService getPortletEnvironmentService()
    {
        return provider.getPortletEnvironmentService();
    }

    public PortletInfoService getPortletInfoService()
    {
        return provider.getPortletInfoService();
    }

    public PortletInvokerService getPortletInvokerService()
    {
        return provider.getPortletInvokerService();
    }

    public PortletPreferencesService getPortletPreferencesService()
    {
        return provider.getPortletPreferencesService();
    }

    public PortletRegistryService getPortletRegistryService()
    {
        return provider.getPortletRegistryService();
    }

    public UserInfoService getUserInfoService()
    {
        return provider.getUserInfoService();
    }
    
    public PortletContextService getPortletContextService()
    {
        return provider.getPortletContextService();
    }

    public PortletRequestContextService getPortletRequestContextService()
    {
        return provider.getPortletRequestContextService();
    }

    public EventCoordinationService getEventCoordinationService()
    {
        return provider.getEventCoordinationService();
    }
}
