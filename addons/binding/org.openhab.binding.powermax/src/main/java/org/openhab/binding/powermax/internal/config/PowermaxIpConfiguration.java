/**
 * Copyright (c) 2010-2019 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.powermax.internal.config;

/**
 * The {@link PowermaxIpConfiguration} is responsible for holding
 * configuration informations associated to a Powermax IP thing type
 *
 * @author Laurent Garnier - Initial contribution
 */
public class PowermaxIpConfiguration {

    public String ip;
    public Integer tcpPort;
    public Integer motionOffDelay;
    public Boolean allowArming;
    public Boolean allowDisarming;
    public String pinCode;
    public Boolean forceStandardMode;
    public String panelType;
    public Boolean autoSyncTime;

}
