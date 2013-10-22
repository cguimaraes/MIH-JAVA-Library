//==============================================================================
// Brief   : LIST(PK_LOSS_RATE) Data Type
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

package mih.types.qos.auxiliar;

import mih.types.Serializeable;
import mih.types.basic.List;
import mih.types.qos.PkLossRate;

public class ListPkLossRate extends List<PkLossRate> implements Serializeable {

	public ListPkLossRate() {
		super(PkLossRate.class);
	}

	public ListPkLossRate(ListPkLossRate value) {
		super(value);
	}
}