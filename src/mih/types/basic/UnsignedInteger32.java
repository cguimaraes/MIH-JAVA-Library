//==============================================================================
// Brief   : UNSIGNED_INT(4) Data Type
// Authors : Carlos Guimarães <cguimaraes@av.it.pt>
//------------------------------------------------------------------------------
// ODTONE - Open Dot Twenty One
//
// Copyright (C) 2013 Universidade Aveiro
// Copyright (C) 2013 Instituto de Telecomunicações - Pólo Aveiro
//
// This file is part of MIH-JAVA-Library.
//
// MIH-JAVA-Library is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 2.1 of the License, or
// (at your option) any later version.
//
// MIH-JAVA-Library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with MIH-JAVA-Library. If not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
//==============================================================================

package mih.types.basic;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import mih.types.Serializeable;

public class UnsignedInteger32 implements Serializeable {

	public UnsignedInteger32(long value) {
		this.value = value & 0xffffffff;
	}

	public UnsignedInteger32(UnsignedInteger32 value) {
		this.value = value.value;
	}

	public UnsignedInteger32() {
		this.value = 0;
	}

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value & 0xffffffff;
	}

	public void toBytes(ByteArrayOutputStream stream) {
		stream.write((int) ((value >> 24) & 0xff));
		stream.write((int) ((value >> 16) & 0xff));
		stream.write((int) ((value >> 8) & 0xff));
		stream.write((int)  (value       & 0xff));
	}

	public void fromBytes(ByteArrayInputStream stream) {
		value = 0;
		value |= stream.read() << 24;
		value |= stream.read() << 16;
		value |= stream.read() << 8;
		value |= stream.read();
	}

	private long value;
}