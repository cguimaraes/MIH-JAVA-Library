//==============================================================================
// Brief   : Device States Request TLV
// Authors : Carlos Guimarães <cguimaraes@av.it.pt>
//------------------------------------------------------------------------------
// ODTONE - Open Dot Twenty One
//
// Copyright (C) 2009-2013 Universidade Aveiro
// Copyright (C) 2009-2013 Instituto de Telecomunicações - Pólo Aveiro
//
// This software is distributed under a license. The full license
// agreement can be found in the file LICENSE in this distribution.
// This software may not be copied, modified, sold or distributed
// other than expressed in the named license agreement.
//
// This software is distributed without any warranty.
//==============================================================================

package mih.tlvs;

import mih.types.links.DevStatesReq;
import mih.types.basic.UnsignedInteger8;

public class DeviceStatesRequestTlv extends Tlv<DevStatesReq> {

	public DeviceStatesRequestTlv() {
		super(new UnsignedInteger8(24));
		value = new DevStatesReq();
	}

	public DeviceStatesRequestTlv(DevStatesReq value) {
		super(new UnsignedInteger8(24), value);
	}
}