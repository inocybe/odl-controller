/*
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.controller.cluster.datastore.messages;

import org.opendaylight.controller.protobuff.messages.transaction.ShardTransactionChainMessages;

public class CloseTransactionChainReply implements SerializableMessage {
  public static final Class<ShardTransactionChainMessages.CloseTransactionChainReply> SERIALIZABLE_CLASS =
          ShardTransactionChainMessages.CloseTransactionChainReply.class;
  @Override
  public Object toSerializable() {
    return ShardTransactionChainMessages.CloseTransactionChainReply.newBuilder().build();
  }

}
