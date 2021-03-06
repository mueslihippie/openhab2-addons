/**
 * Copyright (c) 2010-2019 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.toon.internal.api;

import java.util.List;

/**
 * The {@link DeviceConfigInfo} class defines the json object as received by the api.
 *
 * @author Jorg de Jong - Initial contribution
 */
public class DeviceConfigInfo {
    private List<DeviceConfig> device;

    public List<DeviceConfig> getDevice() {
        return device;
    }

    public void setDevice(List<DeviceConfig> device) {
        this.device = device;
    }
}
