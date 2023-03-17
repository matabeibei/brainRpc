package com.brain.bei.rpc.client.net;

import com.brain.bei.rpc.common.domain.Service;

/**
 * 网络客户端---netty实现
 * @author Brain
 * @date 2023/3/16
 */
public class NettyNetClient implements NetClient{

  @Override
  public byte[] sendRequest(byte[] data, Service service) {
    return new byte[0];
  }
}
