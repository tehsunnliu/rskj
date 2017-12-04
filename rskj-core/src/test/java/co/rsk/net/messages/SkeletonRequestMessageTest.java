/*
 * This file is part of RskJ
 * Copyright (C) 2017 RSK Labs Ltd.
 * (derived from ethereumJ library, Copyright (c) 2016 <ether.camp>)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package co.rsk.net.messages;

import org.ethereum.crypto.HashUtil;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.spongycastle.util.encoders.Hex.decode;
import static org.spongycastle.util.encoders.Hex.toHexString;

public class SkeletonRequestMessageTest {

    @Test
    public void createMessage() {
        long id = 42;
        long startNumber = 18;
        SkeletonRequestMessage message = new SkeletonRequestMessage(id, startNumber);

        assertEquals(MessageType.SKELETON_REQUEST_MESSAGE, message.getMessageType());
        assertEquals(id, message.getId());
        assertEquals(startNumber, message.getStartNumber());
    }
}
